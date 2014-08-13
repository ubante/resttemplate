package com.ubante.fromclassday1;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * The souts help show the lifecycle.
 */
@ApplicationPath("v1")
public class Appconfig extends Application{
  Set<Class<?>> resources = new HashSet<>();
  Set<Object> singletons = new HashSet<>();

  public Appconfig()
  {
    // sout writes to console
    System.out.println("Creating Appconfig...");
    resources.add(R1.class);
    resources.add(R2.class);
    resources.add(R3.class);
    resources.add(R4.class);
    resources.add(R5.class);
    resources.add(R6.class);
    resources.add(R7.class);
    resources.add(R8.class);
    resources.add(R9.class);

    singletons.add(new R9());
  }

  @Override
  public Set<Class<?>> getClasses() {
    System.out.println("GetClasses()");
    return resources;
  }

  @Override
  public Set<Object> getSingletons() {
    System.out.println("Getting singletons");
    return singletons;
  }

}
