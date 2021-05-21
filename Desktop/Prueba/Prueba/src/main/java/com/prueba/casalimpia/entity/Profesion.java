package com.prueba.casalimpia.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="profesion")
@Table(name="tb_profesion")
public class Profesion implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="IdProfesion",length=11)
	private long idProfesion;
	
	@Column(name="P_Nombre",length=30)
	private  String pNombre;

	public long getIdProfesion() {
		return idProfesion;
	}

	public void setIdProfesion(long idProfesion) {
		this.idProfesion = idProfesion;
	}

	public String getPNombre() {
		return pNombre;
	}

	public void setPNombre(String pNombre) {
		this.pNombre = pNombre;
	}

}
