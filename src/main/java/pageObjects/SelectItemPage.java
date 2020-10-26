package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectItemPage {
	
	@FindBy(css="#center_column > ul > li > div > div.right-block > h5 > a")
	private WebElement selectItem;
	
	
	public SelectItemPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getItem()
	{
		return selectItem;
	}

}
