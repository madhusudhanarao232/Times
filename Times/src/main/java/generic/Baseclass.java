package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver sdriver=null;
	public WebDriver driver=null;

	public FileUtility flib=new FileUtility();
    @BeforeClass
    public void OpenBrowser() throws Throwable {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	
    	String filepath = flib.getFilePathFromPropertiesFile("commondata");
    	String URL = flib.getDataFromProperties(filepath, "url");
    	sdriver=driver;
    	driver.get(URL);
    	Reporter.log("Launch the Browser",true);
    }
    @BeforeMethod
    public void loginToApplication() throws Throwable {
    	String filepath = flib.getFilePathFromPropertiesFile("commondata");
    	String USER_NAME = flib.getDataFromProperties(filepath, "username");
    	String PASSWORD = flib.getDataFromProperties(filepath, "password");
    
    	Reporter.log("Login to application",true);
    }
    @AfterMethod
    public void logOutFromAppliacation() {
    	Reporter.log("close/logout from Application",true);
    }
    @AfterClass
    public void closeBrowser() {
    	driver.quit();
    	Reporter.log("Close the  Browser",true);
    }
}
