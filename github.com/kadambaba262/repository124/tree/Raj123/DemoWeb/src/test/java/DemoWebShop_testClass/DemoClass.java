package DemoWebShop_testClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoClass {
	
	@Test
	public void logintest() {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chrome110\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");

	}

}
