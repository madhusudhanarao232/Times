package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusCheckbox{
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
 boolean login = d.findElement(By.name("remember")).isSelected();
 if(login==true)
	 System.out.println("checkbox is CHECKED & pass");
 else
	 System.out.println("checkbox is UNCHECKED  & FAIL");
 d.close();
	}

}
