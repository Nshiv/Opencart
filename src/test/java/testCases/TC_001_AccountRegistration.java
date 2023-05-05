package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import testBase.BaseClass;
import pageObjects.AccountRegPage;

public class TC_001_AccountRegistration extends BaseClass
{
	
	
	@Test(groups= {"Sanity","Regression"})
	void test_account_Registration()
	{
		logger.info("**** Starting TC_001_AccountRegistration **** ");
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyaccount();
		logger.info("Clicked on my account");
		hp.clickRegister();
		//logger.info("Clicked on register");
		AccountRegPage ar = new AccountRegPage(driver);
		ar.setFirstName(randomString());
		logger.info("Entering data on register screen");
		ar.setLastName(randomString());
		ar.setEmail(randomString()+"@gmail.com");
		ar.setTelephone(randomNumber());
		String pwd = randomAlphanumeric();
		ar.setPassword(pwd);
		ar.setConfirmPassword(pwd);
		ar.clickTnC();
		logger.info("All data passed to register screen");
		ar.clickSubmit();
		logger.info("Clicked on submit button");
		String conMessage=ar.getSuccessMessage();
		logger.info("validating expected message");
		Assert.assertEquals(conMessage, "Your Account Has Been Created!");
		}catch(Exception e)
		{
			logger.info("test failed");
			e.getMessage();
		}
		logger.info("test case completed");
		}
		
	}
	
	


