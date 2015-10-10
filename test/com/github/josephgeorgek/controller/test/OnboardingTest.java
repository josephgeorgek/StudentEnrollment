package com.github.josephgeorgek.controller.test;

import static org.junit.Assert.*;
import com.github.josephgeorgek.controller.Onboarding;;

import org.junit.Test;

public class OnboardingTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	  public void testFoo() throws Exception {
		Onboarding one = new Onboarding();
	    assertEquals("foo", one.foo());
	  }

	  @Test
	  public void testBoth() throws Exception {
		  Onboarding one = new Onboarding();
	    assertEquals("toto", one.toto());
	    assertEquals("foo", one.foo());
	  }

}
