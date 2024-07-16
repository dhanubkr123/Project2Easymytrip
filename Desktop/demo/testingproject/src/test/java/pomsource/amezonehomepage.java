package pomsource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class amezonehomepage {
	ChromeDriver driver;
	@FindBy(css = "#nav-link-accountList")
	WebElement accountndlist;

	@FindBy(xpath = "//span[text()='Sign Out']")
	WebElement signoutbutton;

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchfirstproduct;
	
	@FindBy(xpath= "//span[text()='Featured']")
	WebElement features;
	
	@FindBy(id="s-result-sort-select_4")
	WebElement newwarrival;

	
	  public void accountlist() {
	  
	  Actions as=new Actions(driver); 
	  as.moveToElement(accountndlist).perform();
	  
	  accountndlist.click();
	  
	  }
	  
	  public void signout()
	  
	  { signoutbutton.click(); 
	  }
	 

	public void searchproduct() {
		searchfirstproduct.sendKeys("Shoes");
		searchfirstproduct.sendKeys(Keys.ENTER);

	}
	
	public void featurecheck()
	{
		
		
		features.click();
		features.sendKeys(Keys.ENTER);
		features.sendKeys(Keys.ENTER);
		features.sendKeys(Keys.ENTER);
		features.sendKeys(Keys.ENTER);
		features.click();
	}
	
	
	  public void newarrival() {
	  
	  Select s1=new Select(newwarrival);
	  //s1.selectByVisibleText("Newest Arrivals"); s1.selectByIndex(4);
	  newwarrival.click(); }
	 
	
	
	/*
	 * public void customerreview() {
	 * 
	 * }
	 */

	public amezonehomepage(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
