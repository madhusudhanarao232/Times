package Jsp;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAllPhoneNamesAndPrices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile name");
		String mb=sc.nextLine();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(mb);
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> mobileNames = driver.findElements(By.xpath("//span[contains(text(),'Samsung')]"));
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole' and text()]"));
        for(int i=0,j=0;i<mobileNames.size()&&j<prices.size();i++,j++) {
        	String name = mobileNames.get(i).getText();
        	String price = prices.get(j).getText();
        	System.out.println(name+" ------> "+price);
        }
//       driver.switchTo().newWindow(WindowType.WINDOW);
//       driver.switchTo().newWindow(WindowType.TAB);
        driver.close();
	}

}
