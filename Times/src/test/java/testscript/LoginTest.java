package testscript;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
@Test(groups = {"smokeTest","regressionTest"})
public void login() throws Throwable {
	/*
	FileInputStream fis= new FileInputStream("./data/commondata.properties");
	Properties p=new Properties();
	p.load(fis);
	String URL = System.getProperty("url", p.getProperty("url"));
	String USERNAME = System.getProperty("username", p.getProperty("username"));
	String PASSWORD = System.getProperty("password", p.getProperty("password"));
//	WebDriverManager.firefoxdriver().setup();
//	WebDriver driver=new FirefoxDriver();
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();

	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("username")).sendKeys(USERNAME);
	driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Reporter.log(" Acti TIME Login",true);
	driver.quit();
	*/
	Reporter.log("\u001B[1m"+"\u001B[100m"+"\u001B[34m"+"MADHUSUDHANA RAO"+"\u001B[0m",true);
}
}
