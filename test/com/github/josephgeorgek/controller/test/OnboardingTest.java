package com.github.josephgeorgek.controller.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class OnboardingTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	  public void testFoo() throws Exception {
	    One one = new One();
	    assertEquals("foo", one.foo());
	  }

	  @Test
	  public void testBoth() throws Exception {
	    One one = new One();
	    assertEquals("toto", one.toto());
	    assertEquals("foo", one.foo());
	  }

}
