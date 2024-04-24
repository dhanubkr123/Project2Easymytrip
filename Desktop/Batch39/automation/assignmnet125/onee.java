package Dhanashri.seleniumthree;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class onee {

	@Test

	public void login() throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/x-path/");
		driver.findElement(By.xpath("//input[@type='FirstName']")).sendKeys("dtest");
		driver.findElement(By.xpath("//input[@type='LastName']")).sendKeys("ctets");
		WebElement three = driver.findElement(By.xpath("//input[@type='MiddleName']"));
		three.sendKeys("prathtest");
		driver.findElement(By.id("Work-Place-Address")).sendKeys("mumbai");
		driver.findElement(By.name("home-address")).sendKeys("mumbai");
		driver.findElement(By.id("Personal-Email")).sendKeys("testrtuii@gmail.com");
		driver.findElement(By.id("Corporate-email")).sendKeys("trtuii@gmail.com");
		driver.findElement(By.id("tel")).sendKeys("9664555432");

		driver.findElement(By.cssSelector("[style=\"width: 100%;\"]")).click();
         //driver.close();
	}

@Test
public void newlogin()
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/");
	driver.findElement(By.linkText("Courses")).click();
	
}
}
