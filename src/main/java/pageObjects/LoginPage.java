package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	@FindBy(css="a[title='Log in to your customer account']")
	private WebElement unTB;
	
	@FindBy(name="passwd")
	private WebElement pwTB;
	
	@FindBy(id="SubmitLogin")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
		
	public WebElement getUsername(String un)
	{
		return unTB;
	}
	
	public WebElement getPassword(String pwd)
	{
		return pwTB;
	}
	
	public WebElement submit()
	{
		return loginBtn;
	}
}
