package com.beans;

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
	private List<SelectItem> listPaises= new ArrayList<SelectItem>();
	
	public String validar(){
				
		SelectItem es = new SelectItem();
		es.setLabel("españa");
		es.setValue("es");
		getListPaises().add(es);
		
		SelectItem se = new SelectItem();
		se.setLabel("Suecia");
		se.setValue("se");
		getListPaises().add(se);
		
		SelectItem us = new SelectItem();
		us.setLabel("USA");
		us.setValue("us");
		getListPaises().add(us);
		
		if (!getUsuario().equalsIgnoreCase(getClave())){
			return "KO";
		}
		
		return "OK";
	}
	
	
	public void eventoFechas (ValueChangeEvent e){
		GregorianCalendar gc = new GregorianCalendar();
		setMes(gc.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale (e.getNewValue().toString())));
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<SelectItem> getListPaises() {
		return listPaises;
	}

	public void setListPaises(List<SelectItem> listPaises) {
		this.listPaises = listPaises;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

}
