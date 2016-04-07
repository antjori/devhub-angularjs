package pt.devhub.a2e.database.connector;

/**
 * The interface for all database connectors.
 */
public interface IConnector {

	/**
	 * Established a connection the the underlying database.
	 */
	void connect();
}
