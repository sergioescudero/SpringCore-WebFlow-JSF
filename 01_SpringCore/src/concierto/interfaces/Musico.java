package concierto.interfaces;

import concierto.excepciones.SinsonidoException;

public interface Musico {
	public void tocar()  throws SinsonidoException;
}
