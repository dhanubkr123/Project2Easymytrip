package testngproject.testingproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class testcase4
{
	ChromeDriver driver;
public void dropdowntestcase4()

{

 driver = new ChromeDriver();
	driver.get("https://grotechminds.com/dropdown/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement w = driver.findElement(By.xpath("//select[@class='form-select Choice1']"));
	w.click();
	Select s1 = new Select(w);
	s1.selectByIndex(3);
	WebElement w1 = driver.findElement(By.id("Choice2"));
	w1.click();
	Select s2 = new Select(w1);
	s2.selectByValue("practice4");
	WebElement w3 = driver.findElement(By.cssSelector("#Choice3"));
	w3.click();
	Select s3 = new Select(w3);
	s3.selectByVisibleText("Power4");
	WebElement w4 = driver.findElement(By.cssSelector("#Choice4"));
	w4.click();
	Select s4 = new Select(w4);
	s4.selectByIndex(5);
	WebElement w5 = driver.findElement(By.cssSelector("[class='form-select Choice5']"));
	w5.click();
	Select s5 = new Select(w5);
	s5.selectByValue("Day3");
	WebElement w6 = driver.findElement(By.xpath("//select[@class='form-select Choice6']"));
	Select s6 = new Select(w6);
	s6.selectByVisibleText("Night9");

	WebElement w7 = driver.findElement(By.xpath("//select[@class='form-select Choice7']"));
	Select s7 = new Select(w7);
	s7.selectByVisibleText("Night7");

	WebElement w8 = driver.findElement(By.xpath("//select[@class='form-select Choice7'][2]"));
	Select s8 = new Select(w8);
	s8.selectByIndex(8);

	
	WebElement w10 = driver.findElement(By.cssSelector(".Choice9"));
	w10.click();
	Select s10 = new Select(w10);
	s10.selectByIndex(11);

	WebElement w11 = driver.findElement(By.id("Choice10"));
	Select s11 = new Select(w11);
	s11.selectByValue("CoreJava4");
	TakesScreenshot ta = driver;

}
}
