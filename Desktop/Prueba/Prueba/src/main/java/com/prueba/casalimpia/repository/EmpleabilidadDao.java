package com.prueba.casalimpia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.casalimpia.entity.Empleabilidad;

@Repository
public interface EmpleabilidadDao extends JpaRepository<Empleabilidad, String> {

}
