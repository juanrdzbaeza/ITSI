package com.org;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class Mule implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		return eventContext.getMessage().getPayload() + " Mule" + ", soy el companero jrb085";
	}

}
