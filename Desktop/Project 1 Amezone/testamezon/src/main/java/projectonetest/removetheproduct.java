package projectonetest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import projectonesource.deletetheproduct;


public class removetheproduct extends lunchquitprojectone  {
	ChromeDriver driver=new ChromeDriver();
	@Test(enabled=true)
	@Parameters ("broswer")

public void delproduct(String nameofbroswer) throws InterruptedException
{

	
	  driver.get(
	  "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"
	  ); driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  deletetheproduct del=new deletetheproduct(driver);
	  del.email1();
	  del.continubutton1();
	  del.pass1();
	  del.login1();
	  del.clickcart();
	  del.deleone();
	  
	 

}
}
	  
	  
	 

