package DemoWebShop_testClass;

import org.testng.annotations.Test;

import demowebshop_baseclass.Demo_baseclass;
import demowebshop_pageclass.TC_Demowebshop_page;

public class TC_demowebshop_testClass extends Demo_baseclass {
	
	@Test
	public void logindata() throws InterruptedException {
		
		TC_Demowebshop_page pc = new TC_Demowebshop_page();
		pc.SetUsername(Em);
		pc.SetPassword(PWD);
		Thread.sleep(5000);
		pc.ClickButton();
	}
	
}
