package concierto.musicos;

import concierto.excepciones.SinsonidoException;
import concierto.interfaces.Instrumento;
import concierto.interfaces.Musico;


public class Solista implements Musico {
	
	private Instrumento instrumento;
	
	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}
	
	@Override
	public void tocar() throws SinsonidoException {
		
		System.out.println(getInstrumento().sonar());

	}
	
	public Solista(){
		
	}
	
	public Solista(Instrumento instrumento){
		this.instrumento = instrumento;
	}

}
