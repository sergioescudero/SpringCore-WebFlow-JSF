package concierto.interceptores;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class AvisadorAudiencia {
	
	@Pointcut("execution(*concierto.interfaces.Musico.tocar(..))")
	public void ejecucion(){
		System.out.println("Método ejecución");
	}
	
	@Before ("ejecucion()")
	public void sentarse(){
		System.out.println("Sientense");
	}
	
	public void apagarMoviles(){
		System.out.println("Apaguen los móviles");
	}
	
	public void encenderMoviles(){
		System.out.println("Enciendan los móviles");
	}
	
	public void aplaudir(){
		System.out.println("plas plas plas");
	}
	
	public void averia(){
		System.out.println("averiado");
	}
	
}
