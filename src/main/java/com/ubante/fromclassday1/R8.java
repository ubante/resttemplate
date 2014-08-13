package com.ubante.fromclassday1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("r8/{id}")
public class R8 {
  private String id;

  public R8(@PathParam("id") String id) {
    this.id = id;
    System.out.println("Creating R8....");
  }

  @GET
  public String def() {
    return "Welcome to R8... -> " + id;
  }

}
