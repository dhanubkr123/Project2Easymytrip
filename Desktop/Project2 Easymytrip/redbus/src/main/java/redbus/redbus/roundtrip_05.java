package redbus.redbus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class roundtrip_05 {

	ChromeDriver driver;

	@FindBy(xpath = "//div[@id='frmcity']")
	WebElement fromlocation;

	@FindBy(xpath = "(//div[text()='Top Cities'])[1]")
	WebElement topcities;

	@FindBy(xpath = "//p[text()='Chhatrapati Shivaji International Airport']")
	WebElement bom;

	@FindBy(xpath = "(//ul[@class='ausuggest'])[1]")
	WebElement droplist;

	@FindBy(xpath = "(//div[@class='mflexcol'])[3]")
	WebElement mum;

	@FindBy(xpath = "(//div[@class='mflexcol'])[12]")
	WebElement del;

	@FindBy(xpath = "(//div[@class='innerspcr'])[3]")
	WebElement date1;

	@FindBy(id = "fiv_2_28/05/2024")
	WebElement dep;
	
	@FindBy(xpath = "//div[@class='fss_flex depdate_colm sechver retu-date-n']")
	WebElement returndate;
	
	@FindBy(id="fiv_5_31/05/2024")
	WebElement re;
	

	@FindBy(xpath = "//button[@class='srchBtnSe']")
	WebElement search;

	public void from(ChromeDriver driver) {
		fromlocation.click();

	}

	public void top(ChromeDriver driver) {
		Actions s = new Actions(driver);
		s.moveToElement(bom).perform();


	}

	public void mumbai() {
		mum.click();
	}

	public void delhi() {
		del.click();
	}

	public void depature(ChromeDriver driver) {
		Actions s2 = new Actions(driver);
		s2.moveToElement(dep).perform();
		dep.click();
	}
	
	
	public void returntrip(ChromeDriver driver)
	{
		
		
		returndate.click();
		//Assert.assertEquals(driver.getTitle(),
				
	}
	
	public void exact(ChromeDriver driver)
	{
		Actions s3=new Actions(driver);
		s3.moveToElement(re).perform();
		re.click();
	}
	
	

	public void searchbutton(ChromeDriver driver) {
		search.click();
		Assert.assertEquals(driver.getTitle(),
				"EaseMyTrip.com Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com");
	}

	public roundtrip_05(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
