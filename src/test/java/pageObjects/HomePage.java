package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Elements
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement linkMyaccount;

	@FindBy(xpath = "//a[text()='Register']")
	WebElement linkRegister;

	@FindBy(xpath = "//a[text()='Login']")
	WebElement linkLogin;

	// Action method

	public void clickMyaccount() {
		linkMyaccount.click();
	}

	public void clickRegister() {
		linkRegister.click();
	}

	public void clickLogin() {
		linkLogin.click();
	}

}
