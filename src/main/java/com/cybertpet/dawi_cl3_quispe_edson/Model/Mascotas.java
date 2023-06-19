package com.cybertpet.dawi_cl3_quispe_edson.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_mascotas")
public class Mascotas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_mascota")
    private int cod_mascota;

    @Column(name = "nom_mascota")
    private String nom_mascota;

    @JoinColumn(name = "cod_tipo")
    private int cod_tipo;

    @Column(name = "peso_mascota")
    private double peso_mascota;

    @Column(name = "fch_nacimiento")
    private Date fch_nacimiento;

    public int getCod_mascota() {
        return cod_mascota;
    }

    public void setCod_mascota(int cod_mascota) {
        this.cod_mascota = cod_mascota;
    }

    public String getNom_mascota() {
        return nom_mascota;
    }

    public void setNom_mascota(String nom_mascota) {
        this.nom_mascota = nom_mascota;
    }

    public int getCod_tipo() {
        return cod_tipo;
    }

    public void setCod_tipo(int cod_tipo) {
        this.cod_tipo = cod_tipo;
    }

    public double getPeso_mascota() {
        return peso_mascota;
    }

    public void setPeso_mascota(double peso_mascota) {
        this.peso_mascota = peso_mascota;
    }

    public Date getFch_nacimiento() {
        return fch_nacimiento;
    }

    public void setFch_nacimiento(Date fch_nacimiento) {
        this.fch_nacimiento = fch_nacimiento;
    }

    @Override
    public String toString() {
        return "Mascotas [cod_mascota=" + cod_mascota + ", nom_mascota=" + nom_mascota + ", cod_tipo=" + cod_tipo
                + ", peso_mascota=" + peso_mascota + ", fch_nacimiento=" + fch_nacimiento + "]";
    }
}
