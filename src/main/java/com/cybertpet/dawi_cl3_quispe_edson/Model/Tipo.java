package com.cybertpet.dawi_cl3_quispe_edson.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo")
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_tipo")
    private int cod_tipo;

    @Column(name = "nom_tipomascota")
    private String nom_tipomascota;

    public int getCod_tipo() {
        return cod_tipo;
    }

    public void setCod_tipo(int cod_tipo) {
        this.cod_tipo = cod_tipo;
    }

    public String getNom_tipomascota() {
        return nom_tipomascota;
    }

    public void setNom_tipomascota(String nom_tipomascota) {
        this.nom_tipomascota = nom_tipomascota;
    }
}
