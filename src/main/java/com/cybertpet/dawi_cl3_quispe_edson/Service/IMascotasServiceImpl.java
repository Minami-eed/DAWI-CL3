package com.cybertpet.dawi_cl3_quispe_edson.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybertpet.dawi_cl3_quispe_edson.Model.Mascotas;
import com.cybertpet.dawi_cl3_quispe_edson.Repository.iMascotasRepository;

@Service
public class IMascotasServiceImpl implements IMascotasService {

    @Autowired
    iMascotasRepository iMascotasRepository;

    @Override
    public void guardarMascota(Mascotas mascotas) {
        mascotas.setCod_tipo(1);
        iMascotasRepository.save(mascotas);
    }

    @Override
    public List<Mascotas> obtenerMascotas() {
        return iMascotasRepository.findAll();
    }

    @Override
    public Mascotas buscarMascotasPorID(int cod_mascota) {
        return iMascotasRepository.findById(cod_mascota).orElse(null);
    }

    @Override
    public void eliminarMascota(int cod_mascota) {
        Mascotas mas;
        mas = iMascotasRepository.findById(cod_mascota).orElse(null);
        if (mas != null) {
            mas.setCod_tipo(0);
            iMascotasRepository.save(mas);
        }
    }

}
