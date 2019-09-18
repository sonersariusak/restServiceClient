package com.soner.rs.client;

import javax.ws.rs.core.MediaType;

import com.soner.rs.client.model.Order;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class MainTestRestServiceClient {

	public static void main(String[] args) {
		post();
		System.out.println("This is \"Delete\" process..");
		delete();
		System.out.println("This is \"Get\" process..");
		get();
	}

	private static void get() {
		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8080/RestService/rest/orders/get");
		ClientResponse response = resource.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
		if (response.getStatus() == 200) {
			System.out.println(response.getEntity(String.class));
		}
	}

	private static void post() {

		Order order = new Order();
		order.setOrderName("TV");
		order.setOrderAmount(50);
		order.setOrderBuyer("Uğur");
		order.setOrderNumber(2);

		try {
			Client client = Client.create();
			WebResource resource = client.resource("http://localhost:8080/RestService/rest/orders/post");
			ClientResponse response = resource.type(MediaType.APPLICATION_XML).post(ClientResponse.class, order);
			if (response.getStatus() == 200) {
				System.out.println(response.getEntity(String.class));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void delete() {

		Order order = new Order();
		order.setOrderName("TV");
		order.setOrderAmount(50);
		order.setOrderBuyer("Uğur");
		order.setOrderNumber(2);

		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8080/RestService/rest/orders/delete");

		ClientResponse response = resource.accept(MediaType.APPLICATION_XML).delete(ClientResponse.class, order);

		if (response.getStatus() == 200) {
			System.out.println(response.getEntity(String.class));
		}

	}

}
