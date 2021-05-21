package com.prueba.casalimpia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prueba.casalimpia.entity.Aspirante;

@Repository
public interface AspiranteDao extends JpaRepository<Aspirante, String> {
	// Retorna un listado de aspirantes cuyo nombre inicia por la letra indicada
	@Query("SELECT t FROM aspirante t WHERE t.asNombre LIKE ':letra%'")
	public List<Aspirante> findAspiranteByLetter(@Param("letra") String letra);

	// Retorna un listado de aspirantes filtrado por genero y profesion
	@Query("SELECT t FROM aspirante t WHERE t.genero = :genero AND t.profesion= :profesion'")
	public List<Aspirante> findAspiranteByGenreProf(@Param("genero") String genero, @Param("profesion") int profesion);

	// Retorna un registro del aspirante con mayor edad
	@Query("SELECT t FROM aspirante t  WHERE edad= (SELECT MAX(edad) from aspirante)'")
	public Aspirante findAspiranteOld();

	// Retorna un listado de aspirantes filtrado profesion
	@Query("SELECT t FROM aspirante t WHERE t.profesion= :profesion'")
	public List<Aspirante> findAspiranteByProf(@Param("profesion") int profesion);

	
}
