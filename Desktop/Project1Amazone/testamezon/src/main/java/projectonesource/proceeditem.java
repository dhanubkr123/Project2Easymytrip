package projectonesource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class proceeditem {
	ChromeDriver driver;
	@FindBy(xpath="(//div[@class='a-checkbox a-checkbox-fancy sc-item-check-checkbox-selector sc-list-item-checkbox'])[1]")
	WebElement check;
	
	@FindBy(xpath="//input[@name=\"proceedToRetailCheckout\"]")
	WebElement proced;
	
	@FindBy(xpath="//input[@name='submissionURL']")
	WebElement address;
	
	@FindBy(xpath="//input[@data-testid='Address_selectShipToThisAddress']")
	WebElement useadd;
	public void selectitem()
	{
		check.click();
	}
	
	public void pro()

	{
		proced.click();
	}
	
	public void add1()
	{
		address.click();
		Assert.assertTrue(useadd.isDisplayed());
		
	}
	
	public void useaddres(ChromeDriver driver)
	{
		useadd.click();
		//Assert.assertEquals(driver.getTitle(), "Select a delivery address");
		
	}
	
	
	/*
	 * @FindBy(xpath="(//span[@class='a-declarative'])[10]") WebElement del;
	 * 
	 * 
	 * public void deletep() { del.click(); //del.sendKeys(Keys.DELETE); } }
	 */
	 
	 public proceeditem(ChromeDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

}
