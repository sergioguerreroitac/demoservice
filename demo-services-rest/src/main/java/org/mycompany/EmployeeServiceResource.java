package org.mycompany;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/")
public class EmployeeServiceResource {

	public EmployeeServiceResource() {
	}

	@GET
    @Consumes({ MediaType.APPLICATION_JSON + "; charset=UTF-8" })
    @Produces({ MediaType.APPLICATION_JSON + "; charset=UTF-8" })
	@Path("/employees/{name}/")	
	public String getCustomer(@PathParam("name") String name) {		
		return "Welcome " + name;
	}	

}