package redbus.redbus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class otherdeatils_11 {
	
	@FindBy(xpath="(//button[@type='button'])[13]")
	WebElement book;
	
	
	@FindBy(name="txtEmailId")
	WebElement email;
	
	@FindBy(xpath="(//div[@class='insur-yes'])[2]")
	WebElement radio;
	
	@FindBy(id="spnVerifyEmail")
	WebElement contibooking;
	@FindBy(id="titleAdult0")
	WebElement title;
	
	@FindBy(name="txtFNAdult0")
	WebElement fname;
	
	@FindBy(id="txtLNAdult0")
	WebElement lname;
	
	@FindBy(id="txtCPhone")
	WebElement mo;
	
	@FindBy(id="spnTransaction")
	WebElement co;
	public void booking()
	{
		book.click();
	}
	public void radioone()
	{
		radio.click();
	}
	public void emailid()
	{
		email.sendKeys("testeasytrip@gmail.com");
	}
	
	public void contibutton()
	{
		contibooking.click();
	}
	
	public void titleone(ChromeDriver driver)
	{
		title.click();
		Select s=new Select(title);
		s.selectByVisibleText("MS");
		
	}
	
	public void first()
	{
		fname.sendKeys("dtest");

	}
	public void lastname()
	{
		lname.sendKeys("Automation");
	}
	
	public void mobile()
	{
		mo.sendKeys("9921457533");
	}
	public void cobooking()
	{
		co.click();
	}
	
	
	
	public otherdeatils_11(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
