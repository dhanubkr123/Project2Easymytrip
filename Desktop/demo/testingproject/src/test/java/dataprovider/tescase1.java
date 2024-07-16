//"Assertions Concept Questions:
//1. When logged in amazon application, how will you use assertion to decide test case is pass or fail?"

package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tescase1 {
//WebDriver driver;
	@Test(retryAnalyzer=dataprovider.RetryLogic.class)
	public void amezon() {
		
		{
			
			  WebDriver driver=new ChromeDriver(); driver.get("https://www.amazon.in/");
			  driver.manage().window().maximize();
			 WebElement signin=driver.findElement(By.id("nav-link-accountList"));
			 Actions t=new Actions(driver);
			 t.moveToElement(signin).perform();
			 WebElement u=driver.findElement(By.xpath("//span[text()='Sign in']"));
			 u.click();
		
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In","sorry title are not matching");
		//Assert.assertEquals(false, true);
	//	Assert.assertTrue(false);


			 
		
	}
}}
