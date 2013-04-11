package com.seguros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.seguros.beans.Persona;

@Controller
public class SeguroController {

	@RequestMapping ("/initSeguroPersona.xhtml")
	public ModelAndView iniciarPersona (Model model){
		Persona persona = new Persona();
		
		
		model.addAttribute(persona);
		
		return new ModelAndView("formulario");
	}
}
