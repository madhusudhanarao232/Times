package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MTRlistBoxReverseOrder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MADHAV/Desktop/html/Hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> allOptins = s.getOptions();
		int count=allOptins.size();
		System.out.println(count);
		String s1=" ",s2=" ";
		System.out.println("Printing Straight Order");
		for(int i=0;i<count;i++) {
			s1=allOptins.get(i).getText();
			Thread.sleep(500);
			s.selectByIndex(i);
			System.out.println(s1);		
		}
		System.out.println("Printing Reverse Order");
		for(int i=count-1;i>=0;i--) {
			s2 = allOptins.get(i).getText();
			Thread.sleep(500);
			s.deselectByIndex(i);
		   System.out.println(s2); 
		}
		driver.close();
	}
}