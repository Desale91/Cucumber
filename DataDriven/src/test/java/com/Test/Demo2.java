package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import DataDriven.ExcelReader;
import DataDriven.ExcelReader3;

public class Demo2  {

	@Test(dataProvider = "login")
	public void Register(String fname, String lastname, String uname) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Class\\ChromeDriver Details\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.name("reg_email__")).sendKeys(uname);
		Thread.sleep(7000);
		driver.quit();
	}

	@DataProvider(name = "login")
	public Object[][] testdata() {

		ExcelReader3 obj = new ExcelReader3("D:\\\\12.03.2020\\\\TestNG And Data driven FrameWork\\\\Excel Data\\\\TestingData.xlsx");

		int row = obj.countRows(0);
		int cols = obj.countCells(1, 0);

		Object[][] abc = new Object[row][cols];

		for (int i = 0; i < row; i++) {
			abc[i][0] = obj.getData(1, i, 0);
			abc[i][1] = obj.getData(1, i, 1);
			abc[i][2] = obj.getData(1, i, 2);
		}
		return abc;
	}

}
