package concierto.teatro;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import concierto.excepciones.SinsonidoException;
import concierto.musicos.Solista;


public class ConciertoSolistaInjection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BeanFactory factoria = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Solista solista = (Solista) factoria.getBean("solista");
		
		try {
			solista.tocar();
			solista.tocar();
		} catch (SinsonidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
