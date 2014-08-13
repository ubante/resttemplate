package com.ubante.fromclassday1;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("r3")
public class R3 {

  @GET
  @Path("car/{vin: [1-9]+}")
  public String m1(@PathParam("vin") int vin)
  {
    return "M1-Your Vin: "+vin;
  }

  @GET
  @Path("car/{vin}")
  public String m2(@PathParam("vin") String vin)
  {
    return "M2-Your Vin: "+vin;
  }

  @GET
  @Path("m")
  @Consumes({MediaType.APPLICATION_XML,MediaType.TEXT_PLAIN})
  public String m3()
  {
    return "This is M3...";
  }

  @GET
  @Path("m")
  @Consumes(MediaType.APPLICATION_JSON)
  public String m4()
  {
    return "This is M4...";
  }

  @POST
  @Path("m5")
  public String m5(@FormParam("fname")String fname)
  {
    return "M5: "+fname;
  }
}
