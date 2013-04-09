package concierto.teatro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concierto.util.Precios;


public class ConciertoSolistaInjectionAppContext_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext factoria = new ClassPathXmlApplicationContext("application-context_05.xml");
		Precios precios = (Precios) factoria.getBean("precios");
		
		for (Integer precio:precios.getPrecios()){
			System.out.println(precio);
		}
		((ClassPathXmlApplicationContext) factoria).close(); 
	}

}
