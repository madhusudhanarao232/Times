package testscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionsTest {
	@Test
	public  void autoSuggetions() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com/");
	driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	List<WebElement> all = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
	for(WebElement ele:all) {
		String text = ele.getText();
		Thread.sleep(50);
		Reporter.log(text,true);
	}
	driver.close();
	}

}
