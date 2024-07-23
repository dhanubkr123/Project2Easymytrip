package redbus.redbus;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Testredbus {
	
	@Test
	
	public void signandlogin() throws InterruptedException
	{
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable -popup-blocking"));
		ChromeDriver driver=new ChromeDriver();
		//@Test(enabled=true)
		//driver.get("https://www.ixigo.com/flights?utm_source=google&utm_medium=paid_search_google&utm_campaign=ixigo_brand&gad_source=1&gclid=CjwKCAjw0YGyBhByEiwAQmBEWhLnNGniGPihZAfV58Fz9RuEvqSU_dZTJnTcVje5G0Tgm23iUgRBGBoCx1MQAvD_BwE&loginVisible=true");
		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=CjwKCAjwupGyBhBBEiwA0UcqaAs6navmuBY2JgvN70gC5qGvClxiyi-0KQpdXloY3IZ8401onCWOHBoCmgwQAvD_BwE");


		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Sourceeasytrip trip=new Sourceeasytrip(driver);
		trip.signbutton(driver);
	Thread.sleep(1000);
		trip.customerlogin();
		Thread.sleep(1000);
		trip.emailone();
		trip.conti();
		Thread.sleep(1000);



}
}
