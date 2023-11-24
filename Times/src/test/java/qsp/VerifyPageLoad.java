package qsp;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageLoad {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value in SECONDS ");
		int n=sc.nextInt();
		driver.manage().timeouts().pageLoadTimeout(n, TimeUnit.SECONDS);
		try
		{
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("page is loaded within "+n+" seconds");
		}
		catch(Exception e)
		{
			System.out.println("Page is not loaded within "+n+ "seconds");
		}
	}

}