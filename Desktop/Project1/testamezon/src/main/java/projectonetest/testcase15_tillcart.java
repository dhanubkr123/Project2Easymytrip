package projectonetest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import projectonesource.logintocart_15scenario;

public class testcase15_tillcart

{
	
	@Test
	
	public void amezonewithoutlogin() throws InterruptedException
	
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logintocart_15scenario login=new logintocart_15scenario(driver);
		login.searchproduct();
		login.productbook(driver);
		login.addproductintocart();		
	}

}
