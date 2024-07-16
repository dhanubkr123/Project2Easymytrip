package testngproject.testingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class testcase9 {
	ChromeDriver driver;
	public void testcas9()
	{
		driver=new ChromeDriver();
		   driver.get("https://grotechminds.com/registration/");
		   driver.findElement(By.name("email")).sendKeys("baikardhanashri@gmail.com");
		   WebElement g=driver.findElement(By.name("email"));
				   g.sendKeys(Keys.CONTROL+"A");
				   g.sendKeys(Keys.CONTROL+"C");
				
				   WebElement h=driver.findElement(By.id("password"));
				   h.sendKeys(Keys.CONTROL+"V");


				   driver.findElement(By.id("Female")).click();
					



				 WebElement y= driver.findElement(By.name("Present-Address"));
				 y.sendKeys("Mumbai Borivali");
				 y.sendKeys(Keys.CONTROL+"A");
				   y.sendKeys(Keys.CONTROL+"C");
				  WebElement p=driver.findElement(By.id("Permanent-Address"));
				  p.sendKeys(Keys.CONTROL+"V");
				  driver.findElement(By.id("Pincode")).sendKeys("400093");
				  WebElement K=driver.findElement(By.xpath("//select[@name='Relegion']"));
				    Select m=new Select(K);
				     m.selectByVisibleText("Hindu");
				     WebElement upload = driver.findElement(By.id("file"));
				 	upload.sendKeys("C:\\Users\\HP\\Desktop\\Batch39\\Assignmeet no31.txt");
				      
				      driver.findElement(By.xpath("//input[@class='relocate form-check-input']")).click();
				      driver.findElement(By.xpath("//button[@name='Submit']")).click();
				      
					}

				   
		   
		   
			


	}



