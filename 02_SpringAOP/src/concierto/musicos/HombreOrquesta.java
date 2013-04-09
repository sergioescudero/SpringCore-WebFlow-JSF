package concierto.musicos;

import java.util.List;

import concierto.excepciones.SinsonidoException;
import concierto.interfaces.Instrumento;
import concierto.interfaces.Musico;

public class HombreOrquesta implements Musico {

	
	private Instrumento instrumento;
	
	private List<Instrumento> instrumentos;

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}
	
	@Override
	public void tocar() throws SinsonidoException {
		
		for(Instrumento instrumento:getInstrumentos()){
			System.out.println(instrumento.sonar());
		}

	}

	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(List<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}

	
	
	
	
}
