package com.org;

import javax.jws.WebService;

@WebService(endpointInterface="com.org.HelloService",
serviceName="HelloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String himule(String str) throws Exception {
		return "Hola que tal " + str;
	}

}
