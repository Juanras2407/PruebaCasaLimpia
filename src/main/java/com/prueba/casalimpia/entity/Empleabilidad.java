package com.prueba.casalimpia.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity(name="empleabilidad")
@Table(name="tb_empleabilidad")
public class Empleabilidad implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id",length=11)
	private long id;
	
	@Column(name="IdAspirante",length=11)
	private  long idAspirante;
	
	@Column(name="IdOferta",length=11)
	private long idOferta;
	
	@Column(name="EFecha")
	private Date efecha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdAspirante() {
		return idAspirante;
	}

	public void setIdAspirante(long idAspirante) {
		this.idAspirante = idAspirante;
	}

	public long getIdOferta() {
		return idOferta;
	}

	public void setIdOferta(long idOferta) {
		this.idOferta = idOferta;
	}

	public Date getEfecha() {
		return efecha;
	}

	public void setEfecha(Date efecha) {
		this.efecha = efecha;
	}
	
	
}
