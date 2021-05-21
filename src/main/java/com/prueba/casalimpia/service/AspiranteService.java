package com.prueba.casalimpia.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prueba.casalimpia.entity.Aspirante;

public interface AspiranteService {

	void registerData(HttpServletRequest request, HttpServletResponse response);
	
	List<Aspirante> getByLetter(HttpServletRequest request, HttpServletResponse response);

}
