package com.ubante.fromclassday1;

import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("r2")
public class R2 {

  @GET
  @Path("customer")
  public String m1(@QueryParam("query") String query) {
    if (query != null) {
      return "getting customer for query";
    }
    return "getting all customers....";
  }

  @DELETE
  @Path("customer/{id}")
  public String m11(@PathParam("id") String id) {
    return "removing customer: " + id;
  }

  @GET
  @Path("m2")
  public String m2() {
    return "m2";
  }

  @GET
  public String def(@HeaderParam("user-agent") String userAgent) {
    return userAgent;
  }

  @GET
  @Path("def")
  public String m5(@DefaultValue("bubba") @QueryParam("name") String name) {
    return "Hello: " + name;
  }

}
