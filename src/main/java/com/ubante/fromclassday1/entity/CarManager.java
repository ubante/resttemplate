package com.ubante.fromclassday1.entity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by J on 8/12/2014.
 */
public class CarManager {
  Map<String,Car> cars = new HashMap<>();

  public CarManager() {
    List<Part> parts = new ArrayList<>();
    parts.add(new Part("234234", "Wheel"));
    parts.add(new Part("aq324wa", "Radio"));
    parts.add(new Part("Aq234aw34", "Engine"));

    cars.put("1", new Car("234", "FJ", "Toyota", parts));
    cars.put("2", new Car("789", "Camry", "Toyota", parts));
    cars.put("3", new Car("253", "Land Cruiser", "Toyota", parts));
    cars.put("4", new Car("098", "Corolla", "Toyota", parts));
  }

  @GET
  public String def() {
    return "Please provide a car id";
  }
  
  @Path("{id}")
  public Car car(@PathParam("id") String id) {
      return cars.get(id);
  }

  @GET
  @Path("{id}/model")
  public String attr(@PathParam("id") String id) {
    return cars.get(id).getMake();
  }

}
