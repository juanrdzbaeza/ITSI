package com.org;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/myrestws")
public class HelloWorldResource {
	@GET
	public String getWelcomeMsg() throws Exception {
		return "{'nombre':'juan','apellido':'machado','datosCriticos':[{'edad':12}]}";
	}
}
