package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageBase.BasePage;

public class ProductPage extends BasePage{
	
	public ProductPage(WebDriver driver)
	{
		super(driver);
	}

	
	@FindBy(xpath="//input[@id='search_product']") WebElement txtSearchBox;
	public void setSearch(String search)
	{
		txtSearchBox.sendKeys(search);
	}
	
	@FindBy(xpath="//button[@id='submit_search']") WebElement btnSearch;
	public void clickSearch()
	{
		btnSearch.click();
	}
	
	@FindBy(xpath="//ul[@class='nav nav-pills nav-justified']//li//a") WebElement btnViewProduct;
	public void clickViewProduct()
	{
		btnViewProduct.click();
	}
	
	
	
	
	
	
}
