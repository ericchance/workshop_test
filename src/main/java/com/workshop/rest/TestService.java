package com.workshop.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.JsonObject;
import com.workshop.utility.Utility;

@Path("/rest")
public class TestService {

    @GET
    @Produces("text/plain")    
	@Path("/testservice")
    public String getMessage() {
        return "Hello there";
    }
	
	@GET
    @Produces("text/plain")    
	@Path("/myservice/{name}")
    public String getName(@PathParam("name") String name) {
        return "Hello " + name;
    }
	
	@GET
    @Produces("text/plain")    
	@Path("/myjson")
    public String getJson() {
		JsonObject json=Utility.convertFileToJSON("test.json");
        return json.toString();
    }
	
}
