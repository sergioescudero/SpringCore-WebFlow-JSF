package concierto.teatro;

import concierto.excepciones.SinsonidoException;
import concierto.instrumentos.Tambor;
import concierto.musicos.Solista;

public class ConciertoSolista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tambor tambor = new Tambor();
		
		tambor.setSonido("pom, pom, pom, pim");
		
		Solista solista = new Solista();
		solista.setInstrumento(tambor);
		try {
			solista.tocar();
		} catch (SinsonidoException e) {
			
			System.out.println("El instrumento no suena");
		}
		
		

	}

}
