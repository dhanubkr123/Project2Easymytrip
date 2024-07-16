package testngproject.testingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class testcase7 {
	ChromeDriver driver;
	
	
	public void test7grotechregi()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");
		WebElement r=driver.findElement(By.id("firstName"));
		r.sendKeys("dhanau");
		WebElement la=driver.findElement(By.name("lastName"));
		la.sendKeys("chougule");
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("testnew@gmail.com");

		WebElement phone=driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("6543234567");

		WebElement sel=driver.findElement(By.xpath("//select[@id='gender']"));
		sel.click();
		Select ge=new Select(sel);
		ge.selectByIndex(2);

		WebElement E=driver.findElement(By.xpath("//select[@id='state']"));
		E.click();

		Select u=new Select(E);
		u.selectByIndex(16);

		driver.findElement(By.name("aadhaar")).sendKeys("654321234567");
		driver.findElement(By.id("pan")).sendKeys("BGBOL8765W");

		driver.findElement(By.id("terms")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		
	}

}
