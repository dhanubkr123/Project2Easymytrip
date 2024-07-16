package pomtestpackage;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomsource.amezonehomepage;
import pomsource.searchresult;

public class testcasesearchingfirstproduct
{
@Test
public void searchingproduct() throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*
		 * amezonehomepage p1=new amezonehomepage(driver); p1.searchproduct();
		 */

		searchresult s=new searchresult(driver);
		s.searchproduct();
		s.clickonfirstproduct();
		s.buyclick();
		s.email();
		s.continubutton();
		s.pass();
		s.login();
		
}
}
