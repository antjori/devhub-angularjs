package pt.devhub.a2e.database;

import javax.annotation.PostConstruct;

/**
 * The Elastic database connector.
 */
public class ElasticConnector extends NoSQLConnector {

	public ElasticConnector() {
	}

	@PostConstruct
	private void init() {
		System.out.println("Initializing Elastic connector.");
	}

	public void connect() {
		System.out.println("Connecting to Elastic database.");
	}
}
