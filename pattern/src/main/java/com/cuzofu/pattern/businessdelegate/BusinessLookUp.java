package com.cuzofu.pattern.businessdelegate;

public class BusinessLookUp {

	public BusinessService getBusinessService(String serviceType) {
		if (serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		} else if (serviceType.equalsIgnoreCase("JMS")) {
			return new JMSService();
		} else {
			return null;
		}
	}

}
