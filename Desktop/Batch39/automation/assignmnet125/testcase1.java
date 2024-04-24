package Dhanashri.seleniumthree;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testcase1 extends launchquit
{
	@Test
	public void searchingthe_product()
	{
		WebElement ha = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        ha.sendKeys("shoes");
		ha.sendKeys(Keys.ENTER);
	}
	
}
