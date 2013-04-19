package clases;

import java.io.Serializable;


public class Usuarios implements Serializable{
	
	

	private String usuario;

	private String clave;

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
	public String validar()
	{
		System.out.println("usuario:"+getUsuario());
		System.out.println("clave:"+getClave());
		return "ok";
		
	}
	public void getFlujo()
	{
		
	}
}
