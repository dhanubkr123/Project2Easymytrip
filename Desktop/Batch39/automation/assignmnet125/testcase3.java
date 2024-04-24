package Dhanashri.seleniumthree;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testcase3 extends launchquit
{
@Test
public void add_card() throws InterruptedException
{
	
	WebElement ha = driver.findElement(By.cssSelector("#twotabsearchtextbox"));

	ha.sendKeys("shoes");
	ha.sendKeys(Keys.ENTER);
	WebElement child = driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
	child.click();
	
	Set<String> d = driver.getWindowHandles();
	System.out.println(d);
	Thread.sleep(5000);

	Iterator<String> k = d.iterator();
	String t1 = k.next();
	String u = k.next();// child window
	driver.switchTo().window(u);
	WebElement child1 = driver.findElement(By.cssSelector("[name='submit.add-to-cart']"));
	child1.click();
	
	/*
	 * WebElement cart =
	 * driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	 * cart.click();
	 */
	Set<String> q = driver.getWindowHandles();
	System.out.println(q);
	Thread.sleep(2000);
	

}
}
