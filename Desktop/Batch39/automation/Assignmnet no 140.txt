//Assignmnet no 140:skip test case using dependson method


package dataprovider;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonmethod {
	WebDriver driver;
	@Test
	public void login_amezon()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("8999399584");
		WebElement con=driver.findElement(By.cssSelector("#continue"));
		con.click();
		WebElement pss=driver.findElement(By.cssSelector("#ap_password"));
		pss.sendKeys("dhanubkr93");
		WebElement signin=driver.findElement(By.cssSelector("#signInSubmit"));
		signin.click();
		
		
		Assert.assertFalse(true);
	  //  Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	
	
	  @Test(priority=1,dependsOnMethods="login_amezon") 
	  public void logoutone() {
	  
	  
	  WebElement
	  profile=driver.findElement(By.cssSelector("#nav-link-accountList")); Actions
	  a1=new Actions(driver); a1.moveToElement(profile).perform();
	  
	  WebElement logout=driver.findElement(By.xpath("//span[text()='Sign Out']"));
	  logout.click(); //Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0","page not found"
	  Assert.assertEquals(driver.getTitle(), "Amazon Sign In","error in the page");
	  }
	 
		 
}
		
	



