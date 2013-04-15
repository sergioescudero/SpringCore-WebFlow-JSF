package com.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

public class Persona {

	private Integer id;
	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	private int antiguedad;
	private int edad;
	private String codigoPostal;
	private String poblacion;
	List <TipoCarnet> carnet;
	private List<SelectItem> listCarnets= new ArrayList<SelectItem>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	
	public String validar(){
		
		System.out.println("a validar");
		
		return "ok";
	}
	
	
	public Persona() {
		
	}
	
	
	
	
}
