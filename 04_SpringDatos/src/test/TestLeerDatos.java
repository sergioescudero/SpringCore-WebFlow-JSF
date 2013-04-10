package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mapper.MapaPersonas;
import com.model.Persona;

public class TestLeerDatos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext factoria = new ClassPathXmlApplicationContext("application-context.xml");
		
		JdbcTemplate plantilla = (JdbcTemplate) factoria.getBean("plantilla");
		
		
		List<Persona> personas = plantilla.query("select * from personas", new MapaPersonas());
		for (Persona persona:personas){
			System.out.println(persona.getNombre());
		}
		
		((ClassPathXmlApplicationContext) factoria).close(); 
	}

}
