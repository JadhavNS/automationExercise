package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignUpOrLoginPage;
import testBase.BaseTest;

public class TC02 extends BaseTest {
	
	@Test
	public void verify_TC02_Login()
	{
		
		logger.info("---------Starting the TC02---------");
		
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickSignUpLogin();
		logger.info("Clicked on SignUP login link");
		
		SignUpOrLoginPage lp=new SignUpOrLoginPage(driver);
		String msg=lp.displayTxtLoginToYourAccount();
		Assert.assertEquals(msg, "Login to your account");
		logger.info("Login to your account is Displayed");
		
		lp.setLoginEmail(p.getProperty("loginEmail"));
		lp.setLoginPassword(p.getProperty("loginPassword"));
		lp.clickLogin();
		
		String user=hp.getUserName();
		System.out.println(user);
		Assert.assertTrue(user.contains("Bhola"),"User name 'Bhola' not found ");
		logger.info("Bhola is displayed");
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		
		
		logger.info("---------Finished the TC02---------");
		
	}

}
