package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidateTextPage {
		
		//@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2")
		
		@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6")
		private WebElement product;
		
		
		public ValidateTextPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public WebElement getproduct()
		{
			return product;
		}

	
}
