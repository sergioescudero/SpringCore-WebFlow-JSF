package concierto.teatro;

import java.util.ArrayList;
import java.util.List;

import concierto.excepciones.SinsonidoException;
import concierto.instrumentos.Guitarra;
import concierto.instrumentos.Tambor;
import concierto.instrumentos.Trompeta;
import concierto.interfaces.Instrumento;
import concierto.musicos.HombreOrquesta;

public class ConciertoHombreOrquesta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tambor tambor = new Tambor();
		tambor.setSonido("pom pom pom");
		
		Guitarra guitarra = new Guitarra();
		guitarra.setSonido("tra tra tra");
		
		Trompeta trompeta = new Trompeta();
		trompeta.setSonido("tu tu tu");
		
		HombreOrquesta ho = new HombreOrquesta();
		List<Instrumento> listaInstrumentos = new ArrayList<Instrumento>();
		listaInstrumentos.add(tambor);
		listaInstrumentos.add(guitarra);
		listaInstrumentos.add(trompeta);
		ho.setInstrumentos(listaInstrumentos);
		
		try {
			ho.tocar();
		} catch (SinsonidoException e) {
			System.out.println("No suena nada de nada");
		}
	}

}
