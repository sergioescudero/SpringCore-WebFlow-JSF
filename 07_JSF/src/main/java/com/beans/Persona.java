package com.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.faces.model.SelectItem;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.jdbc.core.JdbcTemplate;

import com.database.mappers.MapaCarnets;

@Entity
@Table (name="Persona")
public class Persona {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column (name="nombre")
	private String nombre;
	
	@Column (name="apellidos")
	private String apellidos;
	
	@Column (name="dni")
	private String dni;
	
	@Column (name="direccion")
	private String direccion;
	
	@Column (name="antiguedad")
	private int antiguedad;
	
	@Column (name="edad")
	private int edad;
	
	@Column (name="codigoPostal")
	private String codigoPostal;
	
	@Column (name="poblacion")
	private String poblacion;
	
	@ManyToMany
	@JoinTable(name="personaCarnet", joinColumns={@JoinColumn(name="idPersona")},inverseJoinColumns={@JoinColumn(name="idCarnet")})
	private List <TipoCarnet> carnet;
	
	
	private List<SelectItem> listCarnets= new ArrayList<SelectItem>();
	
	private JdbcTemplate plantilla;
	
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
		
		System.out.println("a validar persona");
		
		return "OK";
	}
	
	
	public List<SelectItem> obtenerListaCarnets(){
		List<TipoCarnet> listaTiposCarnets = plantilla.query(
                "select * from seguros.tipocarnet order by descripcion",
                new MapaCarnets());
        ListIterator<TipoCarnet> litr = listaTiposCarnets.listIterator();
        
        while (litr.hasNext()) {
            TipoCarnet element = (TipoCarnet) litr.next();
            SelectItem tipo1 = new SelectItem();
            tipo1.setLabel(element.getDescripcion());
            tipo1.setValue(element.getId());
            getListCarnets().add(tipo1);
        }
        
        return getListCarnets();
	}
	
	/*public Persona() {
		ApplicationContext factoria = new ClassPathXmlApplicationContext(
                "application-context.xml");
        JdbcTemplate plantilla = (JdbcTemplate) factoria.getBean("plantilla");
		
		
        
	}*/
	public List<SelectItem> getListCarnets() {
		return listCarnets;
	}
	public void setListCarnets(List<SelectItem> listCarnets) {
		this.listCarnets = listCarnets;
	}
	public JdbcTemplate getPlantilla() {
		return plantilla;
	}
	public void setPlantilla(JdbcTemplate plantilla) {
		this.plantilla = plantilla;
	}
	public List<TipoCarnet> getCarnet() {
		return carnet;
	}
	public void setCarnet(List<TipoCarnet> carnet) {
		this.carnet = carnet;
	}
	
	
	
	
}
