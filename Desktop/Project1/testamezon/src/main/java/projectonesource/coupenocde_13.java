package projectonesource;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class coupenocde_13 {
	ChromeDriver driver;
	@FindBy(name = "email")
	WebElement usernamemobile;

	@FindBy(id = "continue")
	WebElement continue_button;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(xpath = "//span[@class='a-button-inner']")
	WebElement signinbutton;

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchpro;
	
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[2]")
	WebElement firstproduct;
	
	@FindBy(xpath="//input[@id='buy-now-button']")
	WebElement buy;
	
	@FindBy(xpath="//input[@name='ppw-claimCode']")
	WebElement code;
	
	@FindBy(xpath="//input[@name='ppw-claimCodeApplyPressed']")
	WebElement apply;
	
	public void email() {
		usernamemobile.sendKeys("8999399584");
	}

	public void continubutton() {
		continue_button.click();
	}

	public void pass() {
		pass.sendKeys("dhanubkr93");
	}

	public void login() {
		signinbutton.click();
	}

	public void searchp() {
		searchpro.sendKeys("ladies watch");
		searchpro.sendKeys(Keys.ENTER);

	}
	public void firstitem(ChromeDriver driver) throws InterruptedException
	{
		firstproduct.click();
		Set<String> d = driver.getWindowHandles();
		  System.out.println(d);
		  Thread.sleep(2000); 
		  Iterator<String> k = d.iterator(); 
		  String t1 = k.next();
		  String u = k.next();
		 driver.switchTo().window(u);
		 
		
	}
	
	public void buyproduct()
	{
		buy.click();
	}
	
	public void applycode()
	{
		code.sendKeys("FGH7654h");
	}
	public void applyone(ChromeDriver driver)
	{
		apply.click();
		Assert.assertEquals(driver.getTitle(), "Select a Payment Method - Amazon.in Checkout");
	}
	
	public coupenocde_13(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
