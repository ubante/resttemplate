package com.ubante.fromclassday1;


import com.ubante.fromclassday1.entity.CarManager;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

@Path("r6")
public class R6 {
  private CarManager cm = new CarManager();

  @GET
  @Path("resp")
  public Response m1() {

//    Response.ResponseBuilder rb = Response.ok();
    Response.ResponseBuilder rb = Response.status(222);

    // when you want to return a string
//    rb.encoding("This is the response...");

    // when you want to return an object
    rb.entity(cm.car("234"));

    // force it to xml overriding what the client requests
    rb.entity(cm.car("234")).encoding(MediaType.APPLICATION_XML);

    // force it to json overriding what the client requests
    rb.entity(cm.car("234")).encoding(MediaType.APPLICATION_JSON);

    // add a cookie
    rb.cookie(new NewCookie("cookieName", "cookieValue"));

    // since REST is stateless, shove some state in a header
    rb.header("my-transaction-number", "1234321");

    return rb.build();
  }

}
