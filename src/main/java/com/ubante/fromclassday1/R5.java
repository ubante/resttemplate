package com.ubante.fromclassday1;

import com.ubante.fromclassday1.entity.CarManager;

import javax.ws.rs.Path;

@Path("r5")
public class R5 {
  private CarManager cm;

  public R5() {
    cm = new CarManager();
  }

  @Path("car")
  public CarManager car() {
    return cm;
  }

}
