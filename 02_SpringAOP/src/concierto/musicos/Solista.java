package concierto.musicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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
