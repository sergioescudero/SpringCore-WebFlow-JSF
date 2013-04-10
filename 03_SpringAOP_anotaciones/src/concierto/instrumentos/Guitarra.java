package concierto.instrumentos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import concierto.excepciones.SinsonidoException;
import concierto.interfaces.Instrumento;

@Component
public class Guitarra implements Instrumento {


	@Value ("tra traa")
	private String sonido;
	
	private Integer precio;
	
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
