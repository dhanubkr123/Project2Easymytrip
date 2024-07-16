package pomtestpackage;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomsource.amezone_login;
import pomsource.amezonehomepage;

public class testcasesearchproduct {
	
	@Test
	public void searchingproduct()
	
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			amezonehomepage p1=new amezonehomepage(driver);
			p1.searchproduct();
			amezonehomepage p2=new amezonehomepage(driver);
			p2.featurecheck();
			
			  amezonehomepage p3=new amezonehomepage(driver); p3.newarrival();
			 
	}
}
