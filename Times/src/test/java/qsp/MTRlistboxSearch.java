package qsp;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MTRlistboxSearch {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		System.out.println("Enter your option");
		Scanner sc=new Scanner(System.in);
		String option = sc.next();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/MADHAV/Desktop/html/Hotel.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> allop = s.getOptions();
		int count = allop.size();
		System.out.println(count);
		int counter=0;
		for(int i=0;i<count;i++) {
			String text = allop.get(i).getText();
			if(option.equalsIgnoreCase(text)) {
				counter++;
			}
		}
		if(counter==0)
			System.out.println("Enter option is not there ");
		else if(counter==1)
			System.out.println("Option is present without duplicates");
		else if(counter>1)
			System.out.println("duplicates are present");
		System.out.println("---------Program is Ended-----------");
		driver.quit();
	

	}

}
