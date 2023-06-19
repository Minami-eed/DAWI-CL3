package com.cybertpet.dawi_cl3_quispe_edson.Service;

import java.util.List;

import com.cybertpet.dawi_cl3_quispe_edson.Model.Tipo;

public interface ITipoService {
    void guardarTipo(Tipo tipo);

    List<Tipo> obtenerTipo();

    public Tipo buscarTipoPorID(int cod_tipo);

    public void eliminarTipo(int cod_tipo);
}
