package com.github.josephgeorgek.controller;

public class Onboarding {
	String message = "foo";
	  String message2 = "toto";

	  public String foo() {
	    return message;
	  }

	  public String toto() {
	    return message2;
	  }

	  public void uncoveredMethod() {
	    System.out.println(foo());
	  }
}
