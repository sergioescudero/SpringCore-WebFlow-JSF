package concierto.teatro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.excepciones.SinsonidoException;
import concierto.interfaces.Musico;


public class ConciertoSolistaInjectionAppContext {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext factoria = new ClassPathXmlApplicationContext("application-context.xml");
		Musico solista = (Musico) factoria.getBean("solista");
		
		try {
			solista.tocar();
		} catch (SinsonidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((ClassPathXmlApplicationContext) factoria).close(); 
	}

}