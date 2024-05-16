package projectonetest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import projectonesource.editprofile4scenario;


public class testcase_04editprofile extends lunchquitprojectone {


	@Test
	@Parameters ("broswer")
	public void editpro(String nameofbroswer) throws InterruptedException
	{
		
		  ChromeDriver driver=new ChromeDriver();
		  driver.get(
		  "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"
		  ); driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		editprofile4scenario edita=new editprofile4scenario(driver);
		edita.email();
		edita.continubutton();
		edita.pass(driver);
		edita.login();
		Thread.sleep(3000);
		edita.profile(driver);
		Thread.sleep(3000);
		/*
		 * edita.managep(); //Thread.sleep(1000); edita.shop(); edita.editpro();
		 * edita.updateun();
		 */
		edita.login_sec();
		edita.editname();
		edita.newnm();
		edita.savename();
		driver.close();
	}
	

}
