package projectonesource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class productdetails_7 {
	ChromeDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchoption ;
	
	@FindBy(linkText="Men's Running Shoes")
	WebElement category;
	
	@FindBy(linkText="₹500 - ₹1,000")
	WebElement price;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement productfirst;
	
	
	
	public void searchpro()
	{
		searchoption.sendKeys("shoe");
		searchoption.sendKeys(Keys.ENTER);
	}
	
	public void categoery()
	{
		category.click();
		
	}
	public void priceshoe()
	{
	price.click();
	}
	
	public void productfirstone()
	{
		productfirst.click();
		Assert.assertEquals("ABROS Men's Draco ASGO0113 Sports Shoes/Casual Shoes/Running Shoes", "ABROS Men's Draco ASGO0113 Sports Shoes/Casual Shoes/Running Shoes");
		//ABROS Men's Draco ASGO0113 Sports Shoes/Casual Shoes/Running Shoes
	}
	


	
	
	public productdetails_7 (ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}



