package concierto.interfaces;

import concierto.excepciones.SinsonidoException;

public interface Instrumento {

	public String sonar() throws SinsonidoException;
}
