package projectonetest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import projectonesource.adcart_09;



public class tescase9_addcart extends lunchquitprojectone {
	


	@Test
	@Parameters ("broswer")
	public void addandcart(String nameofbroswer) throws InterruptedException 

	{
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		adcart_09 addpro=new adcart_09(driver);
		/*
		 * addpro.email(); addpro.continubutton(); addpro.pass(); addpro.login();
		 * Thread.sleep(1000);
		 */
		addpro.searchpro();
		Thread.sleep(1000);
		addpro.first(driver);
		Thread.sleep(1000);
		addpro.addcartone();
		Thread.sleep(1000);
		addpro.verifycartoption(driver);


}
}
