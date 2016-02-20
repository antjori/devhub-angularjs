package pt.devhub.a2e.service.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pt.devhub.a2e.service.A2EService;

@Path("/service")
public class A2EServiceImpl implements A2EService {

	@GET
	@Path("/elastic/get")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public String getFromElastic() {
		// TODO Auto-generated method stub
		return null;
	}

	@POST
	@Path("/elastic/post")
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public Response persistOnElastic(final String valueToPersist) {
		// TODO Auto-generated method stub
		return null;
	}

}
