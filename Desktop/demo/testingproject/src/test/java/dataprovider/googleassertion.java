package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class googleassertion {

	@Test
	public void googlearch() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement s = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		s.sendKeys("India");
		s.sendKeys(Keys.ENTER);
		Assert.assertEquals(driver.getTitle(),"india - Google Search","page not display");


	}

}
