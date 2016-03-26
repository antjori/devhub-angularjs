package pt.devhub.a2e.service;

import javax.ws.rs.core.Response;

/**
 * Interface containing the REST API declaration.
 */
public interface A2EService {

	/**
	 * Gets the data stored in Elastic database.
	 * 
	 * @return the data stored in Elastic database
	 */
	public Response getFromElastic();

	/**
	 * Persists a value on Elastic database.
	 * 
	 * @param valueToPersist
	 *            the value to persist on Elastic database
	 * @return the result of the value persistence on Elastic database
	 */
	public Response persistOnElastic(String valueToPersist);
}
