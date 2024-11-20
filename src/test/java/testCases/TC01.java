package testCases;

import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import pageObjects.SignUpOrLoginPage;
import testBase.BaseTest;

public class TC01 extends BaseTest {

	@Test
	public void verify_TC01() 
	{
		logger.info("-------Starting TC01-------");

		try
		{
		HomePage hp = new HomePage(driver);
		String displayMsg = hp.getHomePageText();
		Assert.assertEquals(displayMsg, "Full-Fledged practice website for Automation Engineers");

		hp.clickSignUpLogin();
		logger.info("Clicked on SignUp/Login link");

		SignUpOrLoginPage sp = new SignUpOrLoginPage(driver);
		String displayTextsign = sp.displayTxtSignUp();
		Assert.assertEquals(displayTextsign, "New User Signup!");
		sp.setSignUpName(randomString().toUpperCase());
		sp.setSignUpEmail(randomString() + "@gmail.com");
		sp.clickSignUp();
		logger.info("Clicked on SignUp button");
		
		AccountRegistrationPage ap = new AccountRegistrationPage(driver);
		logger.info("Operations started on Account Registration page");
		ap.setMr();
		ap.setPassword("gaman123");
		ap.selectDOB("17", "June", "1980");
		ap.clickNewsletter();
		ap.clickOptin();
		ap.setFirstName("Gaman");
		ap.setLastName(randomString().toUpperCase());
		ap.setCompany("gaman pvt ltd");
		ap.setAddress("address 1");
		ap.setAddress2("address 2");
		ap.selectCountry("Canada");
		ap.setState("Newyork");
		ap.setCity("Yaka");
		ap.setZipcode("abcd1234");
		ap.setMobileNumber("1234567890");
		ap.clickCreateAccount();
		String accountCreated = ap.getAccountCreationMsg();
		Assert.assertEquals(accountCreated, "ACCOUNT CREATED!");
		ap.clickContinue();
		logger.info("Operations ended on Account Registration page");

		logger.info("Validation expected User Name");
		String userName = hp.getUserName();
		if (userName.contains("Gaman")) {
			System.out.println("User Name is present");
			assertTrue(true);
		} else {
			System.out.println("User Name is not present");
			assertTrue(false);
		}

		hp.deleteAccount();
		logger.info("Clicked on Delete Account link");
		String accountDelete = hp.getAccountDeletedText();
		Assert.assertEquals(accountDelete, "ACCOUNT DELETED!");

		hp.clickContinue();
		
		}
		catch(Exception e)
		{
			logger.error("Test case got some exception that's why test case failed");
			logger.debug("Debug log");
			Assert.fail();
		}

		logger.info("-------Finished TC01-------");
	}

}
