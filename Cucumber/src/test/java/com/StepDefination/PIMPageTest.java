package com.StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPageTest extends BaseClass {
	

	String employeeid;

	@Given("user is on pim page and click on add  button")
	public void user_is_on_pim_page_and_click_on_add_button() {

		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		driver.findElement(By.id("btnAdd")).click();

	}

	@When("create a new employee")
	public void create_a_new_employee() {

		driver.findElement(By.id("firstName")).sendKeys("abc");
		driver.findElement(By.id("lastName")).sendKeys("xyz");
		employeeid = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
	}

	@Then("fillup more personal details")
	public void fillup_more_personal_details() {
		driver.findElement(By.id("btnSave")).click();
		WebElement wb = driver.findElement(By.id("personal_cmbNation"));
		Select sel = new Select(wb);
		sel.selectByVisibleText("Indian");
		String selectedValue = sel.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedValue, "Indian");
		driver.findElement(By.id("btnSave")).click();
	}

	@Then("search user by using employee id")
	public void search_user_by_using_employee_id() {
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(employeeid);
		driver.findElement(By.id("searchBtn")).click();

	}

	@Then("delete newly created user")
	public void delete_newly_created_user() {
		driver.findElement(By.xpath("//table[@id='resultTable']//td[1]")).click();
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();

	}

}
