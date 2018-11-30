package com.org;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/myrestws")
public class HelloWorldResource {
	@GET
	private String getWelcomeMsg() throws Exception {
		return "Hola mi Web-Service basado en REST";
	}
}
