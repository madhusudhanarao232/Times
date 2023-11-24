package Jsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Myntra {
	@Test
	public void fetchHomeDeckerListItems() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		WebElement home = driver.findElement(By.xpath("(//a[text()='Home & Living'])[position()=1]"));
		
		Actions a=new Actions(driver);
		a.moveToElement(home).perform();
		List<WebElement> names = driver.findElements(By.xpath("//a[text()='Home Décor']/ancestor::ul/li/a[text()]"));
		 
		for(WebElement name:names) {
	    	String text = name.getText();
	    	System.out.println(text);
	    }
	    driver.close();
	}

}
