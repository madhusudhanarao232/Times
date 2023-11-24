package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAssertion2Test {
	
@Test(groups = {"smokeTest"})
public void verifyTitle()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();

	driver.get("https://www.google.com/");
	String eTitle = "Google";
	String aTitle = driver.getTitle();
	SoftAssert s=new SoftAssert();
	//Ok
	s.assertEquals(aTitle, eTitle,"SOFT Assert FAIL...");
	
	Reporter.log("SoftAssert Passed .....",true);
	driver.close();
	s.assertAll();
	
}
}
