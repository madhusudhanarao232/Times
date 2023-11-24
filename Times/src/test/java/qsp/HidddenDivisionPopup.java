package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HidddenDivisionPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.className("form-control")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Select s=new Select(year);
		s.selectByValue("1998");
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Dec");
		driver.findElement(By.xpath("//a[text()='25']")).click();
		driver.findElement(By.name("alternative_number")).sendKeys("8500321287");
		driver.findElement(By.id("renew_policy_submit")).submit();
		Thread.sleep(5000);
		driver.close();
	}
}
