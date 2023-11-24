package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAutoSuggestions {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Earphones name");
		String mb = sc.nextLine();
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(mb);
		//driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> autosugg = driver.findElements(By.xpath("/div[@class='s-suggestion-container']"));
		int count=autosugg.size();
		for(int i=0;i<=count;i++) {
		if(i==6) {
		System.out.println(autosugg.get(i).getText());	
		}
		}
		
	driver.close();
	}
}
/*
 * //tbody/tr/td[3][text()>='30']
 * //tbody/tr/td[3][text()<='30']
 */