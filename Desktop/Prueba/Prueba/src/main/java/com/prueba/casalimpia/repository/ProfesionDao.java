package com.prueba.casalimpia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prueba.casalimpia.entity.Profesion;


@Repository 
public interface ProfesionDao extends JpaRepository<Profesion, String> {

	@Query("SELECT t FROM profesion t WHERE t.pNombre = :profesion")
    public Profesion findProfesion (@Param("profesion") String profesion);	
	
}
