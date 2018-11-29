package com.org;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class Greeting implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		//return null;
		
		String name = eventContext.getMessage().getInboundProperty("http.request.path");
		return String.format("Hola %s!", name.substring(1));
		
	}

}
