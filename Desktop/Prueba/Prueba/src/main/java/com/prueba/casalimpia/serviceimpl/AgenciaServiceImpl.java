package com.prueba.casalimpia.serviceimpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.casalimpia.entity.Agencia;
import com.prueba.casalimpia.repository.AgenciaDao;
import com.prueba.casalimpia.service.AgenciaService;

@Service
public class AgenciaServiceImpl implements AgenciaService {

	
	@Autowired //instancia repositorio
	private AgenciaDao agenciasDao;



	@Override
	public void registerData(HttpServletRequest request, HttpServletResponse response) {

		try {
			String AgNombre = request.getParameter("nombre");
			String AgNit = request.getParameter("nit");
			String AgTelefono = request.getParameter("telefono");
			String AgDireccion = request.getParameter("direccion");

			Agencia Agencias = new Agencia();
			Agencias.setAgNombre(AgNombre);
			Agencias.setAgNit(AgNit);
			Agencias.setAgTelefono(AgTelefono);
			Agencias.setAgDireccion(AgDireccion);

			agenciasDao.save(Agencias);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("RegistroExitoso.jsp");
			dispatcher.forward(request, response);
		}catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}
	}

	
}
