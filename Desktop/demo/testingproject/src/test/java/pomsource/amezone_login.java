package pomsource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amezone_login {



      ChromeDriver Driver;
      @FindBy(name="email")
      WebElement usernamemobile;
      
      @FindBy(id="continue")
      WebElement continue_button;
      
      @FindBy(name="password")
      WebElement pass;
      
      @FindBy(xpath="//span[@class='a-button-inner']")
      WebElement signinbutton;
      
      
      public void email()
      {
    	  usernamemobile.sendKeys("8999399584");
      }
      
      public void continubutton()
      {
    	  continue_button.click();
      }
      
      public void pass()
      {
    	  pass.sendKeys("dhanubkr93");
      }
      
      public void login()
      {
    	  signinbutton.click();
      }
      
      public amezone_login(ChromeDriver driver)
  	{
  		PageFactory.initElements(driver,this);
  	}
	}


