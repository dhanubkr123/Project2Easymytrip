package projectonesource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class oneupdateproduct 
{

	  @FindBy(id="nav-cart-count")
	    WebElement cartbutton;
	    
	    @FindBy(xpath="(//span[@class='a-button-text a-declarative'])[2]")
	    WebElement clickpro;
	
	
	 public void  clickcart()
	    {
	    	cartbutton.click();
	    }
	    public void addcount()
	    {
	    	clickpro.click();
	    	
	    	
	    }
	    public oneupdateproduct(ChromeDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
}

