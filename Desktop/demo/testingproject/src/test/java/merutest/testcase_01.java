package merutest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import merusource.meruhome;

public class testcase_01 
{
@Test

	public void abou_us()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mahindralogistics.com/mobility-solutions/#");
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			meruhome m=new meruhome(driver);
			//m.openabout();
			//m.purpose_visoion();
			m.clickhomepage();
			m.tarckorder();
			m.pincodecheck();
			
			
}


}
