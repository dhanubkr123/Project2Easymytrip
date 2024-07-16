package dartsource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dartlogin {
	

    ChromeDriver Driver;
    @FindBy(xpath="//a[text()='Login']")
    WebElement login;
    
    @FindBy(xpath="//input[@type='text']")
    WebElement username;
    
    @FindBy(name="user_password")
    WebElement pass;
    
    @FindBy(xpath="//span[text()='Sign In']")
    WebElement signin;
    
    public void logingro()
    {
    	login.click();
    }
    
    public void grousername()
    {
    	username.sendKeys("baikardhanashri@gmail.com");
    }
    public void gropass()
    {
      pass.sendKeys("Dhanubkr@93");
}
    
    public void signintogro()
    {
    	signin.click();
    }
    
    public Dartlogin (ChromeDriver driver)
  	{
  		PageFactory.initElements(driver,this);
  	}
}
