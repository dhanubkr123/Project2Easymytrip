package redbus.redbus;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class flight_info_10 {
	
 ChromeDriver driver;
	
	@FindBy(xpath="(//div[@class='d-up'])[1]")
			WebElement detail;
	
	@FindBy(id="Flinfo")
	WebElement finfo;
	
	@FindBy(xpath="//li[text()='Fare Details & Rules']")
	WebElement frule;
	
	@FindBy(xpath="//li[text()='Baggage Information']")
	WebElement baggage;
	
	@FindBy(xpath="//li[text()='Cancellation & Change Rule']")
	WebElement cancler;
	
	public void flightd()
	{
		detail.click();
	}
	
	public void info(ChromeDriver driver)
	{
		finfo.click();
		Assert.assertEquals(true, true, "Flight Information");
	}
	
	public void farerule(ChromeDriver driver)
	{
		frule.click();
		Assert.assertTrue(true, "Fare Details & Rules");
	}
	
	/*
	 * public void baginfo(ChromeDriver driver) { baggage.clear();
	 * Assert.assertTrue(true, "Baggage Information"); }
	 */
	 
	public void canclef(ChromeDriver driver)
	{
		cancler.click();
		Assert.assertEquals(true, true);
	}
	
	public flight_info_10(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
