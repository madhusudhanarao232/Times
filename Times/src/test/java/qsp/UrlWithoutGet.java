package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class UrlWithoutGet {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://gmail.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		}

}