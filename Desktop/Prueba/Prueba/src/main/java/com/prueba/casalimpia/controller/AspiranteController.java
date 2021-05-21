package com.prueba.casalimpia.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prueba.casalimpia.service.AspiranteService;

@Controller
@RequestMapping("/formularioAspirante")
public class AspiranteController {

	@Autowired // instancia el servicio aspiranteService
	private AspiranteService aspiranteService;

	@RequestMapping(method = RequestMethod.GET)
	public String showLoginPage() {
		return ("FormularioAspirante");
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String registerData(HttpServletRequest request, HttpServletResponse response) throws Exception {

		try {
			aspiranteService.registerData(request, response);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			
		
			
		}
		return ("RegistroExitoso");
	}

}
