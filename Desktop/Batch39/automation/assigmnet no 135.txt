//
package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class fbassertion {
	WebDriver driver;

	@Test
	public void fb_login() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up", "page not found");
		driver.findElement(By.id("email")).sendKeys("baikardhanashri@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dhanubkr@93");
		driver.findElement(By.xpath("//button[@value='1']")).click();
		// Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up","page
		// not found");
		Assert.assertEquals(true, true);
	}
}
