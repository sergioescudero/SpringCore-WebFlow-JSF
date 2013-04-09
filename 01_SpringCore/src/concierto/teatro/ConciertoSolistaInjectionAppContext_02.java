package concierto.teatro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.excepciones.SinsonidoException;
import concierto.musicos.HombreOrquesta;


public class ConciertoSolistaInjectionAppContext_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext factoria = new ClassPathXmlApplicationContext("application-context_02.xml");
		HombreOrquesta hombreOrquesta = (HombreOrquesta) factoria.getBean("hombreOrquesta");
		
		try {
			hombreOrquesta.tocar();
		} catch (SinsonidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((ClassPathXmlApplicationContext) factoria).close(); 
	}

}
