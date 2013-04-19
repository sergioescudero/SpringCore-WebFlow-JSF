package beans;

import java.util.Date;


public class Login
{
  private String usuario;
  private String clave;
  private Date fecha;
  private String mes;
 
  
public String getUsuario()
{
	return usuario;
}


public void setUsuario(String usuario)
{
	this.usuario = usuario;
}


public String getClave()
{
	return clave;
}


public void setClave(String clave)
{
	this.clave = clave;
}




/*siempre tiene que devolver un String y no recibir nada*/
public String validar () {
	  String ret = "ko";
	  
	  
	  if (getUsuario().equals("pepe") && getClave().equals("pepe")) {
		  System.out.println(getFecha());
		  ret= "ok";  
	  }
	  return ret;
}




public Date getFecha()
{
	return fecha;
}


public void setFecha(Date fecha)
{
	this.fecha = fecha;
}


public String getMes()
{
	return mes;
}


public void setMes(String mes)
{
	this.mes = mes;
}



	
}
