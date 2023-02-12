package demowebshop_baseclass;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import demowebshop_Configue.Read_Configue_Properties;

public class Demo_baseclass {
	public static WebDriver driver;

	Read_Configue_Properties cp = new Read_Configue_Properties();
	public String Cpath = cp.ChromePath();
	public String Em = cp.email();
	public String PWD = cp.Password();

	@BeforeMethod
	public void SetUp() {
		System.setProperty("Webdriver.chrome.driver", Cpath);

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
	}

	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
