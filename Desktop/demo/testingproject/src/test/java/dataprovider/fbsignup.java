package dataprovider;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class fbsignup {
	
	@DataProvider(name="data1")
	public Object[][] register()
	{
		Object data[][]=new Object [1][4];
		data[0][0]="dtest";
		data[0][1]="bkr";
		data[0][2]="baiahjt@gmail.com";
		data[0][3]="hdsg";
		return data;
		
	
	}
	@Test(dataProvider="data1")
	public void regis(String fname,String sname,String em,String pwd) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    WebElement newreg=driver.findElement(By.xpath("//a[text()='Create new account']"));
	     newreg.click();
	     Thread.sleep(2000);
			/*
			 * Set<String> d = driver.getWindowHandles(); System.out.println(d);
			 * Thread.sleep(2000); Iterator<String> k = d.iterator(); String t1 = k.next();
			 * String u = k.next();// child window driver.switchTo().window(u);
			 */


	     
	  
	     WebElement fname1=driver.findElement(By.xpath("//input[@name='firstname']"));
	     fname1.sendKeys(fname);
	     
	     WebElement sname1=driver.findElement(By.xpath("//input[@name='lastname']"));
	     sname1.sendKeys(sname);
	     sname1.sendKeys(Keys.ENTER);
	     
	     WebElement email=driver.findElement(By.xpath("//div[text()='Mobile number or email address"));
	     email.sendKeys(em);
	     
	     WebElement pass=driver.findElement(By.xpath("//div[text()='New password']"));
	     pass.sendKeys(pwd);
	     
	     WebElement submit=driver.findElement(By.xpath("//button[text()='Sign Up']"));
	     submit.click();
	   
	     
	     driver.quit();
	     
	
	}

}
