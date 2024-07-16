package testngproject.testingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class testcase_10 {
	
	ChromeDriver driver;
	
	public void testcase10blog() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		WebElement doubleclick=driver.findElement(By.partialLinkText("Blog"));
        Thread.sleep(2000);
		  Actions d=new Actions(driver);
		  d.doubleClick(doubleclick).perform();
		  driver.close();
		
	}

}
