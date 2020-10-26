package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

	@FindBy(css="[id=block_top_menu] > ul > li:nth-child(3) > a")
	private WebElement selectTshirts;
	
	
	public OrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrder()
	{
		return selectTshirts;
	}
}
