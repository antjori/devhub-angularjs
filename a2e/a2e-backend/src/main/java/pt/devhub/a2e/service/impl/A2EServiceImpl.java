package pt.devhub.a2e.service.impl;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import pt.devhub.a2e.database.ElasticConnector;
import pt.devhub.a2e.service.A2EService;

/**
 * Implementation of the REST service that allows to call Elastic API from
 * AngularJS.
 */
@Path("/service")
public class A2EServiceImpl implements A2EService {

	@Inject
	private ElasticConnector elasticConnector;

	/**
	 * {@inheritDoc}
	 */
	@GET
	@Path("/elastic/get")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public Response getFromElastic() {
		JSONObject jsonObject = new JSONObject();

		jsonObject.put("helloWorld", "Hello World!");

		elasticConnector.connect();

		return Response.ok(jsonObject).build();
	}

	/**
	 * {@inheritDoc}
	 */
	@POST
	@Path("/elastic/post")
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public Response persistOnElastic(final String valueToPersist) {
		JSONObject jsonObject = new JSONObject();

		jsonObject.put("helloWorld", "Hello World!");
		jsonObject.put("Received from server", valueToPersist);

		return Response.ok(jsonObject).build();
	}

}
