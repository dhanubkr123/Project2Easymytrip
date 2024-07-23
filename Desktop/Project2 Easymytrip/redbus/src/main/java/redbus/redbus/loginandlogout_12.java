package redbus.redbus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginandlogout_12 {
	
ChromeDriver driver;
@FindBy(id="welcome-det-User")
WebElement clickon1;


@FindBy(xpath="//span[text()='Log Out']")
WebElement log;





  public void profile1() { clickon1.click(); }
 
	
	public void logoutbutton(ChromeDriver driver)
	{
	Actions s=new Actions(driver);
    s.moveToElement(clickon1).perform();

	}
	
	public void logout()
	{
		log.click();
	}
	
	
	
	
	public loginandlogout_12(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
