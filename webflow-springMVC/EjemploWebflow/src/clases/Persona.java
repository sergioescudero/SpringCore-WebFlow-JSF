package clases;

import java.io.Serializable;



public class Persona implements Serializable
{
   private int id;
   private String nombre;
   private String apellidos;
   private String dni;
   private int antiguedad;
   private int edad;
   private String direccion;
   private String codPostal;
   private String poblacion;
   
    

	public int getId()
	{
		return id;
	}


	public void setId(int id)
	{
		this.id = id;
	}


	public String getNombre()
	{
		return nombre;
	}


	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}


	public String getApellidos()
	{
		return apellidos;
	}


	public void setApellidos(String apellidos)
	{
		this.apellidos = apellidos;
	}


	public String getDni()
	{
		return dni;
	}


	public void setDni(String dni)
	{
		this.dni = dni;
	}


	public int getAntiguedad()
	{
		return antiguedad;
	}


	public void setAntiguedad(int antiguedad)
	{
		this.antiguedad = antiguedad;
	}


	public int getEdad()
	{
		return edad;
	}


	public void setEdad(int edad)
	{
		this.edad = edad;
	}


	public String getDireccion()
	{
		return direccion;
	}


	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}


	public String getCodPostal()
	{
		return codPostal;
	}


	public void setCodPostal(String codPostal)
	{
		this.codPostal = codPostal;
	}


	public String getPoblacion()
	{
		return poblacion;
	}


	public void setPoblacion(String poblacion)
	{
		this.poblacion = poblacion;
	}
  
   
     
   
}  