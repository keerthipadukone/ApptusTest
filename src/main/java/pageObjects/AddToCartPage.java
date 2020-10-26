package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	@FindBy(css="#add_to_cart > button > span")
	private WebElement addItemTocart;
	
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getItemToCart()
	{
		return addItemTocart;
	}
}
