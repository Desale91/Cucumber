package com.Test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import DataDriven.ExcelReader3;

public class Demo1 extends BaseClass {
	
	public Demo1(String path) {
		super(path);
		System.out.println("============1");

	}
	
	ExcelReader3 obj = new ExcelReader3("D:\\12.03.2020\\TestNG And Data driven FrameWork\\Excel Data\\TestingData.xlsx");
	

	@Test (priority=1)
	public void setup() {
		System.out.println("============2");
		BaseClass.initilaztion();
		System.out.println("============4");
	}

	@Test (priority=2)
	public void loginFucntionaltiy() {
		String umane=ExcelReader3.getData(1, 2, 0);
		String userName=ExcelReader3.getData(1, 2, 1);
		driver.findElement(By.id(umane)).sendKeys(userName);
		driver.findElement(By.id(ExcelReader3.getData(1, 3, 0))).sendKeys(ExcelReader3.getData(1, 3, 1));
		driver.findElement(By.id(ExcelReader3.getData(1, 4, 0))).click();
	}
	
	@Test (priority=3)
	public void pimPage() {
		System.out.println("pim1");
		driver.findElement(By.xpath(ExcelReader3.getData(1, 5, 0))).click();
		System.out.println("pim2");
		String a=driver.getCurrentUrl();
		Assert.assertEquals(true, a.contains("pim"));
		driver.findElement(By.id(ExcelReader3.getData(1, 6, 0))).click();
		driver.findElement(By.id(ExcelReader3.getData(1, 7, 0))).sendKeys(ExcelReader3.getData(1, 7, 1));
		driver.findElement(By.id(ExcelReader3.getData(1, 8, 0))).sendKeys(ExcelReader3.getData(1, 8, 1));
		driver.findElement(By.id(ExcelReader3.getData(1, 9, 0))).sendKeys(ExcelReader3.getData(1, 9, 1));
		driver.findElement(By.id(ExcelReader3.getData(1, 10, 0))).sendKeys(ExcelReader3.getData(1, 10, 1));
		driver.findElement(By.id(ExcelReader3.getData(1, 11, 0))).sendKeys(ExcelReader3.getData(1, 11, 1));
		driver.findElement(By.id(ExcelReader3.getData(1, 11, 0))).click();
	}

	@Test (priority=4)
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
