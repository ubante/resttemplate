package com.ubante.fromclassday1;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * This is the singleton.
 */
@Path("r9")
public class R9 {
  @HeaderParam("user-agent")
  private String agent;

  @Context
  private UriInfo info;

  // The below is not allowed with singletons
//  public R9(@PathParam("id") String id) {
//    System.out.println("...");
//  }

  public R9() {
    System.out.println("Creating R9....");
  }

  @GET
  public String def() {
    return "Hello from R9";
  }

}
