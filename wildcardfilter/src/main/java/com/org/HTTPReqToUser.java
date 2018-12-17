package com.org;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class HTTPReqToUser extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException 
	{
		User user = new User();
		String name = (String) message.getInboundProperty("name");
		String lastName = (String) message.getInboundProperty("lname");
		user.setName(name);
		user.setLname(lastName);
		return user;
	}

}
