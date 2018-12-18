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
		/* 
		 * parece que esto esta devolviendo null
		 */
		String lastName = (String) message.getInboundProperty("lname");
		
		// System.out.println(name + " " + lastName);
		
		user.setName(name);
		user.setLname(lastName);
		return user;
	}

}
