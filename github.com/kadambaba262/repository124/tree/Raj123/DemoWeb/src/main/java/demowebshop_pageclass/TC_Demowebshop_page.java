package demowebshop_pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demowebshop_baseclass.Demo_baseclass;

public class TC_Demowebshop_page extends Demo_baseclass {
	public TC_Demowebshop_page() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@autofocus=\"autofocus\"]" )
	public WebElement Username;
	
	@FindBy(xpath ="//input[@class=\"password\"]" )
	public WebElement Password;
	
	@FindBy(xpath = "//input[@class=\"button-1 login-button\"]")
	public WebElement loginbutton;
	


public void SetUsername(String Uname){
	System.out.println("asdfghjk");
	Username.sendKeys(Uname);		
}
public void SetPassword(String Pass) {
	System.out.println("asdfghjk");
	Password.sendKeys(Pass);
}
public void ClickButton() {
	loginbutton.click();
}
}

