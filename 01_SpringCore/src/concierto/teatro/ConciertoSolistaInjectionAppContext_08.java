package concierto.teatro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.excepciones.SinsonidoException;
import concierto.musicos.Solista;


public class ConciertoSolistaInjectionAppContext_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext factoria = new ClassPathXmlApplicationContext("application-context_08.xml");
		Solista solista = (Solista) factoria.getBean("solista");
		
		try {
			solista.tocar();
		} catch (SinsonidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((ClassPathXmlApplicationContext) factoria).close(); 
	}

}