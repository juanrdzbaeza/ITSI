package com.mule.filter;

import java.util.Map;

import org.mule.api.MuleMessage;
import org.mule.api.routing.filter.Filter;

public class CustomMuleFilter implements Filter {

	@Override
	public boolean accept(MuleMessage message) {
		try {
			Map<String, String> queryParams = message.getInboundProperty("http.query.params");
			if (queryParams.get("name").equals("juan") && queryParams.get("lname").equals("baeza")) {
				return true;
		}
		} catch (Exception e) {
				e.printStackTrace();
		}
			return false;
	}

}
