package com.StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sample {

	@Given("user google page")
	public void user_google_page() {
		System.out.println("user google page");
	}

	@When("user click on gmail link")
	public void user_click_on_gmail_link() {
		System.out.println("user click on gmail link");
	}

	@Then("user will be on gmail login page")
	public void user_will_be_on_gmail_login_page() {
		System.out.println("user will be on gmail login page");
	}

	@Given("user is on a free crm login page")
	public void user_is_on_a_free_crm_login_page() {
		System.out.println("user is on a free crm login page");
	}

	@When("user enter uname and password")
	public void user_enter_uname_and_password() {
		System.out.println("user enter uname and password");
	}

	@Then("user is on free crm home page")
	public void user_is_on_free_crm_home_page() {
		System.out.println("user is on free crm home page");
	}
	
}
