package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org/");
		String s=driver.getCurrentUrl();
		Thread.sleep(3000);
		if (s.equals("https://www.selenium.dev/"))     
		{
			System.out.println("Url is successfully navigating and pass");
		}
		else
		{
		System.out.println("url is NOT successfully navigating and pass");
		}
		driver.close();

	}
}
