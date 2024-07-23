package redbus.redbus;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class testoneway {
	ChromeDriver driver;
	
	@FindBy(xpath="//div[@id='frmcity']")
	WebElement fromlocation;
	
	
	@FindBy(xpath="(//div[text()='Top Cities'])[1]")
	WebElement topcities;
	
	@FindBy(xpath="//p[text()='Chhatrapati Shivaji International Airport']")
	WebElement bom;
	
	@FindBy(xpath="(//ul[@class='ausuggest'])[1]")
	WebElement droplist;
	
	@FindBy(xpath="(//div[@class='mflexcol'])[3]")
	WebElement mum;
	
	@FindBy(xpath="(//div[@class='mflexcol'])[12]")
	WebElement del;
	
	
	@FindBy(xpath="//li[@id='fiv_2_30/07/2024']")//li[@id='']
	WebElement date1;
	
	@FindBy(id = "trd_4_15/08/2024")
	WebElement dep;
	
	@FindBy(xpath="//button[@class='srchBtnSe']")
	WebElement search;
	
	
	public void from(ChromeDriver driver)
	{
		fromlocation.click();
		
		


		
	//	Select s=new Select(fromlocation);
		//s.selectByVisibleText("Mumbai(BOM)");
		//fromlocation.sendKeys(Keys.ENTER);
	}
	
	public void top(ChromeDriver driver)
	{
		Actions s=new Actions(driver);
	    s.moveToElement(bom).perform();
	 // bom.sendKeys("Mumbai");
	}
	public void mumbai()
	{
		mum.click();
	}
	
	public void delhi()
	{
		del.click();
	}
	
	/*
	 * public void datetrip() { Actions s=new Actions(driver);
	 * s.moveToElement(date1).perform();
	 * 
	 * }
	 */
	
	public void depature(ChromeDriver driver)
	{
		Actions s2=new Actions(driver);
	    s2.moveToElement(dep).perform();
	    dep.click();
	}
	
	public void searchbutton(ChromeDriver driver)
	{
		search.click();
		Assert.assertEquals(driver.getTitle(),"EaseMyTrip.com Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com");
	}
	    
	public testoneway(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
