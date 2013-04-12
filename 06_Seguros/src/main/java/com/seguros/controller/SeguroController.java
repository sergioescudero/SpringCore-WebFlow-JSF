package com.seguros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.seguros.beans.Coche;
import com.seguros.beans.Hogar;
import com.seguros.beans.Moto;
import com.seguros.beans.Persona;

@Controller
public class SeguroController {

	private static final String INIT_INPUT_PERSONA = "Introduzca el dato de la persona";
	private static final String INIT_INPUT_COCHE = "Introduzca el dato de la coche";
	private static final String INIT_INPUT_MOTO = "Introduzca el dato de la moto";
	private static final String INIT_INPUT_HOGAR = "Introduzca el dato de la hogar";
	
	@Autowired //quito la propiedad de la def del bean de SegundoControlador
	private JdbcTemplate plantilla;
	
	@RequestMapping ("/initSeguroPersona.xhtml")
	public ModelAndView iniciarPersona (Model model){
		Persona persona = new Persona();
		persona.setNombre(INIT_INPUT_PERSONA);
		persona.setApellidos(INIT_INPUT_PERSONA);
		persona.setDni(INIT_INPUT_PERSONA);
		persona.setDireccion(INIT_INPUT_PERSONA);
		persona.setPoblacion(INIT_INPUT_PERSONA);
		persona.setCodigoPostal(INIT_INPUT_PERSONA);
		persona.setAntiguedad(0);
		persona.setEdad(0);
		
		model.addAttribute(persona);
		
		return new ModelAndView("persona");
	}
	
	@RequestMapping ("/introducirPersona.xhtml")
	public ModelAndView introducirPersona (Persona persona, ModelMap model){
		
		model.addAttribute(persona);
		
		Coche coche = new Coche();
		coche.setMarca(INIT_INPUT_COCHE);
		coche.setModelo(INIT_INPUT_COCHE);
		coche.setMatricula(INIT_INPUT_COCHE);
		coche.setAntiguedad(0);
		coche.setBastidor(INIT_INPUT_COCHE);
		coche.setCilindrada(0);
		
		model.addAttribute(coche);
		
		return new ModelAndView("coche");
	}
	
	
	
	@RequestMapping ("/introducirCoche.xhtml")
	public ModelAndView introducirCoche (Coche coche, ModelMap model){
		Persona p = (Persona)model.get("persona");
		model.addAttribute(coche);
		
		Moto moto = new Moto();
		moto.setMarca(INIT_INPUT_MOTO);
		moto.setModelo(INIT_INPUT_MOTO);
		moto.setMatricula(INIT_INPUT_MOTO);
		moto.setAntiguedad(0);
		moto.setCilindrada(0);
		
		model.addAttribute(moto);
	
		return new ModelAndView("moto");
	}
	
	@RequestMapping ("/introducirMoto.xhtml")
	public ModelAndView introducirMoto (Persona persona,Coche coche, Moto moto, ModelMap model){
		model.addAttribute(persona);
		model.addAttribute(coche);
		model.addAttribute(moto);
		
		Hogar hogar = new Hogar();
		hogar.setCalle(INIT_INPUT_HOGAR);
		hogar.setEscalera(INIT_INPUT_HOGAR);
		hogar.setM2(0);
		hogar.setPiso(INIT_INPUT_HOGAR);
		hogar.setPortal(INIT_INPUT_HOGAR);
		hogar.setPuerta(INIT_INPUT_HOGAR);
		hogar.setAlquilado(false);
		hogar.setHipoteca(false);
		
		model.addAttribute(hogar);
	
		return new ModelAndView("hogar");
	}
	
	
	@RequestMapping ("/introducirHogar.xhtml")
	public ModelAndView introducirHogar (@RequestParam("persona")Persona persona, @RequestParam("coche")Coche coche, @RequestParam("moto")Moto moto, Hogar hogar, Model model){
		model.addAttribute(persona);
		model.addAttribute(coche);
		model.addAttribute(moto);
		model.addAttribute(hogar);
		
		return new ModelAndView("hogar");
	}
	
	
	public JdbcTemplate getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(JdbcTemplate plantilla) {
		this.plantilla = plantilla;
	}
}
