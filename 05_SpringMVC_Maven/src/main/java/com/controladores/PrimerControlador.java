package com.controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.beans.Login;
import com.mappers.MapaLogin;


public class PrimerControlador extends AbstractController {
	
	private JdbcTemplate plantilla;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String sql = "select * from usuarios where usuario = ? and clave = ?";
		List<Login> lista = getPlantilla().query(sql, new Object[]{request.getParameter("usuario"),request.getParameter("clave")},new MapaLogin());
		
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
