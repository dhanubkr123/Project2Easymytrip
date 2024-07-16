package pomsource;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class searchresult {
	ChromeDriver driver;


	@FindBy(id = "twotabsearchtextbox")
	WebElement searchfirstproduct; 
	
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
		WebElement firstproduct;
	
	@FindBy(xpath="//input[@name='submit.buy-now']")
	WebElement loginbuy;
	
	 @FindBy(name="email")
     WebElement usernamemobile;
     
     @FindBy(id="continue")
     WebElement continue_button;
     
     @FindBy(name="password")
     WebElement pass;
     
     @FindBy(xpath="//span[@class='a-button-inner']")
     WebElement signinbutton;
     
     
     
     
		
		public void searchproduct() {
			searchfirstproduct.sendKeys("Shoes");
			searchfirstproduct.sendKeys(Keys.ENTER);
		}
		
		
		public void clickonfirstproduct()
		{
			firstproduct.click();
		}
		 
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
	      
	      public void buyclick() throws InterruptedException
	      {
	    	  loginbuy.click();

	  	 	Set<String> d = driver.getWindowHandles();
	  		System.out.println(d);
	  		Thread.sleep(2000);
	  		Iterator<String> k = d.iterator();
	  		String t1 = k.next();
	  		String u = k.next();// child window
	  		driver.switchTo().window(u);
	      }
	      
	
	      
			
			


		public searchresult(ChromeDriver driver) 
		{
			PageFactory.initElements(driver, this);
	}
}


