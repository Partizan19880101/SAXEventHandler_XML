package com.example.sax.read;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.List;

public class ReadXMLWithSAX {
	public static final String DATADIR = "../SAXEventHandler/data/";
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {

		String filename = DATADIR + "NScustomers.xml";
		SAXCustomerHandler saxCustomerHandler = new SAXCustomerHandler();
		List<Customer> data = saxCustomerHandler.readDataFromXML(filename);
		System.out.println("Number of customers: " + data.size());

		for (Customer customer : data) {
			System.out.println(customer);
		}
	}

}
