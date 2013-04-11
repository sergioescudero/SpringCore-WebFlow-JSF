package com.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.beans.Login;
import com.mappers.MapaLogin;

@Controller
public class SegundoControlador {

	@Autowired //quito la propiedad de la def del bean de SegundoControlador
	private JdbcTemplate plantilla;
	
	/*@RequestMapping ("/login.xhtml")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response){
	
	
		String sql = "select * from usuarios where usuario = ? and clave = ?";
		List<Login> lista = getPlantilla().query(sql, new Object[]{request.getParameter("usuario"),request.getParameter("clave")},new MapaLogin());
		
		if (lista==null || lista.isEmpty()){
			return new ModelAndView("ko");
		}
		
		return new ModelAndView("ok");
	}*/
	
	@RequestMapping ("/login.xhtml")
	public ModelAndView login (Model model){
		Login login = new Login();
		login.setUsuario("Introduzca el usuario");
		login.setClave("Introduzca la clave");
		
		model.addAttribute(login);
		
		return new ModelAndView("formulario");
	}
	
	@RequestMapping ("/verifica.xhtml")
	public ModelAndView verifica (Login login){
		String clave = login.getClave();
		String usuario = login.getUsuario();
		
				
		String sql = "select * from usuarios where usuario = ? and clave = ?";
		List<Login> lista = getPlantilla().query(sql,  new Object[]{usuario,clave},new MapaLogin());
		
		if (lista==null || lista.isEmpty()){
			return new ModelAndView("ko");
		}
		
		return new ModelAndView("ok");
	}
	
	
	
	
	
	
	
	
	public JdbcTemplate getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(JdbcTemplate plantilla) {
		this.plantilla = plantilla;
	}
	
	
	
}
