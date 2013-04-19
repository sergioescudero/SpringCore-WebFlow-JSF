package clases;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

public class Login
{
  private String usuario;
  private String clave;
  private Date fecha;
  private String mes;
  private List<SelectItem> listaPaises;
 
  
  public Login () {
	  setListaPaises(new ArrayList<SelectItem>());
	  SelectItem es = new SelectItem();
	  es.setLabel("Español");
	  es.setValue("es");
	  SelectItem fr = new SelectItem();
	  fr.setLabel("Frances");
	  fr.setValue("fr");
	  SelectItem us = new SelectItem();
	  us.setLabel("Ingles");
	  us.setValue("us");
	  getListaPaises().add(es);
	  getListaPaises().add(fr);
	  getListaPaises().add(us);
  }
  
  
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

//tiene que recibir el evento y no devuelve nada
//cada vez que cambia su valor
public void eventoFechas (ValueChangeEvent e) {
	GregorianCalendar fechaCalendar = new GregorianCalendar();
 	setMes(fechaCalendar.getDisplayName(Calendar.MONTH,Calendar.LONG, new Locale(e.getNewValue().toString())));
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


public List<SelectItem> getListaPaises()
{
	return listaPaises;
}


public void setListaPaises(List<SelectItem> listaPaises)
{
	this.listaPaises = listaPaises;
}
	


public Persona damePersona () {
	 Persona persona = new Persona();
	 persona.setNombre("Pepe");
	 persona.setApellidos("Perez Perez");
	 persona.setEdad(30);
	 persona.setDireccion("c/Marques de Ahumada 7");
	 return persona;
}


public Persona getPersona() {
	return new Persona();
}

public Coche getCoche() {
	return new Coche();
}

public Moto getMoto() {
	return new Moto();
}

public Hogar getHogar() {
	return new Hogar();
}

	
}
