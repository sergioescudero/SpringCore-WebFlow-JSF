package com.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.beans.Login;

public class MapaLogin implements RowMapper<Login> {

	public Login mapRow(ResultSet arg0, int arg1) throws SQLException {
		Login login = new Login();
		login.setId(arg0.getInt(1));
		login.setUsuario(arg0.getString(2));
		login.setClave(arg0.getString(3));
		
		return login;
	}

}
