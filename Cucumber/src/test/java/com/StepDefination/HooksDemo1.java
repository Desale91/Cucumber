package com.StepDefination;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;

public class HooksDemo1 {


	@BeforeStep
	public void setUp() {
		System.out.println("BeforeStep Hooks");
	}
	
	
	@AfterStep
	public void tearDown() {
		System.out.println("AfterStep  hooks");
		System.out.println("---------------------------------------------");
	}
}
