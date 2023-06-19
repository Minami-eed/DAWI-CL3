package com.cybertpet.dawi_cl3_quispe_edson.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybertpet.dawi_cl3_quispe_edson.Model.Tipo;
import com.cybertpet.dawi_cl3_quispe_edson.Repository.iTipoRepository;

@Service
public class ITipoServiceImpl implements ITipoService {

    @Autowired
    iTipoRepository iTipoRepository;
    Tipo tipo;

    @Override
    public void guardarTipo(Tipo tipo) {
        tipo.setCod_tipo(1);
        iTipoRepository.save(tipo);
    }

    @Override
    public List<Tipo> obtenerTipo() {
        return iTipoRepository.findAll();
    }

    @Override
    public Tipo buscarTipoPorID(int cod_tipo) {
        return iTipoRepository.findById(cod_tipo).orElse(null);
    }

    @Override
    public void eliminarTipo(int cod_tipo) {
        tipo = iTipoRepository.findById(cod_tipo).orElse(null);
        if (tipo != null) {
            tipo.setCod_tipo(0);
            iTipoRepository.save(tipo);
        }
    }

}
