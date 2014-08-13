package com.ubante.fromclassday1;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("v1")
public class Appconfig extends Application{
  Set<Class<?>> resources=new HashSet<>();

  public Appconfig()
  {
    resources.add(R1.class);
    resources.add(R2.class);
    resources.add(R3.class);
    resources.add(R4.class);
    resources.add(R5.class);
    resources.add(R6.class);

  }

  @Override
  public Set<Class<?>> getClasses() {
    return resources;
  }



}
