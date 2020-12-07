package org.acme.getting.started.getting.started;

import org.acme.getting.started.getting.started.model.Cost;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService service;
    @Inject
    CostServices costServices;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Cost> getCots(){
        return costServices.fetchCosts();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String greeting(@PathParam String name) {
        return service.greeting(name);
    }



    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
}