package com.cybertpet.dawi_cl3_quispe_edson.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybertpet.dawi_cl3_quispe_edson.Model.Tipo;

@Repository
public interface iTipoRepository extends JpaRepository<Tipo, Integer> {

}
