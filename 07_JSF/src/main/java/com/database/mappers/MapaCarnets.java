package com.database.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.beans.TipoCarnet;

public class MapaCarnets implements RowMapper<TipoCarnet> {

	public TipoCarnet mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		TipoCarnet tiposdeCarnets=new TipoCarnet();
		tiposdeCarnets.setId(arg0.getInt(1));
		
		tiposdeCarnets.setDescripcion(arg0.getString(2));
		
		
		
		return tiposdeCarnets;
	}

}
