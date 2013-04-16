package com.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="personacarnet")
public class TipoCarnetPersona {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne (targetEntity=com.beans.Persona.class)
	@JoinColumn (name="idPersona")
	private int idPersona;
	
	@ManyToOne (targetEntity=com.beans.TipoCarnet.class)
	@JoinColumn (name="idCarnet")
	private int idCarnet;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public int getIdCarnet() {
		return idCarnet;
	}
	public void setIdCarnet(int idCarnet) {
		this.idCarnet = idCarnet;
	}
}
