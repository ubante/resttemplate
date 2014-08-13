package com.ubante.fromclassday1.entity;

public class Part {
  private String id;
  private String name;


  public Part(String id, String name) {
    super();
    this.id = id;
    this.name = name;
  }

  // Need a constructor for JAX-B
  public Part() {}

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

}
