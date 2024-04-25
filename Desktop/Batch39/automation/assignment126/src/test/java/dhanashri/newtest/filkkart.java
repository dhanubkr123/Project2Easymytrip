package dhanashri.newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class filkkart {
	WebDriver driver;
	@Test
	public void filkartlogin() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();
		WebElement r=driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
		r.sendKeys("8999399584");
	//	driver.close();
		WebElement otp=driver.findElement(By.xpath("//button[text()='Request OTP']"));
		otp.click();
		Thread.sleep(12000);
		
		
	}

}
