package com.prueba.casalimpia.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="oferta")
@Table(name="tb_oferta")
public class Oferta implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="IdOferta",length=11)
	private long idOferta;
	
	@Column(name = "O_Nombre",length=50)
	private  String o_Nombre;
	
	@Column(name = "O_Descripcion")
	private String o_Descripcion;
	
	@Column(name = "O_Fecha_Inicio")
	private Date o_Fecha_Inicio;
	
	@Column(name = "O_Fecha_Fin")
	private Date o_Fecha_Fin;

	public long getIdOferta() {
		return idOferta;
	}

	public void setIdOferta(long idOferta) {
		this.idOferta = idOferta;
	}

	public String getO_Nombre() {
		return o_Nombre;
	}

	public void setO_Nombre(String o_Nombre) {
		this.o_Nombre = o_Nombre;
	}

	public String getO_Descripcion() {
		return o_Descripcion;
	}

	public void setO_Descripcion(String o_Descripcion) {
		this.o_Descripcion = o_Descripcion;
	}

	public Date getO_Fecha_Inicio() {
		return o_Fecha_Inicio;
	}

	public void setO_Fecha_Inicio(Date o_Fecha_Inicio) {
		this.o_Fecha_Inicio = o_Fecha_Inicio;
	}

	public Date getO_Fecha_Fin() {
		return o_Fecha_Fin;
	}

	public void setO_Fecha_Fin(Date o_Fecha_Fin) {
		this.o_Fecha_Fin = o_Fecha_Fin;
	}
	
	
	

}
