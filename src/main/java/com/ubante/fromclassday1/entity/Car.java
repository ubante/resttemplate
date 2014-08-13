package com.ubante.fromclassday1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.List;

/**
 * Created by J on 8/12/2014.
 */

@XmlRootElement
public class Car {
  private String vin;
  private String model;
  private String make;
  private List<Part> parts;

  // Need a constructor for JAX-B
  public Car() {}

  @XmlTransient
  @JsonIgnore
  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public Car(String vin, String model, String make, List<Part> parts) {
    this.vin = vin;
    this.model = model;
    this.make = make;
    this.parts = parts;
  }

  @GET
  @Override
  public String toString() {
    return "Car [vin = " + vin + ", model = " + model + ", make = " + make + "]";
  }

  @GET
  @Path("obj")
  public Car obj() {
    return this;
  }

}
