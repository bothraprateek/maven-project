package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  * @param Name of the person
  *@return Hello Person
  */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
