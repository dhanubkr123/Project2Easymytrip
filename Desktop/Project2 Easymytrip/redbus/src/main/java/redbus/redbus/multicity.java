package redbus.redbus;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class multicity {
	ChromeDriver driver;
	
	@FindBy(id="liMulticity")
	WebElement multi ;
	
	@FindBy(id="txtToAuto1_show")
	WebElement mutitocity;
	
	@FindBy(xpath="//span[text()='Bangalore(BLR)']")
	WebElement bang;
	
   @FindBy(xpath="(//button[text()='Modify'])[2]")
   WebElement modifyupadte;
   
   @FindBy(id="btnSrchMul")
   WebElement multisearch;
   
   @FindBy(id="ddateMul1")
   WebElement dateraneg;
   
   @FindBy(xpath="(//a[@class='ui-state-default'])[1]")
   WebElement date1;
	
	
	public void multicityone()
	{
		multi.click();
	}
	public void mutilocation()
	{
		mutitocity.click();
	}
	public void banglour()
	{
		bang.click();
	}
	
	public void location_update(ChromeDriver driver)
	{  
		modifyupadte.click();
		//Assert.assertEquals(driver.getTitle(), "[EaseMyTrip.com Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com]");
		
	}
	
	public void calender_date()
	{
		dateraneg.click();
		
	}
	public void datepick()
	{
		date1.click();
	}
	
	public void multisearchlocation()
	{
		multisearch.click();
		Assert.assertEquals(true, true);
	}
	
	
	 public multicity(ChromeDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
}

