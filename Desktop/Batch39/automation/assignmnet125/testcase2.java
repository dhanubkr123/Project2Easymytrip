package Dhanashri.seleniumthree;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testcase2 extends launchquit
{
	@Test
	
	public void add_product() throws InterruptedException
	{
		
		WebElement ha = driver.findElement(By.cssSelector("#twotabsearchtextbox"));

		ha.sendKeys("shoes");
		ha.sendKeys(Keys.ENTER);
		
		WebElement child = driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
	//	WebElement child1=driver.findElement(By.className("[class='_bGlmZ_tint_M0L-m']"));
		child.click();
		
		Set<String> d = driver.getWindowHandles();
		System.out.println(d);
		Thread.sleep(5000);

		Iterator<String> k = d.iterator();
		String t1 = k.next();
		String u = k.next();// child window
		driver.switchTo().window(u);

}
}
