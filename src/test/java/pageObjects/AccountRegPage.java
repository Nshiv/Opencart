package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegPage extends BasePage {

	public AccountRegPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Elements

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtPhone;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//label[@class='radio-inline'][2]")
	WebElement radioButtonNo;
	
	@FindBy(xpath = "//label[@class='radio-inline'][1]")
	WebElement radioButtonYes;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement checkBoxTnC;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement buttonSubmit;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	//Actions
	
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String phone)
	{
		txtPhone.sendKeys(phone);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String pwd)
	{
		txtConfirmPassword.sendKeys(pwd);
	}
	
	public boolean getNewsLetter()
	{
		boolean status = radioButtonNo.isEnabled();
		return status;
	}
	
	public void clickTnC()
	{
		checkBoxTnC.click();
	}
	
	public void clickSubmit()
	{
		buttonSubmit.click();
	}
	
	public String getSuccessMessage()
	{
		try {
		return msgConfirmation.getText();
		}catch(Exception e)
		{
			return(e.getMessage());
		}
	}



}
