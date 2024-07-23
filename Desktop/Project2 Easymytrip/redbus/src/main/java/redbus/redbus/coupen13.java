package redbus.redbus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class coupen13 {
	
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
	
	
	@FindBy(xpath="//li[@id='fiv_2_30/07/2024']")
	WebElement date1;
	
	
	
	@FindBy(xpath="//button[@class='srchBtnSe']")
	WebElement search;
	
	@FindBy(xpath="//button[text()='Book Now'][1]")
	WebElement flight;
	
	@FindBy(xpath="//div[text()='DELIGHT']")
	WebElement copen;
	
	@FindBy(xpath="//span[@class='checkmark-radio']")
	WebElement poli;
	
	@FindBy(xpath="//input[@id='txtEmailId']")
	WebElement email;
	@FindBy(xpath="//span[@id='spnVerifyEmail']")
	WebElement cobook;
	
	public void from(ChromeDriver driver)
	{
		fromlocation.click();

	}
	
	public void top(ChromeDriver driver)
	{
		Actions s=new Actions(driver);
	    s.moveToElement(bom).perform();
	
	}
	public void mumbai()
	{
		mum.click();
	}
	
	public void delhi()
	{
		del.click();
	}
	
	
	public void arrival()
	{
		date1.click();
	}
	
	
	
	
	
	public void searchbutton()
	{
		search.click();
		//Assert.assertEquals(driver.getTitle(),"EaseMyTrip.com Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com");
	}
	
	public void seleflight()
	{
		flight.click();
	}
	
	
	public void coupen(ChromeDriver driver)
	{
		copen.click();
		Assert.assertEquals("DELIGHT", "DELIGHT");
	}
	
	public void policy()
	{
		poli.click();
	}
	
	public void em()
	{
		email.sendKeys("baikar123@gmail.com");
	}
	
	public void booking()
	{
		cobook.click();
	}
	
	
	    
	public coupen13(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
