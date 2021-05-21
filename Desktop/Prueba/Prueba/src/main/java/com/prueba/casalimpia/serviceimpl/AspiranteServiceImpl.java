package com.prueba.casalimpia.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.casalimpia.entity.Aspirante;
import com.prueba.casalimpia.entity.Profesion;
import com.prueba.casalimpia.repository.AgenciaDao;
import com.prueba.casalimpia.repository.AspiranteDao;
import com.prueba.casalimpia.repository.ProfesionDao;
import com.prueba.casalimpia.service.AspiranteService;

@Service
public class AspiranteServiceImpl implements AspiranteService {
	
	@Autowired
	private AspiranteDao aspirantesDao;
	@Autowired
	private ProfesionDao profesionDao;
	@Autowired
	private AgenciaDao agenciasDao;



	@Override
	public void registerData(HttpServletRequest request, HttpServletResponse response) {

		try {
			String AsNombre = request.getParameter("nombre");
			String AsCedula = request.getParameter("cedula");
			String AsEdad = request.getParameter("edad");
			String AsGenero = request.getParameter("genero");
			Profesion prof= profesionDao.findProfesion(request.getParameter("profesion"));
			Long IdProfesion  = prof.getIdProfesion();
			Random r = new Random();
			int valorDado = r.nextInt(3)+1;
			int IdAgencia = valorDado;
			Aspirante Aspirantes = new Aspirante();
			Aspirantes.setAsNombre(AsNombre);
			Aspirantes.setAsCedula(AsCedula);
			Aspirantes.setEdad(AsEdad);
			Aspirantes.setGenero(AsGenero);
			Aspirantes.setIdProfesion(IdProfesion.intValue());
			Aspirantes.setIdAgencia(IdAgencia);

			aspirantesDao.save(Aspirantes);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("RegistroExitoso.jsp");
			dispatcher.forward(request, response);
			
		}catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
	@Override
	public List<Aspirante> getByLetter(HttpServletRequest request, HttpServletResponse response) {
		List<Aspirante> Aspirantes = new ArrayList<Aspirante>();
		try {
			
			String letra = request.getParameter("letra");
			
			Aspirantes= aspirantesDao.findAspiranteByLetter(letra); 
			RequestDispatcher dispatcher = request.getRequestDispatcher("register-success.jsp");
			dispatcher.forward(request, response);
			
		}catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}
		return Aspirantes;
	}

	
}
