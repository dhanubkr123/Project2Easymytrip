package projectonetest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

import projectonesource.newuser;

public class testcas_01 {

	@Test

//	@Parameters("broswer")
	public void signup() throws InterruptedException {

		
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&prevRID=ZQZF185THZQE61YV2B2H&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 

		newuser ne = new newuser(driver);

		ne.yourname();
		ne.mobile_no(driver);
		ne.pass();
		ne.verify_mo();
		Thread.sleep(12000);
	}

}
