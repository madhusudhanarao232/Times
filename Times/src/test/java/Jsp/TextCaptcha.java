package Jsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TextCaptcha {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
       WebDriver driver=new ChromeDriver(option);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://www.irctc.co.in/nget/train-search");
       driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]"));
	}

}
