package com.cybertpet.dawi_cl3_quispe_edson.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cybertpet.dawi_cl3_quispe_edson.Model.Mascotas;
import com.cybertpet.dawi_cl3_quispe_edson.Model.Tipo;
import com.cybertpet.dawi_cl3_quispe_edson.Repository.iMascotasRepository;
import com.cybertpet.dawi_cl3_quispe_edson.Repository.iTipoRepository;

@Controller
public class HomeController {
    @Autowired
    private iMascotasRepository iMascotasRepository;
    private iTipoRepository iTipoRepository;

    @GetMapping({ "/", "/menu" })
    public String menuQuispe() {
        return "menuQuispe";
    }

    @GetMapping(value = "/registrar")
    public String registrar(Model model) {
        List<Tipo> tipos = iTipoRepository.findAll();
        Mascotas mascotas = new Mascotas();

        model.addAttribute("mascota", mascotas);
        model.addAttribute("tipo", tipos);
        return "registroQuispe";
    }

    @PostMapping(value = "/registrar")
    public String registrar(@Validated @ModelAttribute(name = "tb_mascotas") Mascotas mascotas,
            BindingResult result,
            RedirectAttributes RedirectAttributes,
            Model model) {
        if (result.hasErrors()) {
            List<Tipo> tipos = iTipoRepository.findAll();
            model.addAttribute("tipos", tipos);

            return "registroQuispe";
        }

        iMascotasRepository.save(mascotas);
        RedirectAttributes.addFlashAttribute("mensaje", "Cita agregada correctamente");

        return "redirect:/registrar";
    }

    @GetMapping("/report")
    public String generateReport(Model model) {
        List<Mascotas> mascotas = iMascotasRepository.findAll();

        // Preparar los datos para el gráfico de barras
        Map<String, Integer> chartData = new HashMap<>();
        for (Mascotas mascota : mascotas) {
            String label = mascota.getLabel();
            
            int value = mascota.getValue();
            chartData.put(label, value);
        }

        // Pasar los datos al modelo
        model.addAttribute("chartData", chartData);

        return "report"; // nombre de la vista (report.html)
    }
}
