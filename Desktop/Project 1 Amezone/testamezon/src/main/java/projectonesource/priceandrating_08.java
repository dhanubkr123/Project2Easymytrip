package projectonesource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class priceandrating_08 {
	
	ChromeDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchoption ;
	


	
	@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
	WebElement rates;
	
	public void searchpro()
	{
		searchoption.sendKeys("sandal for kids");
		searchoption.sendKeys(Keys.ENTER);
	}
	


	
	public void ratingfour(ChromeDriver driver)
	{
		rates.click();
		Assert.assertEquals(driver.getTitle(), "Amazon.in : sandal for kids");
	}
	
	public priceandrating_08 (ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
