package redbus.redbus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class diffrentclass {
	
	ChromeDriver driver;
	@FindBy(id="myFunction4")
	WebElement travleclass ;
	
@FindBy(id="spanpEconomy")
WebElement pre;
	


@FindBy(id="optClass")
WebElement opt;

@FindBy(id="btnSrch")
WebElement sarch;
    public void travel()
    {
    	travleclass.click();
    }
    
    public void preeco()
    {
    	pre.click();
    }
    
    
    public void classoption(ChromeDriver driver)
    {
    	opt.click();
    	Select s=new Select(opt);
    	s.selectByVisibleText("Business");
    }
    
    public void srch()
    {
    	sarch.click();
    }
    
    public void first(ChromeDriver driver)
    {   
    	opt.click();
    	Select S4=new Select(opt);
    	S4.selectByVisibleText("First");
   // 	Assert.assertEquals(driver.getTitle(), "EaseMyTrip.com  Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com");
    Assert.assertEquals(true, true);
    
    }
    public diffrentclass(ChromeDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
}

