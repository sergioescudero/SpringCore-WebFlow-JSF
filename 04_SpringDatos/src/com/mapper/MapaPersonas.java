package com.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.Persona;


public class MapaPersonas implements RowMapper<Persona> {

	@Override
	public Persona mapRow(ResultSet arg0, int arg1) throws SQLException {
		Persona persona = new Persona();
		persona.setId(arg0.getInt(1));
		persona.setNombre(arg0.getString(2));
		persona.setDireccion(arg0.getString(3));
		persona.setTelefono(arg0.getString(4));
		persona.setEdad(arg0.getInt(5));
		
		return persona;
	}

}
