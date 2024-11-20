package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageBase.BasePage;

public class HomePage extends BasePage {


	//1. Constructor
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//2. Locators
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[1]") WebElement lnkHome;
	public void clickHome() //3. Actions Methods
	{
		lnkHome.click();
	}

	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[2]") WebElement lnkProducts;
	public void clickProducts()
	{
		lnkProducts.click();
	}
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[3]") WebElement lnkCart;
	public void clickCart()
	{
		lnkCart.click();
	}
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[4]") WebElement lnkSignupLogin;
	public void clickSignUpLogin()
	{
		lnkSignupLogin.click();
	}
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[5]") WebElement lnkTestCases;
	public void clickTestCases()
	{
		lnkTestCases.click();
	}
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[6]") WebElement lnkApiTesting;
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[7]") WebElement lnkVideoTutorial;
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[8]") WebElement lnkContactUs;
	public void clickContactUs()
	{
		lnkContactUs.click();
	}
	
	@FindBy(xpath="//a[@href='/product_details/1']") WebElement lnkViewProduct;
	public void clickViewProduct()
	{
		lnkViewProduct.click();
	}
	
	@FindBy(xpath="//input[@id='susbscribe_email']") WebElement txtSubscriptionEmail;
	public void setEmail(String email)
	{
		txtSubscriptionEmail.sendKeys(email);
	}
	
	@FindBy(xpath="//a[@id='scrollUp']") WebElement btnScrollUp;
	public void clickScrollUp()
	{
		btnScrollUp.click();
	}
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[10]") WebElement loggedAsUserName;
	public String getUserName()
	{
		try
		{
			return (loggedAsUserName.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}

	@FindBy(xpath="//h2[text()='Full-Fledged practice website for Automation Engineers']") WebElement msgHomePage;
	public String getHomePageText()
	{
		try
		{
			return (msgHomePage.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']//li[5]") WebElement lnkDeleteAccount;
	public void deleteAccount()
	{
		lnkDeleteAccount.click();
	}
	
	@FindBy(xpath="//b[text()='Account Deleted!']") WebElement msgAccountDeleted;
	public String getAccountDeletedText()
	{
		try
		{
			return (msgAccountDeleted.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
	
	@FindBy(xpath="//a[@data-qa='continue-button']") WebElement btnContinue;
	public void clickContinue()
	{
		btnContinue.click();
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
