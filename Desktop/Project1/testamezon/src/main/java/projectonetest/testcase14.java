package projectonetest;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import projectonesource.rating14testcase;

public class testcase14{

	
	@Test
	public void rateandorder()
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	rating14testcase rating=new rating14testcase(driver);
	rating.email1();
	rating.continubutton1();
	rating.pass1();
	rating.login1();
	rating.orderandreturn();
	rating.orderdetails();
	rating.ratingproduct();
	rating.subrate1();
	rating.subrate2();
	rating.subrate3();

	rating.subrate1();
}
}