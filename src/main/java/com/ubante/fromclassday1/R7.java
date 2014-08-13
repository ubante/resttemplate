package com.ubante.fromclassday1;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.*;
//import javax.servlet.http.HttpServletRequest;

@Path("r7")
public class R7 {

  public R7() {}

  @Context
  private UriInfo info;

  @Context
  private HttpHeaders headers;

  @Context
  private Request req;

//  @Context
//  private HttpServletRequest httpReq;

  @HeaderParam("user-agent")
  private String userAgent;

  @GET
  @Path("one")
  public String m1() {
//    return info.getAbsolutePath().toString();

    UriBuilder builder = info.getBaseUriBuilder();
    builder.path("r7").path("one");
//    return builder.toString();
    return "<a href='" + builder.toString() + "'>Click Me</a>";
  }

  @GET
  @Path("two")
  public String heads() {
    // The below line can be replaced with the above @HeaderParam annotation
//    return headers.getHeaderString("user-agent");

    return userAgent;


  }



}
