package com.ubante.fromclassday1;



import com.ubante.fromclassday1.entity.Car;
import com.ubante.fromclassday1.entity.Part;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("r4")
public class R4 {

  private Car car;

  public R4()
  {
    List<Part> parts = new ArrayList<>();
    parts.add(new Part("1233","Door"));
    parts.add(new Part("44883","Wheel"));
    car = new Car("234iop234", "FJ", "Toyota", parts);
  }

  @GET
  @Path("car")
  @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
  public Car car()
  {
    return car;
  }
}
