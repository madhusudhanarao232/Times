package qsp;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestScript {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile name");
		String mb = sc.nextLine();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(mb);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> mobiles = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int count=mobiles.size();
		System.out.println(count);

		for(int i=0;i<=count;i++) {
			System.out.println(mobiles.get(i).getText());
			System.out.println(prices.get(i).getText());
		}
		driver.close();
	}

}
