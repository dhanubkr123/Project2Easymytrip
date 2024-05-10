package projectonesource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class editprofile4scenario {
	


	ChromeDriver driver;
    @FindBy(name="email")
    WebElement usernamemobile;
    
    @FindBy(id="continue")
    WebElement continue_button;
    
    @FindBy(name="password")
    WebElement pass;
    
    @FindBy(xpath="//span[@class='a-button-inner']")
    WebElement signinbutton;
    
    @FindBy(id="nav-link-accountList")
    WebElement profileclick;
    
	/*
	 * @FindBy(xpath="//span[@data-testid='manage-profiles-button']") WebElement
	 * managelink;
	 * 
	 * @FindBy(linkText="View") WebElement whoshopp;
	 * 
	 * @FindBy(xpath="(//span[@class='a-declarative'])[5]") WebElement editp;
	 * 
	 * @FindBy(xpath="//span[@class='editProfile']") WebElement updateusername;
	 * 
	 * @FindBy(xpath="//input[@class='a-button-input'][3]") WebElement conti;
	 */	
    
    @FindBy(xpath="//*[@id=\"a-page\"]/div[1]/div/div[2]/div[2]/a/div/div/div")
    WebElement secuirt;
    
    @FindBy(xpath="//a[text()='Edit']")
    WebElement editus;
    
    @FindBy(xpath="//input[@name='customerName']")
	WebElement newname;
    
    @FindBy(xpath="//*[@id=\"cnep_1C_submit_button\"]")
    WebElement savechang;
    

    
    public void email()
    {
  	  usernamemobile.sendKeys("8999399584");
    }
    
    public void continubutton()
    {
  	  continue_button.click();
  	  
    }
    
    public void pass(ChromeDriver driver)
    {
  	  pass.sendKeys("dhanubkr93");
  	  Assert.assertTrue(pass.isDisplayed());
  	 
    }
    
    public void login()
    {
  	  signinbutton.click();
    }
    
    public void profile(ChromeDriver driver)
    {
    	profileclick.click();


    	//Actions a3=new Actions(this.driver=driver);
    //	a3.moveToElement(profileclick).perform();
            
          }
    
    public void editname()
    {
    	editus.click();
    }
    
   public void newnm()
   {   
	   for(int i=1;i<=19;i++)
	   {
		   newname.sendKeys(Keys.BACK_SPACE);  
	   }
	  
		
	   newname.sendKeys("dhanashri chougule");
   }
			
			/*
			 * public void managep() { managelink.click(); }
			 * 
			 * public void shop() { whoshopp.click();
			 * 
			 * }
			 * 
			 * public void editpro() { editp.click(); } public void updateun() {
			 * updateusername.sendKeys("Dhanashrichogule"); conti.click(); }
			 */
    
    
    public void login_sec()
    {
    	secuirt.click();
    }
    
    public void savename() {
    	savechang.click();
    	
    }
    
    
    public editprofile4scenario(ChromeDriver driver)
   	{
   		PageFactory.initElements(driver,this);
   	}
    
    
}
