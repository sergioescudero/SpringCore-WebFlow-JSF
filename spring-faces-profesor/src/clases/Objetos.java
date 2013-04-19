package clases;

import java.io.Serializable;

public class Objetos implements Serializable {

	private Usuarios usuarios;

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}
}
