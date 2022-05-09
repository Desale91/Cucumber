package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReader1 {
	WebDriver driver;
	
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Class\\ChromeDriver Details\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		
		File f=new File("D:\\12.03.2020\\TestNG And Data driven FrameWork\\Excel Data\\TestingData.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheets=workbook.getSheetAt(1);
		String url=sheets.getRow(0).getCell(0).getStringCellValue();
		driver.get(url);
		String uname=sheets.getRow(1).getCell(0).getStringCellValue();
		System.out.println(uname);
		String pass=sheets.getRow(1).getCell(1).getStringCellValue();
		System.out.println(pass);
		String adminUname=sheets.getRow(2).getCell(0).getStringCellValue();
		System.out.println(adminUname);
		String adminPass=sheets.getRow(2).getCell(1).getStringCellValue();
		System.out.println(adminPass);
		String clickLogin=sheets.getRow(1).getCell(2).getStringCellValue();
		System.out.println(clickLogin);
		String pimPage=sheets.getRow(3).getCell(0).getStringCellValue();
		System.out.println(pimPage);
		String addbtn=sheets.getRow(3).getCell(1).getStringCellValue();
		System.out.println(addbtn);
		String fname=sheets.getRow(3).getCell(2).getStringCellValue();
		System.out.println(fname);
		String mname=sheets.getRow(3).getCell(3).getStringCellValue();
		System.out.println(mname);
		String lname=sheets.getRow(3).getCell(4).getStringCellValue();
		System.out.println(lname);
		String employeeid=sheets.getRow(3).getCell(5).getStringCellValue();
		System.out.println(employeeid);
		String savebtn=sheets.getRow(3).getCell(6).getStringCellValue();
		System.out.println(savebtn);
		String fn=sheets.getRow(4).getCell(2).getStringCellValue();
		System.out.println(fn);
		String mn=sheets.getRow(4).getCell(3).getStringCellValue();
		System.out.println(mn);
		String ln=sheets.getRow(4).getCell(4).getStringCellValue();
		System.out.println(ln);
		String eid=sheets.getRow(4).getCell(5).getStringCellValue();
		System.out.println(eid);
		
		int cells = sheets.getRow(0).getLastCellNum();
		System.out.println(cells);
		
		driver.findElement(By.id(uname)).sendKeys(adminUname);
		driver.findElement(By.id(pass)).sendKeys(adminPass);
		driver.findElement(By.id(clickLogin)).click();
		driver.findElement(By.xpath(pimPage)).click();
		driver.findElement(By.id(addbtn)).click();
		driver.findElement(By.id(fname)).sendKeys(fn);
		driver.findElement(By.id(mname)).sendKeys(mn);
		driver.findElement(By.id(lname)).sendKeys(ln);
		driver.findElement(By.id(employeeid)).sendKeys(eid);
		driver.findElement(By.id(savebtn)).click();
		System.out.println("Login Successfull");
		
		
		
		driver.quit();
		
	}

	
}
