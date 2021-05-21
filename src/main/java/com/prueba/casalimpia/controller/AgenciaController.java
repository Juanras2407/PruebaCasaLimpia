package com.prueba.casalimpia.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prueba.casalimpia.service.AgenciaService;

@Controller
@RequestMapping("/formularioAgencia") // crea URL para llamar al servicio de agencia
public class AgenciaController {

	@Autowired // instancia del servicio agencia
	private AgenciaService agenciaService;

	@RequestMapping(method = RequestMethod.GET)
	public String showLoginPage() {
		return ("FormularioAgencia");
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String registerData(HttpServletRequest request, HttpServletResponse response) throws Exception {

		try {
			agenciaService.registerData(request, response);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return ("RegistroExitoso");
	}

}
