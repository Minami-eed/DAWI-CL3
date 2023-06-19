package com.cybertpet.dawi_cl3_quispe_edson.Service;

import java.util.List;

import com.cybertpet.dawi_cl3_quispe_edson.Model.Mascotas;

public interface IMascotasService {
    void guardarMascota(Mascotas mascotas);

    List<Mascotas> obtenerMascotas();

    public Mascotas buscarMascotasPorID(int cod_mascota);

    public void eliminarMascota(int cod_mascota);
}
