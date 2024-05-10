package projectonetest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import projectonesource.proceeditem;
import projectonesource.scenario_11;


public class testcase11payment  {
	ChromeDriver driver;

	@Test(retryAnalyzer=projectonetest.retrycode.class)
	
	public void paymentpage () throws InterruptedException

	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get( "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		scenario_11 payment = new scenario_11(driver);
		payment.email1();
		payment.continubutton1();
		payment.pass1();
		payment.login1();
		payment.clickcart();
		
		proceeditem d = new proceeditem(driver);
		d.selectitem();
		Thread.sleep(1000);
		d.pro();
		Thread.sleep(1000);
		d.add1();
		Thread.sleep(1000);
		d.useaddres(driver);
		Thread.sleep(1000);
		
		
		scenario_11 pay=new scenario_11(driver);
	
		pay.creditop();
		pay.carddetail();
		//driver.close();
	}

}
