package com.StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksDemo {

	@Before
	public void setUp() {
		System.out.println("Before Hooks");
	}
	
	
	@After
	public void tearDown() {
		System.out.println("After hooks");
		System.out.println("---------------------------------------------");
	}
}
