package BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DataDriven.ExcelReader3;

public class BaseClass extends ExcelReader3{
	public static WebDriver driver;

	public BaseClass(String path) {
		super(path);
	}
	public static void initilaztion() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Class\\ChromeDriver Details\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		System.out.println("==========3");
		driver.get(ExcelReader3.getData(1, 0, 0));
		System.out.println("==========3");
	}

}
