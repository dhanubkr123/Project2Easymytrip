package projectonesource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deletetheproduct {
	ChromeDriver driver;
	@FindBy(name = "email")
	WebElement usernamemobile;

	@FindBy(id = "continue")
	WebElement continue_button;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(xpath = "//span[@class='a-button-inner']")
	WebElement signinbutton;

	@FindBy(id = "nav-cart-count")
	WebElement cartbutton;

	@FindBy(xpath = "(//span[@class='a-button-text a-declarative'])[1]")
	WebElement clickpro;

	@FindBy(xpath = "//span[@data-action='delete']")
	WebElement dele;

	public void email1() {
		usernamemobile.sendKeys("8999399584");
	}

	public void continubutton1() {
		continue_button.click();
	}

	public void pass1() {
		pass.sendKeys("dhanubkr93");
	}

	public void login1() {
		signinbutton.click();
	}

	public void clickcart() {
		cartbutton.click();
	}

	public void deleone() {

		if (dele.isDisplayed()) {
			dele.click();
		}

	}

	public deletetheproduct(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
