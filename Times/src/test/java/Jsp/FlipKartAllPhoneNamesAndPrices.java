package Jsp;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartAllPhoneNamesAndPrices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile name");
		String mb=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys(mb);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		List<WebElement> mobileNames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_4rR01T']/../../div[2]/div/div/div[@class='_30jeq3 _1_WHN1']"));
        for(int i=0,j=0;i<mobileNames.size()&&j<prices.size();i++,j++) {
        	String name = mobileNames.get(i).getText();
        	String price = prices.get(j).getText();
        	System.out.println(name+" ------> "+price);
        }
        driver.close();
        }
	}
