package projectonesource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class newuser {
  ChromeDriver driver;
  @FindBy(xpath="//input[@name='customerName']")
  WebElement user;
  
  @FindBy(id="ap_phone_number")
  WebElement mobileno;
  
  @FindBy(id="ap_password")
  WebElement newpass;
  
  @FindBy(xpath="//input[@id='continue']")
  WebElement verifyno;
  
  
  
  public void yourname()
  {
	  user.sendKeys("dhanashripchougule@gmail.com");
  }
  
  
  public void mobile_no(ChromeDriver driver)
  {
     mobileno.sendKeys("9921457533");
     Assert.assertEquals(driver.getTitle(), "Amazon Registration");
  }
  
  
  public void pass()
  {
	  newpass.sendKeys("Avnish@2020");
  }
    public void verify_mo()
    {
    	verifyno.click();
    	//Assert.assertTrue(verifyno.isDisplayed());
    	
    }
  
  
  public newuser(ChromeDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
}
