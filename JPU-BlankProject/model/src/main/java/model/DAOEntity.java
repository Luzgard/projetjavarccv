package model;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * The Class DAOEntity.
 *
 * @author Jean-Aymeric Diet
 *
 * @param <E>
 *          the element type
 */
abstract class DAOEntity<E extends Entity> {
	private final Connection connection;

	public DAOEntity(final Connection connection) throws SQLException {
		this.connection = connection;
	}
	
	protected Connection getConnection() {
		return this.connection;
	}
	
	public abstract boolean create(E entity);
	public abstract boolean delete(E entity);
	public abstract boolean update(E entity);
	public abstract E find(int id);
	public abstract E find(String key);


}
