package testngproject.testingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class testcase6 {
	ChromeDriver driver;
	
public void testcase6() throws InterruptedException
{
	
   driver=new ChromeDriver();
	
	driver.get("https://grotechminds.com/mousemover/");
	driver.manage().window().maximize();
	WebElement U=driver.findElement(By.linkText("DemoLink4"));
	U.click();
	driver.navigate().back();
	Thread.sleep(2000);
	WebElement o=driver.findElement(By.linkText("DemoLink3"));
	o.click();

}
}
