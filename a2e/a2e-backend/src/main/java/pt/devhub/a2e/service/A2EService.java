package pt.devhub.a2e.service;

import javax.ws.rs.core.Response;

public interface A2EService {

	public String getFromElastic();

	public Response persistOnElastic(String valueToPersist);
}
