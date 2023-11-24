package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlySpecificBrowser {
	static{
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("enter the title which you need to close");
		Scanner s = new Scanner(System.in);
		String expTitle = s.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh) {
			driver.switchTo().window(wh);
			
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			if(actualTitle.contains(expTitle)) {
				if(actualTitle.equalsIgnoreCase(expTitle))
				{
					driver.close();
				}
			}// Outer If
			
		}// Loop
	}
}
