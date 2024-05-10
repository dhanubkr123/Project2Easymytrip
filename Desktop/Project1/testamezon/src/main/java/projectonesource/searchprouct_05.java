package projectonesource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchprouct_05 {
	ChromeDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchoption ;
	
	
	
	public void searchpro()
	{
		searchoption.sendKeys("sandle");
		searchoption.sendKeys(Keys.ENTER);
	}
	
	public searchprouct_05 (ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
