package testcases;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.OrderPage;
import pageObjects.SelectItemPage;
import pageObjects.ValidateTextPage;


public class LoginTest {
	
	
		@Test
		public void LoginApp()
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
			
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
			//Assert.assertEquals(vp.getproduct().getText(), "Product successfully added to your shopping cart");*/
			
			/*ValidateTextPage vp=new ValidateTextPage(driver);
		System.out.println(vp.getproduct().getText());
		String actualText=vp.getproduct().getText();
		String ExpectedText="Product successfully added to your shopping cart";
		Assert.assertEquals(actualText, ExpectedText);*/
			
		}
		
		
}
