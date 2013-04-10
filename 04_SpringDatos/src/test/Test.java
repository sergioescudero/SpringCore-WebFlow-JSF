package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext factoria = new ClassPathXmlApplicationContext("application-context.xml");
		
		JdbcTemplate plantilla = (JdbcTemplate) factoria.getBean("plantilla");
		
		String insert = "insert into personas (nombre, direccion, telefono, edad) values (?,?,?,?)";
				
		plantilla.update(insert, "Probatina", "Rue del Percebe 44", "98989898", "99");
	}

}
