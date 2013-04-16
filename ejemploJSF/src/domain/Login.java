package domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;



public class Login {
	
	
	private String usuario;
	private String clave;
	private Date fecha;
	private String mes;
	private List<SelectItem> listapaises=new ArrayList<SelectItem>();
	
	


	
	
	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String validar(){
		
		setListapaises(new ArrayList<SelectItem>());
		
		SelectItem es=new SelectItem();
		es.setLabel("españa");
		es.setValue("es");
		getListapaises().add(es);
		
		SelectItem fr=new SelectItem();
		fr.setLabel("francia");
		fr.setValue("fr");
		getListapaises().add(fr);
		
		SelectItem us=new SelectItem();
		us.setLabel("inglaterra");
		us.setValue("en");
		getListapaises().add(us);
		
		
		if (usuario.equalsIgnoreCase("pepe")){
			
			return "ok";
		}else{
			
			return"ko";
		}
		
	}
	
	


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getMes() {
		return mes;
	}


	public void setMes(String mes) {
		this.mes = mes;
	}


	public List<SelectItem> getListapaises() {
		return listapaises;
	}


	public void setListapaises(List<SelectItem> listapaises) {
		this.listapaises = listapaises;
	}

	
public void eventoFechas(ValueChangeEvent e){
	GregorianCalendar fecha1=new GregorianCalendar();
	setMes(fecha1.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale(e.getNewValue().toString())));
		
	}
	

	

}
