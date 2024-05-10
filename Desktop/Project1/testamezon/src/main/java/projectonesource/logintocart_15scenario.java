package projectonesource;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logintocart_15scenario {
	ChromeDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searcbbox;
	
	@FindBy(xpath="//img[@src='https://m.media-amazon.com/images/I/61pZyTuNDYL._AC_UY218_.jpg']")
	WebElement selectproduct;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addcart;
	
	public void searchproduct()
	{
		searcbbox.sendKeys("Books");
		searcbbox.sendKeys(Keys.ENTER);
	}
	
	public void productbook(ChromeDriver driver) throws InterruptedException
	{
		selectproduct.click();
		 Set<String> d = driver.getWindowHandles();
		  System.out.println(d);
		  Thread.sleep(2000); 
		  Iterator<String> k = d.iterator(); 
		  String t1 = k.next();
		  String u = k.next();
		 driver.switchTo().window(u);
	}
	
	public void addproductintocart() 
	{
		addcart.click();
	}
	
   public logintocart_15scenario(ChromeDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
}
