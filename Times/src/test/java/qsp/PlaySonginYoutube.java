package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaySonginYoutube {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Neeli Neeli Meghama");
		driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]")).click();
		// yt-simple-endpoint style-scope ytd-video-renderer
		/*
		 *style-scope ytd-radio-renderer 
		 *a[@id='video-title' and @class='yt-simple-endpoint style-scope ytd-video-renderer']
		 **/
		driver.findElement(By.xpath(" (//a/yt-formatted-string[@class='style-scope ytd-video-renderer'])[2]")).click();
	   Thread.sleep(3000);
	   /*
	   Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_SHIFT);
	    r.keyPress(KeyEvent.VK_I);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_SHIFT);
	    */
	    driver.findElement(By.xpath("//div[text()='Skip Ads']")).click();
	    
	}

}
