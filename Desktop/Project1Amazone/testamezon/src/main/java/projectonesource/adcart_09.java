package projectonesource;


import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class adcart_09 {
	
	ChromeDriver driver;
	/*
	 * @FindBy(name="email") WebElement usernamemobile;
	 * 
	 * @FindBy(id="continue") WebElement continue_button;
	 * 
	 * @FindBy(name="password") WebElement pass;
	 * 
	 * @FindBy(xpath="//span[@class='a-button-inner']") WebElement signinbutton;
	 */

	ChromeDriver Driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchoption ;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement firstpro;
	

   @FindBy(id="add-to-cart-button")
	WebElement cart;
   
   @FindBy(xpath="//div[@id='nav-cart-count-container']")
   WebElement cartpage;
   
   
	/*
	 * public void email() { usernamemobile.sendKeys("8999399584"); }
	 * 
	 * public void continubutton() { continue_button.click(); }
	 * 
	 * public void pass() { pass.sendKeys("dhanubkr93"); }
	 * 
	 * public void login() { signinbutton.click(); }
	 */
	
	public void searchpro()
	{
		searchoption.sendKeys("shoes");
		searchoption.sendKeys(Keys.ENTER);
	}
	
	public void first(ChromeDriver driver) throws InterruptedException
	{
		firstpro.click();
		
		 Set<String> d = driver.getWindowHandles();
		  System.out.println(d);
		  Thread.sleep(2000); 
		  Iterator<String> k = d.iterator(); 
		  String t1 = k.next();
		  String u = k.next();
		 driver.switchTo().window(u);
		 
		 
		  
		 		 
	}
	
	public void addcartone() throws InterruptedException
	{

		cart.click();
		
    }
	
	public void verifycartoption(ChromeDriver driver)
	{
		cartpage.click();
	 Assert.assertNotEquals(driver.getTitle(), "Buy Campus Men's Kosmo PRO BLK/Beige Running Shoes - 9UK/India CG-535 at Amazon.in", "error in the page");
	}
	public  adcart_09(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
