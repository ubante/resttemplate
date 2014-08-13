package com.ubante.resttemplate;

import com.ubante.fromclassday1.entity.Car;

import javax.ws.rs.Path;

/**
 * Created by J on 8/11/2014.
 */
@Path("r4")
public class R1 {
  private Car car;

  public R1() {
    car = new Car("2q34awr32", "FJ",  "Toyota");
  }

  public Car car() {
    return car;
  }
}
