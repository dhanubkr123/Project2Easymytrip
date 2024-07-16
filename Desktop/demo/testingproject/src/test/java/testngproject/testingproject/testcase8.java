package testngproject.testingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class testcase8 {
	ChromeDriver driver;
	public void test8draganddrop()
	{
		driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://grotechminds.com/drag-and-drop/");
		  WebElement u=driver.findElement(By.id("drag4"));
		  WebElement k=driver.findElement(By.id("div2"));
		  Actions a1=new Actions(driver);
		  a1.dragAndDrop(u,k).perform();
		  
	}

}
