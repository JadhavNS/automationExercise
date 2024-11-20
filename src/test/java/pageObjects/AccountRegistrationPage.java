package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import pageBase.BasePage;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	@FindBy(xpath="//input[@id='id_gender1']") WebElement btnMr;
	public void setMr()
	{
		btnMr.click();
	}
	
	@FindBy(xpath="//input[@id='id_gender2']") WebElement btnMrs;
	public void setMrs()
	{
		btnMrs.click();
	}
	
	//@FindBy(xpath="//input[@id='name']") WebElement txtName;
	//@FindBy(xpath="//input[@id='email']") WebElement 
	@FindBy(xpath="//input[@id='password']") WebElement txtPassword;
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	
	@FindBy(id="days") WebElement dayDropDown;
	@FindBy(id="months") WebElement monthDropDown; 
	@FindBy(id="years") WebElement yearsDropDown;
	public void selectDOB(String date, String month, String year)
	{
		Select selectDay=new Select(dayDropDown);
		selectDay.selectByVisibleText(date);
		
		Select selectMonth=new Select(monthDropDown);
		selectMonth.selectByVisibleText(month);
		
		Select selectYear=new Select(yearsDropDown);
		selectYear.selectByVisibleText(year);
	}
	
	@FindBy(xpath="//input[@id='newsletter']") WebElement chkNewsletter;
	public void clickNewsletter()
	{
		chkNewsletter.click();
	}
	
	@FindBy(xpath="//input[@id='optin']") WebElement chkOptin;
	public void clickOptin()
	{
		chkOptin.click();
	}
	
	@FindBy(xpath="//input[@id='first_name']") WebElement txtFirstName;
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	@FindBy(xpath="//input[@id='last_name']") WebElement txtLastName;
	public void setLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	
	@FindBy(xpath="//input[@id='company']") WebElement txtCompany;
	public void setCompany(String company)
	{
		txtCompany.sendKeys(company);
	}
	
	@FindBy(xpath="//input[@id='address1']") WebElement txtAddress;
	public void setAddress(String address)
	{
		txtAddress.sendKeys(address);
	}

	@FindBy(xpath="//input[@id='address2']") WebElement txtAddress2;
	public void setAddress2(String address2)
	{
		txtAddress.sendKeys(address2);
	}
	
	@FindBy(id="country") WebElement countryDropDown;
	public void selectCountry(String country)
	{
		Select selectCountry=new Select(countryDropDown);
		selectCountry.selectByVisibleText(country);
	}
	
	@FindBy(id="state") WebElement txtState;
	public void setState(String state)
	{
		txtState.sendKeys(state);
	}
	
	@FindBy(id="city") WebElement txtCity;
	public void setCity(String city)
	{
		txtCity.sendKeys(city);
	}
	
	@FindBy(id="zipcode") WebElement txtZipcode;
	public void setZipcode(String zcode)
	{
		txtZipcode.sendKeys(zcode);
	}
	
	@FindBy(id="mobile_number") WebElement txtMobileNumber;
	public void setMobileNumber(String mnumber)
	{
		txtMobileNumber.sendKeys(mnumber);
	}
	
	@FindBy(xpath="//button[@data-qa='create-account']") WebElement btnCreateAccount;
	public void clickCreateAccount()
	{
		btnCreateAccount.click();
	}
	
	@FindBy(xpath="//a[@data-qa='continue-button']") WebElement btnContinue;
	public void clickContinue()
	{
		btnContinue.click();
	}
	
	@FindBy(xpath="//b[text()='Account Created!']") WebElement msgAccountCreated;
	public String getAccountCreationMsg()
	{
		try
		{
			return (msgAccountCreated.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
