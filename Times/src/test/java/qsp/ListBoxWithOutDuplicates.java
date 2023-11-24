package qsp;

import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxWithOutDuplicates {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	LinkedHashSet<String> hs=new LinkedHashSet<>();
	driver.get("file:///C:/Users/MADHAV/Desktop/html/Hotel.html");
	WebElement mtrlistbox = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrlistbox);
	List<WebElement> allOptions = s.getOptions();
	int count = allOptions.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String text = allOptions.get(i).getText();
		hs.add(text);
	}
	
	for (String a:hs) {
   System.out.println(a);
	}
	driver.close();
	}
}
