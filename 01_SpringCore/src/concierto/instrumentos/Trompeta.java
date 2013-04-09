package concierto.instrumentos;

import concierto.excepciones.SinsonidoException;
import concierto.interfaces.Instrumento;

public class Trompeta implements Instrumento {


	private Integer precio;
	private String sonido;
	
	@Override
	public String sonar() throws SinsonidoException {
		if (getSonido().equalsIgnoreCase("nada")){
			throw new SinsonidoException();
		}
		return getSonido();
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	

	
}
