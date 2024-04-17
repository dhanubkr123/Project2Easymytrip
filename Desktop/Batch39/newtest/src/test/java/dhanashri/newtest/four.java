package dhanashri.newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class four 
{
	@Test
	public void facebook()
	{
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.facebook.com/");
		d1.manage().window().maximize();
		d1.findElement(By.id("email")).sendKeys("testghface@gmail.com");
		d1.findElement(By.id("pass")).sendKeys("ghy6889");
		d1.findElement(By.xpath("//button[@value='1']")).click();
	}

}
