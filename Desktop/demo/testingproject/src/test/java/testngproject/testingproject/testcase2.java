package testngproject.testingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class testcase2 {
	ChromeDriver driver;
	
	
		public void tescase2doubleclick() throws InterruptedException {
			driver=new ChromeDriver();
			driver.get("https://grotechminds.com/registration/");
			driver.manage().window().maximize();
			WebElement doubleclick=driver.findElement(By.partialLinkText("Courses"));
	          Thread.sleep(2000);
			  Actions d=new Actions(driver);
			  d.doubleClick(doubleclick).perform();

	}

}
