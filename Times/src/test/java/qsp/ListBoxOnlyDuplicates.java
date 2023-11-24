package qsp;

import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxOnlyDuplicates {
	static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MADHAV/Desktop/html/Hotel.html");
		LinkedHashSet<String> ls=new LinkedHashSet<>();
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> allOp = s.getOptions();
		int count = allOp.size();
		for (int i = 0; i <count; i++) {
			String text = allOp.get(i).getText();
			if(ls.add(text)==false) {
				System.out.println(text);
			}
				
			
		} 
		driver.close();
		
	}

}
