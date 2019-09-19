package com.soner.rest.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/orders")
public class RestServiceOrder {
	private static List<Order> orders = new ArrayList<>();

	@GET
	@Path("ping")
	public String getServerTime() {
		System.out.println("RESTful Service is running!");
		return "RESTful Service is running ==> ping, received ping on " + LocalDateTime.now().toString();
	}

	@GET
	@Path("/get")
	@Produces({ MediaType.APPLICATION_XML })
	public List<Order> getOrder() throws Exception {
		
		return orders;
	}

	@POST
	@Produces({ MediaType.APPLICATION_XML })
	@Path("/post")
	public List<Order> postOrder(Order ord) throws Exception {
		orders.add(ord);
		return orders;

	}
	
	@DELETE
	@Produces({ MediaType.APPLICATION_XML })
	@Path("/delete")
	public List<Order> deleteOrder(Order ord) throws Exception {
		orders.remove(ord);
		return orders;

	}

}
