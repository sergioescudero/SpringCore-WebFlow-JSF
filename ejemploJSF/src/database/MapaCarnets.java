package database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



import domain.TiposdeCarnets;


public class MapaCarnets implements RowMapper<TiposdeCarnets> {

	public TiposdeCarnets mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		TiposdeCarnets tiposdeCarnets=new TiposdeCarnets();
		tiposdeCarnets.setId(rs.getInt(1));
		
		tiposdeCarnets.setDescripcion(rs.getString(2));
		
		
		
		return tiposdeCarnets;
	}

}
