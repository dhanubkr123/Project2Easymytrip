package testcases.testamezon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testcase_01 extends lunchquit{
	
	@Test
	@Parameters ("broswer")
	
	public void ameazone(String nameofbroswer) throws InterruptedException
	{
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("8999399584");
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		WebElement pas=driver.findElement(By.id("ap_password"));
		pas.sendKeys("dhanubkr93");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
		  WebElement r=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		  r.sendKeys("sandals"); r.sendKeys(Keys.ENTER);
         WebElement child = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/81LBFuFKrpL._AC_UL320_.jpg']"));
		    child.click();
		 	Set<String> d = driver.getWindowHandles();
			System.out.println(d);
			Thread.sleep(2000);
			Iterator<String> k = d.iterator();
			String t1 = k.next();
			String u = k.next();// child window
			driver.switchTo().window(u);
			
			WebElement add=driver.findElement(By.id("add-to-cart-button"));
			add.click();
			WebElement proced=driver.findElement(By.cssSelector("[name='proceedToRetailCheckout']"));
			proced.click();
			WebElement address=driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']"));
			address.click();
			/*WebElement cc1=driver.findElement(By.xpath("//input[@name='ppw-instrumentRowSelection']"));
			cc1.click();
			
			 * WebElement
			 * carddet=driver.findElement(By.xpath("//a[text()='Enter card details']"));
			 * carddet.click();
			 */
			driver.quit();
			
			/*
			 * WebElement m=driver.findElement(By.id("'add-to-wishlist-button-submit'"));
			 * m.click(); Set<String> d1= driver.getWindowHandles(); System.out.println(d1);
			 * Thread.sleep(2000); Iterator<String> k1 = d1.iterator(); String t2 =
			 * k1.next(); String u1 = k.next();// child window driver.switchTo().window(u1);
			 * 
			 * WebElement
			 * ko=driver.findElement(By.xpath("//span[text()= 'Continue shopping']"));
			 * ko.click();
			 */
			  
			//  WebElement n=driver.findElement(By.tagName("add-to-cart-button"));
			  
			 
	}
	
	


	}
/*
 * Login>Searching->selecting->adding to wishlist-> adding to cart->reach till
 * payments page and select CC payment method
 */