package com.beans;

import java.util.Date;

public class Login {
	private String usuario;
	private String clave;
	private Date fecha;
	
	public String validar(){
		
		if (!getUsuario().equalsIgnoreCase(getClave())){
			return "KO";
		}
		
		return "OK";
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
