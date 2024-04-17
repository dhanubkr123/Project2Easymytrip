package dhanashri.newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class one {
	
	@Test
	public void loginAmezon()
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement dd=driver.findElement(By.xpath("//select[1]"));
		Select s1=new Select(dd);
		s1.selectByIndex(11);
		WebElement sh=driver.findElement(By.xpath("//input[@type='text']"));
		sh.sendKeys("world");
		sh.sendKeys(Keys.ENTER);
		WebElement se=driver.findElement(By.xpath("//a[@data-type='productTitle']"));
		se.click();
		driver.close();
		
	}
	

	

	
}
