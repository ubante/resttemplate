package com.ubante.fromclassday1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("")
public class R1 {

  @GET
  public String hello()
  {
    return "Hello REST!";
  }

  @GET
  @Path("h2")
  public String hello2()
  {
    return "Hello from Hello2!";
  }
}
