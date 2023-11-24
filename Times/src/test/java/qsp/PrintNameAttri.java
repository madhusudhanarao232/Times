package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintNameAttri{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
 WebDriver d=new ChromeDriver();
 d.get("https://demo.actitime.com/");
 try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	e.printStackTrace();
}   
 String s = d.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
 try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
 String p = d.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href");
 System.out.println(s+","+p);
 d.close();
	}

}
 