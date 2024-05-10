package projectonesource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class updateandremove_10 {
	
	 ChromeDriver driver;
	    @FindBy(name="email")
	    WebElement usernamemobile;
	    
	    @FindBy(id="continue")
	    WebElement continue_button;
	    
	    @FindBy(name="password")
	    WebElement pass;
	    
	    @FindBy(xpath="//span[@class='a-button-inner']")
	    WebElement signinbutton;
	    
	    @FindBy(id="nav-cart-count")
	    WebElement cartbutton;
	    
	    @FindBy(id="a-autoid-0-announce")
	    WebElement clickpro;
	    
	    
	    public void email1()
	    {
	  	  usernamemobile.sendKeys("8999399584");
	    }
	    
	    public void continubutton1()
	    {
	  	  continue_button.click();
	    }
	    
	    public void pass1()
	    {
	  	  pass.sendKeys("dhanubkr93");
	    }
	    
	    public void login1()
	    {
	  	  signinbutton.click();
          }
	    public void  clickcart()
	    {
	    	cartbutton.click();
	    }
	    public void addcount() throws InterruptedException
	    {
			clickpro.click();
			clickpro.sendKeys(Keys.DOWN);
			clickpro.sendKeys(Keys.ENTER);
			/*
			 * Select s2=new Select(clickpro); //s1.selectByValue("quantity_5");
			 * //s2.selectByVisibleText("quantity_4"); s2.selectByValue("1");
			 * System.out.println(s2.getFirstSelectedOption().getText());
			 * Thread.sleep(2000);
			 */



			  
			  
			  
			 
	    }
	    public updateandremove_10(ChromeDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		}



