package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageBase.BasePage;

public class SignUpOrLoginPage extends BasePage {
	
	public SignUpOrLoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h2[text()='New User Signup!']") WebElement displayTxtSignUp;
	public String displayTxtSignUp()
	{
		try
		{
			return (displayTxtSignUp.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
	
	
	@FindBy(xpath="//input[@data-qa='signup-name']") WebElement txtSignUpName;
	public void setSignUpName(String name)
	{
		txtSignUpName.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@data-qa='signup-email']") WebElement txtSignUpEmail;
	public void setSignUpEmail(String email)
	{
		txtSignUpEmail.sendKeys(email);
	}
	
	@FindBy(xpath="//button[@data-qa='signup-button']") WebElement btnSignUp;
	public void clickSignUp()
	{
		btnSignUp.click();
	}
	
	@FindBy(xpath="//p[text()='Email Address already exist!']") WebElement displayTxtEmailAlreadyExitst;
	public String displayTxtEmailAlreadyExitst()
	{
		try
		{
			return (displayTxtEmailAlreadyExitst.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
	
	
	
	
	
	
	@FindBy(xpath="//h2[text()='Login to your account']") WebElement displayTxtLoginToYourAccount;
	public String displayTxtLoginToYourAccount()
	{
		try
		{
			return (displayTxtLoginToYourAccount.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
	
	
	@FindBy(xpath="//input[@data-qa='login-email']") WebElement txtLoginEmail;
	public void setLoginEmail(String email)
	{
		txtLoginEmail.sendKeys(email);
	}
	
	@FindBy(xpath="//input[@data-qa='login-password']") WebElement txtLoginPassword;
	public void setLoginPassword(String password)
	{
		txtLoginPassword.sendKeys(password);
	}
	
	@FindBy(xpath="//button[@data-qa='login-button']") WebElement btnLogin;
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	@FindBy(xpath="//p[text()='Your email or password is incorrect!']") WebElement displayTxtWrongLogin;
	public String displayTxtWrongLogin()
	{
		try
		{
			return (displayTxtWrongLogin.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
