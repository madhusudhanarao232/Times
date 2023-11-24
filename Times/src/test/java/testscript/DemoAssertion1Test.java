package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAssertion1Test {
@Test(groups = {"smokeTest"})
public void verifyTitle()
{   
//	WebDriverManager.firefoxdriver().setup();
//	WebDriver driver=new FirefoxDriver();
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	//System.exit(0);
	driver.get("https://www.google.com/");
	String eTitle = "Google";
	String aTitle = driver.getTitle();
	try {
	Assert.assertTrue(true);	
	Assert.assertEquals(aTitle, eTitle,"Hard ASSERt FAILED HardAssert ");
	Reporter.log("Hard Assert Comparision PASS.....",true);
	} finally {
		Reporter.log("HardAssert NOT MATCHING FAIL .....",true);
		driver.close();
	}
	
	
}
}
