package com.beans;

public class Login {

	private Integer id;
	private String usuario;
	private String clave;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
	public String validar(){
		if (usuario.equalsIgnoreCase(clave)){
			return "OK";
		}
		return "KO";
	}
	
	public Persona getPersona(){
		Persona persona = new Persona();
		
		persona.setNombre("Probatino");
		persona.setApellidos("De la Fuente");
		persona.setDni("55888999X");
		
		return persona;
	}
	
}
