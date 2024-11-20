package testBase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager; //log4j
import org.apache.logging.log4j.Logger;     //log4j
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	public static WebDriver driver;
	public Logger logger;
	public Properties p;
	
	@BeforeClass()
	@Parameters({"os", "browser"}) //same parameter we need to give here.
	public void setup(String os, String br) throws Throwable
	{
		
		//loading config.properties file
		FileReader file= new FileReader("./src/test/resources/config.properties");
		p=new Properties();
		p.load(file);
		
		logger=LogManager.getLogger(this.getClass()); //It will take running test class.
		
		switch(br.toLowerCase())
		{
		case "chrome" 	: driver=new ChromeDriver(); break;
		case "edge" 	: driver=new EdgeDriver(); break;
		case "firefox" 	: driver=new FirefoxDriver(); break;
		default 		: System.out.println("Invalid browser name ");
		return; //It will come out from execution. Because browser name is invalid then no need to execute tc.
		}
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL"));
	}
	
	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}
	
	public String randomString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomNumber()
	{
		String generatedNumber=RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}
	
	public String randomAlphaNumberic()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(3);
		String generatedNumber=RandomStringUtils.randomNumeric(3);
		return (generatedNumber+"#"+generatedString);
	}
	
	
	
	

}
