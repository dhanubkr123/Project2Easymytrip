package projectonesource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class verifysearchfilter_06 {
	ChromeDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchoption ;
	
	@FindBy(linkText="Women's Shoes")
	WebElement category;
	
	@FindBy(linkText="₹1,000 - ₹2,500")
	WebElement price;
	
	
	
	public void searchpro()
	{
		searchoption.sendKeys("sandals for women");
		searchoption.sendKeys(Keys.ENTER);
	}
	
	public void categoery()
	{
		category.click();
		
	}
	public void priceshoe(ChromeDriver driver)
	{
	price.click();
	Assert.assertEquals(driver.getTitle(), "Amazon.in : sandals for women");
	}
	
	public verifysearchfilter_06 (ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}




