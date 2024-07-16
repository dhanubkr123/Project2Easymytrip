import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class amezonlogin {
	WebDriver driver;
	@Test
	public void  testcase1()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.getTitle();
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("8999399584");
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		WebElement pas = driver.findElement(By.id("ap_password"));
		pas.sendKeys("dhanubkr93");
		
		//Assert.assertTrue(pas.isDisplayed());
		//Assert.assertTrue(pas.equals(pas));
         WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
	//	Assert.assertEquals(driver.getTitle(),"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");	

		/*  WebElement
		  profilemenu=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		  Actions y=new Actions(driver); y.moveToElement(profilemenu).perform();
		  
			
			 * WebElement signout=driver.findElement(By.xpath("//span[text()='Sign Out']"));
			 * signout.click();
			 */
		
		//payment screen 
		
		WebElement profile=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		profile.click();
		
		WebElement paymentmethod=driver.findElement(By.xpath("//span[text()='Edit or add payment methods']"));
		paymentmethod.click();
		
		Assert.assertEquals(driver.getTitle(), " Manage Payment Methods ","invalid page");
	
	}

}
