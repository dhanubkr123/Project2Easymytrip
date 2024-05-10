package projectonesource;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentmethod12_test {
	ChromeDriver driver;
	@FindBy(name = "email")
	WebElement usernamemobile;

	@FindBy(id = "continue")
	WebElement continue_button;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(xpath = "//span[@class='a-button-inner']")
	WebElement signinbutton;

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchpro;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement firstproduct;
	
	@FindBy(id="buy-now-button")
	WebElement buy;
	
	/*
	 * @FindBy(id="pp-aVFfvm-102") WebElement netbanking;
	 */
	/*
	 * @FindBy(id="pp-aVFfvm-122") WebElement upione;
	 */
	/*
	 * @FindBy(id="pp-aVFfvm-132") WebElement cashpay;
	 */
	 
	/*
	 * @FindBy(xpath="//*[@id=\"pp-g4sxpS-134\"]") WebElement usepaymethod;
	 */
	public void email() {
		usernamemobile.sendKeys("8999399584");
	}

	public void continubutton() {
		continue_button.click();
	}

	public void pass() {
		pass.sendKeys("dhanubkr93");
	}

	public void login() {
		signinbutton.click();
	}

	public void searchp() {
		searchpro.sendKeys("ladies sandal");
		searchpro.sendKeys(Keys.ENTER);

	}
	public void firstitem(ChromeDriver driver) throws InterruptedException
	{
		firstproduct.click();
		Set<String> d = driver.getWindowHandles();
		  System.out.println(d);
		  Thread.sleep(2000); 
		  Iterator<String> k = d.iterator(); 
		  String t1 = k.next();
		  String u = k.next();
		 driver.switchTo().window(u);
		 
		
	}
	
	public void buyproduct()
	{
		buy.click();
	}

	/*
	 * public void netbank() 
	 * { netbanking.click(); } 
	 * public void upi() {
	 * upione.click(); }*/
	 
	/*
	 * public void cashon() { cashpay.click(); }
	 */
	/*
	 * public void paymemtmode() { usepaymethod.click(); }
	 */
	public paymentmethod12_test(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
