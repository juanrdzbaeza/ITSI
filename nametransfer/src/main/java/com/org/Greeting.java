package com.org;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class Greeting implements Callable{
	
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception{
		
		String name = eventContext.getMessage().getPayloadAsString();
		return "Hello " + name;
	
	}

}
