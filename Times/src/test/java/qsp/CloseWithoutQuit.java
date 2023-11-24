package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWithoutQuit {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Thread.sleep(1000);
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			Thread.sleep(1000);
			driver.switchTo().window(wh);
			String t = driver.getTitle();
			System.out.println(t);
			driver.close();
		}
	}
}
