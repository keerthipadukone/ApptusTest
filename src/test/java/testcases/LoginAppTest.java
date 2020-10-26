package testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.OrderPage;
import pageObjects.SelectItemPage;
import pageObjects.ValidateTextPage;
import resources.Base;

public class LoginAppTest extends Base{

	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test	
	public void basePageNavigation() throws IOException
	{
		
		LandingPage lnp= new LandingPage(driver);			
		lnp.getSignIn().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getUsername("jetblue@grr.la");
		lp.getPassword("jetblue");
		lp.submit().click();
		
		OrderPage op= new OrderPage(driver);
		op.getOrder().click();
		
		SelectItemPage sp= new SelectItemPage(driver);
		sp.getItem().click();
		
		AddToCartPage ap=new AddToCartPage(driver);
		ap.getItemToCart().click();
		
		ValidateTextPage vp=new ValidateTextPage(driver);
		System.out.println(vp.getproduct().getText());
		
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
