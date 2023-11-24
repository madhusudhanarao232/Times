package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoSugges {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "https://www.google.com/");
		driver.findElement( By.name( "q")).sendKeys( "java" );
		Thread.sleep(2000);
		List<WebElement> Allsugg = driver.findElements( By.xpath( "//span[contains(text(),'java')]"));
		int count=Allsugg.size();
		System.out.println(count);
		for (int i = 0; i <count; i++)
		{
			String text=Allsugg.get(i).getText();
			System.out.println(text);
		}
		System.out.println("==================================");
		System.out.println(Allsugg.get(count-1).getText());
		Thread.sleep(2000);
		Allsugg.get(0).click();
		Thread.sleep(2000);
		driver.close();
	}
}