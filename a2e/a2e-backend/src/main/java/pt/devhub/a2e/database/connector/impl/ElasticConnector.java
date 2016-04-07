package pt.devhub.a2e.database.connector.impl;

import javax.annotation.PostConstruct;

import pt.devhub.a2e.database.connector.NoSQLConnector;

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
