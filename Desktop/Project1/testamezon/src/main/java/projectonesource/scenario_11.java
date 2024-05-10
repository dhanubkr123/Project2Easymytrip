package projectonesource;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class scenario_11 {
	ChromeDriver driver;
	@FindBy(name = "email")
	WebElement usernamemobile;

	@FindBy(id = "continue")
	WebElement continue_button;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(xpath = "//span[@class='a-button-inner']")
	WebElement signinbutton;

	@FindBy(id = "nav-cart-count")
	WebElement cartbutton;

	@FindBy(xpath = "(//span[@class='a-button-text a-declarative'])[2]")
	WebElement clickpro;
	
	

	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement creditoption;
	
	@FindBy(xpath="//a[text()='Enter card details']")
	WebElement  carddetails;
	
	@FindBy(xpath="//button[@id='pp-ute7Yb-25-announce']")
	WebElement canclecard;
	

	public void email1() {
		usernamemobile.sendKeys("8999399584");
	}

	public void continubutton1() {
		continue_button.click();
	}

	public void pass1() {
		pass.sendKeys("dhanubkr93");
	}

	public void login1() {
		signinbutton.click();
		Assert.assertTrue(signinbutton.isDisplayed());
	}

	public void clickcart() {
		cartbutton.click();
		
	}


	public void addcount() {
		clickpro.click();
		Select s1 = new Select(clickpro);
		// s1.selectByValue("quantity_5");
		s1.selectByValue("5");
		
	}
	
	

	public void creditop()

	{
		//Assert.assertEquals(driver.getTitle(),"Select a Payment Method - Amazon.in Checkout");

		creditoption.click();
		
	}
	
	public void carddetail() 
	{
		carddetails.click();
		//driver.switchTo().alert().dismiss();
	}
	public void canclec()
	{
		canclecard.click();
		
	}

	public scenario_11(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
