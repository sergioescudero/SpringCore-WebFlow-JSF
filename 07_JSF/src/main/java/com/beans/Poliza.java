package com.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="Poliza")
public class Poliza {
	
	
	private int id;
	private Persona persona;
	private Moto moto;
	private Coche coche;
	private Hogar hogar;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Moto getMoto() {
		return moto;
	}
	public void setMoto(Moto moto) {
		this.moto = moto;
	}
	public Coche getCoche() {
		return coche;
	}
	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	public Hogar getHogar() {
		return hogar;
	}
	public void setHogar(Hogar hogar) {
		this.hogar = hogar;
	}
}
