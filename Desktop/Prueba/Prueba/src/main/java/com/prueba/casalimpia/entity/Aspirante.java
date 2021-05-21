package com.prueba.casalimpia.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity(name="aspirante")
@Table(name="tb_aspirante")
public class Aspirante  implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="IdAspirante",length=11)
	private long idAspirante;
	
	@Column(name="As_Nombre",length=50)
	private String asNombre;
	
	@Column(name="As_Cedula",length=50)
	private String asCedula;
	
	@Column(name="As_Edad",length=2)
	private String edad;
	
	@Column(name="As_Genero",length=1)
	private String genero;
	
	@Column(name="IdProfesion",length=11)
	private int idProfesion;
	
	@Column(name="IdAgencia",nullable=true,length=11)
	private int idAgencia;

	public long getIdAspirante() {
		return idAspirante;
	}

	public void setIdAspirante(long idAspirante) {
		this.idAspirante = idAspirante;
	}

	public String getAsNombre() {
		return asNombre;
	}

	public void setAsNombre(String asNombre) {
		this.asNombre = asNombre;
	}

	public String getAsCedula() {
		return asCedula;
	}

	public void setAsCedula(String asCedula) {
		this.asCedula = asCedula;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdProfesion() {
		return idProfesion;
	}

	public void setIdProfesion(int idProfesion) {
		this.idProfesion = idProfesion;
	}

	public int getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}	
	
	

}
