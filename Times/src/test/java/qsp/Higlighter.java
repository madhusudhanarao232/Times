
package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Higlighter {
	public static WebDriver driver;
	
	public static void highlighter(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background: Pink; border: 2px solid black;');", e);
	}
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		highlighter(username);
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		highlighter(password);
		password.sendKeys("manager");
		WebElement btn = driver.findElement(By.xpath("//div[text() ='Login ']"));
		highlighter(btn);
		btn.click();
		Thread.sleep(1000);
		WebElement one = driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]"));
		highlighter(one);
		one.click();
		Thread.sleep(1000); 
		WebElement two = driver.findElement(By.linkText("About your actiTIME"));
		highlighter(two);
		two.click();
		Thread.sleep(1000);
		WebElement three = driver.findElement(By.xpath("//a[contains(.,'Read Service Agreement')]"));
		//highlighter(three);
		three.click();
		Set<String> wh = driver.getWindowHandles();
		int count = wh.size();
		System.out.println(count);
		for(String agtab:wh) {
			Thread.sleep(100);
			driver.switchTo().window(agtab);
		}
		List<WebElement> headings = driver.findElements(By.xpath("//h2"));
		
		for(WebElement allHeadings:headings)
		{
			Thread.sleep(100);
			highlighter(allHeadings);
			System.out.println(allHeadings.getText());
		}
		for(String w:wh) {
			driver.switchTo().window(w);
			Thread.sleep(2000);
			driver.close();
		}
	}
}