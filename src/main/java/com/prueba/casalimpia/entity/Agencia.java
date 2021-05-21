package com.prueba.casalimpia.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name="agencia")
@Table(name="tb_agencia")
public class Agencia implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="IdAgencia",length=11)
	private long idAgencia;
	
	@Column(name="Ag_Nombre",length=50)
	private String agNombre;
	
	@Column(name="Ag_Nit",length=50)
	private String agNit;
	
	@Column(name="Ag_Telefono",length=16)
	private String agTelefono;
	
	@Column(name="Ag_Direccion",length=50)
	private String agDireccion;

	
	public long getIdAgencia() {
		return idAgencia;
	}
	
	public long setIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}

	public String getAgNombre() {
		return agNombre;
	}

	public void setAgNombre(String agNombre) {
		this.agNombre = agNombre;
	}

	public String getAgNit() {
		return agNit;
	}

	public void setAgNit(String agNit) {
		this.agNit = agNit;
	}

	public String getAgTelefono() {
		return agTelefono;
	}

	public void setAgTelefono(String agTelefono) {
		this.agTelefono = agTelefono;
	}

	public String getAgDireccion() {
		return agDireccion;
	}

	public void setAgDireccion(String agDireccion) {
		this.agDireccion = agDireccion;
	}
	
	
	
}
