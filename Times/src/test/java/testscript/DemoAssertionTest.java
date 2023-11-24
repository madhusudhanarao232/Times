package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAssertionTest {
@Test
public void verifyTitle()
{
//	 WebDriverManager.firefoxdriver().setup();
//	WebDriver driver=new FirefoxDriver();
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();

	driver.get("https://www.google.com/");
	String eTitle = "Google";
	String aTitle = driver.getTitle();	
	if (aTitle.equals(eTitle)) {
		System.out.println(" if - else Title is matching and PASS");
	}
	else
	{
		System.out.println("if - else  Title is NOT matching and FAIL");
	}
	driver.close();
		
}

}
