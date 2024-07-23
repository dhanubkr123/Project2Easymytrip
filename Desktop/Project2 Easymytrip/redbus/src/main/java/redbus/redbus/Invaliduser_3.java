package redbus.redbus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Invaliduser_3 {
ChromeDriver driver;
	
	@FindBy(linkText="Login or Signup")
	WebElement clickon;
	
	@FindBy(id="shwlogn")
	WebElement customer;
	
	@FindBy(id="txtEmail")
	WebElement email;
	@FindBy(id="shwotp")
	WebElement cbutton;
	
public void signbutton(ChromeDriver driver)
	{
	Actions s=new Actions(driver);
    s.moveToElement(clickon).perform();

	}
public void customerlogin()
{
	customer.click();
}
public void emailone()
{
	email.sendKeys("000000000");
}

public void conti(ChromeDriver driver)
{
	cbutton.click();
	Assert.assertFalse(false, "Invalid user ");
}
	
	


	public Invaliduser_3(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
