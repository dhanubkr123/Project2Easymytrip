package dhanashri.newtest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class three {
	@Test(priority=2)
	
		public void logingoogle() throws AWTException
		{
		ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.google.com/");
		   driver.manage().window().maximize();

		 WebElement ele=driver.findElement(By.linkText("Gmail"));
		 Actions a1=new Actions(driver);
		 a1.contextClick(ele).perform();
		 Robot r1=new Robot();
		 r1.keyPress(KeyEvent.VK_DOWN);
		 r1.keyPress(KeyEvent.VK_DOWN);
		 r1.keyPress(KeyEvent.VK_ENTER);
		}
		 
		 
		 @Test(priority=1)
		 
			 public void testregister()
			 
			 {
			 System.out.println("this is testcae2");
			 
		      }
		 
		 
		 @Test (priority=3)
		 public void testcase3()
		 {
			 System.out.println("this is testcase3");
		 }



		   
		   

}

			
	


