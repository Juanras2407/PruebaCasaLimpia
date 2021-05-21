package com.prueba.casalimpia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.casalimpia.entity.Oferta;

@Repository
public interface OfertaDao extends JpaRepository<Oferta, String> {

	
	//Retorna un listado ofertas que NO tengan más de 5 dias de vencidas
		//	@Query("SELECT t FROM oferta t WHERE t.o_Fecha_Fin >=  date_add(NOW(), INTERVAL -5 DAY)")
		  //  public List<Oferta> findOfertaValid ();
}
