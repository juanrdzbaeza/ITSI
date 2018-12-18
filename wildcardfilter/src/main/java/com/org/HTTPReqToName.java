package com.org;

import java.util.Map;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class HTTPReqToName extends AbstractMessageTransformer 
{

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) 
			throws TransformerException 
	{
		/*String name = "Juan";
		String lastName = "Baeza";
		return name+" "+lastName;
		*/
		Map<String, String> queryParams = message.getInboundProperty("http.query.params");
		return queryParams.get("name") + " " + queryParams.get("lname");
	}

}
