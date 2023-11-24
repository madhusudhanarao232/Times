package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
 WebDriver d=new ChromeDriver();
 d.get("https://www.facebook.com/login/");
 boolean login = d.findElement(By.name("login")).isEnabled();
 if(login==true)
	 System.out.println("login button is Enable & pass");
 else
	 System.out.println("login button is NOT Enable & FAIL");
 d.close();
	}

}
