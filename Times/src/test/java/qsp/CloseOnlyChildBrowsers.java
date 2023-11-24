package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildBrowsers {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allwh = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			if(parent.equals(wh)) {
				
			}
			else
				driver.quit();
			
		}

	}

}
