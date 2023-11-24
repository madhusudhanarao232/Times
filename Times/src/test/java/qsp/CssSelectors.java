package qsp;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
	static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("file:///C:/Users/MADHAV/Desktop/Demo.html");
		Thread.sleep(1000);
		d.findElement(By.cssSelector("a[id='d1']")).click();
		d.navigate().back();
		Thread.sleep(1000);
		d.findElement(By.cssSelector("a[name='n1']")).click();
		d.navigate().back();
		Thread.sleep(1000);
		d.findElement(By.cssSelector("a[class='c1']")).click();
		d.navigate().back();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("a[href='https://jspiders.com/']")).click();
		System.out.println("PASS");
	}

}
