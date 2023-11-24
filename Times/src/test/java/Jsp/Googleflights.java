package Jsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Googleflights {
	static WebDriver driver;
	public static void main(String[] args) {

		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		driver=new ChromeDriver(op);
		Actions a=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/travel/flights/search");
		// entering from details
		WebElement from = driver.findElement(By.xpath("(//input[@class='II2One j0Ppje zmMKJ LbIaRd'])[1]"));
		high(from);
//		a.click(from).perform();
//		from.clear();from.sendKeys("Mumbai");
		// entering To details 
		WebElement to = driver.findElement(By.xpath("(//input[@class='II2One j0Ppje zmMKJ LbIaRd'])[3]"));
		high(to);
		a.click(to).perform();
	    to.sendKeys("Hyderabad");
		// click on calender iconic button
		WebElement cal = driver.findElement(By.xpath("(//div[@class='BLohnc q5Vmde']//*[name()='svg' and @class=' NMm5M'])[1]"));
		high(cal);
		cal.click();
		// select date
		WebElement fdate=driver.findElement(By.xpath(""));
		//driver.findElement(By.xpath(""));

	}
	public static void high(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background: Pink; border: 2px solid black;');", e);
	}
}
