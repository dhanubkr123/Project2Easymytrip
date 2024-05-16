package testcases.testamezon;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testcase_02 extends lunchquit
{
@Test
@Parameters ("broswer")
public void amezoneaddress(String nameofbroswer) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();

	driver.get(
			"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement email = driver.findElement(By.id("ap_email"));
	email.sendKeys("8999399584");
	WebElement cont = driver.findElement(By.id("continue"));
	cont.click();
	WebElement pas = driver.findElement(By.id("ap_password"));
	pas.sendKeys("dhanubkr93");
	WebElement signin = driver.findElement(By.id("signInSubmit"));
	signin.click();
	WebElement profileclick = driver.findElement(
			By.xpath("//a[@href='https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn']"));
	profileclick.click();
	WebElement editaddress = driver.findElement(By.xpath("//span[text()='Edit addresses for orders and gifts']"));
	editaddress.click();
	WebElement add = driver.findElement(By.id("ya-myab-plus-address-icon"));
	add.click();
	WebElement fna = driver.findElement(By.id("address-ui-widgets-enterAddressFullName"));
	fna.sendKeys("dtest");
	WebElement mobno = driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber"));
	mobno.sendKeys("9921457533");
	WebElement postal = driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode"));
	postal.sendKeys("400093");
	WebElement address = driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
	address.sendKeys("plot 63,sai parasad socicety");
	WebElement priaddress = driver.findElement(By.id("address-ui-widgets-enterAddressLine2"));
	priaddress.sendKeys("gorai 1,borivali west");

	WebElement landmark = driver.findElement(By.id("address-ui-widgets-landmark"));
	landmark.sendKeys("near by vimal hospital");
	Thread.sleep(2000);
	/*
	 * WebElement city = driver.findElement(By.xpath(
	 * "//input[@id='address-ui-widgets-enterAddressCity']"));
	 * priaddress.sendKeys("mumbai");
	 * 
	 * WebElement state = driver .findElement(By.id(
	 * "address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_20")); //
	 * ("//span[text()='Choose a state']']")); state.click();
	 * 
	 * Select sq = new Select(state); sq.selectByVisibleText("MAHARASHTRA");
	 */
	WebElement check = driver.findElement(By.cssSelector("[name='address-ui-widgets-use-as-my-default']"));
	check.click();
	// driver.close();
	/*
	 * check.sendKeys(Keys.TAB); check.sendKeys(Keys.TAB);
	 * check.sendKeys(Keys.ENTER);
	 */

	WebElement submit1 = driver
			.findElement(By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input"));
	submit1.click();
	WebElement r = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	r.sendKeys("sandals");
	r.sendKeys(Keys.ENTER);
	WebElement child = driver
			.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/81LBFuFKrpL._AC_UL320_.jpg']"));
	child.click();
	Set<String> d = driver.getWindowHandles();
	System.out.println(d);
	Thread.sleep(2000);
	Iterator<String> k = d.iterator();
	String t1 = k.next();
	String u = k.next();// child window
	driver.switchTo().window(u);

	WebElement add1 = driver.findElement(By.cssSelector("[title='Add to Shopping Cart']"));
	add1.click();
	WebElement proced1 = driver.findElement(By.cssSelector("[name='proceedToRetailCheckout']"));
	proced1.click();
	WebElement address1 = driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']"));
	address1.click();
	driver.quit();

}



}

