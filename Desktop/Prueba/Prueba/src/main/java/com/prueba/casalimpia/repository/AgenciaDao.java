package com.prueba.casalimpia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prueba.casalimpia.entity.Agencia;

@Repository
public interface AgenciaDao extends JpaRepository<Agencia, String> {
	

	
	
	
//	public void guardarAgencia(Agencias user) {
//		Transaction transaccion = null;
//		try (Session session = hibernateUtilidadesAgencias.getSessionFactory().openSession()) {
//			// inicia transaccion
//			transaccion = session.beginTransaction();
//			// guarda e objeto
//			session.save(user);
//			// escribe la transaccion
//			transaccion.commit();
//		} catch (Exception e) {
//			if (transaccion != null) {
//				transaccion.rollback();
//			}
//			e.printStackTrace();
//		}
//	}

}

