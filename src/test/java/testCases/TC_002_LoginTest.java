package testCases;

import testBase.BaseClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC_002_LoginTest extends BaseClass
{

	@Test(groups= {"Sanity"})
	public void test_login()
	{
		try {
		logger.info("**** Starting TC_002_LoginTest **** ");
		HomePage hp = new HomePage(driver);
		hp.clickMyaccount();
		logger.info("**** Clicked on my account **** ");
		hp.clickLogin();
		logger.info("**** Clicked on loginlink **** ");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmail(rb.getString("email"));
		lp.setPassword(rb.getString("password"));
		lp.clicklogin();
		
		
		MyAccountPage map = new MyAccountPage(driver);
		boolean targetPage = map.isMyaccountPageExists();
		Assert.assertEquals(targetPage, true,"invalid data provided");
		}catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("**** Finished  TC_002_LoginTest **** ");
		
	}
}
