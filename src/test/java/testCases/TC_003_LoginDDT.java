package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass 
{
	@Test(dataProvider ="LoginData",dataProviderClass= DataProviders.class, groups= {"Regression"})
	public void test_LoginDDT(String email, String password, String expected)
	{
		logger.info("**** Starting TC_003_LoginDDT ****");
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyaccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(password);
		lp.clicklogin();
		
		
		MyAccountPage map = new MyAccountPage(driver);
		boolean targetPage = map.isMyaccountPageExists();
		if(expected.equals("Valid"))
		{
			if(targetPage==true)
			{
				map.clickLogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		if(expected.equals("Invalid"))
		{
			if(targetPage==true)
			{
				map.clickLogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		}catch(Exception e)
		{
			e.getMessage();
		}
		logger.info("**** End of test case ****");
		

}}
