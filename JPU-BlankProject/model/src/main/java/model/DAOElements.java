package model;

import java.sql.Connection;
import java.sql.SQLException;

class DAOElements extends DAOEntity<Elements> {
	
	public DAOElements(final Connection connection) throws SQLException {
		super(connection);
	}
		
	public boolean create(final Elements entity) {
		// Not implemented
	return false;
		}
	
	public boolean delete(final Elements entity) {
		// Not implemented
		return false;
	}

}
