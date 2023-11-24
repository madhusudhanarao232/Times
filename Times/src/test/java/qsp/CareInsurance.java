package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

  public class CareInsurance {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		WebElement a = driver.findElement(By.id("dob"));
		a.click();
		WebElement mon = driver.findElement(By.className("ui-datepicker-month"));
		Select sm=new Select(mon);
		sm.selectByVisibleText("Dec");
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Select sy=new Select(year);
		sy.selectByValue("1998");
		driver.findElement(By.xpath("//a[text()='25']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("8500321284");
		driver.findElement(By.xpath("//button[.='Lets Renew']")).submit();
		/*
		driver.findElement(By.className("form-control "));
		WebElement text = driver.findElement(By.xpath("(//img)[13]"));
		String t = text.getText();
		driver.findElement(By.id("CaptchaCode")).sendKeys(t);
		*/
		System.out.println("---------------        PASS       ------------");
		driver.close();		
	}
}
/*

public class CareInsuranceHiddenDivision {
static {
System.setProperty("webdriver.chrome.driver",
"./driver/chromedriver.exe");
}
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
driver.findElement(By.className("form-control")).sendKeys("123");
driver.findElement(By.id("dob")).click();
WebElement mon =
driver.findElement(By.className("ui-datepicker-month"));
Select s = new Select(mon);
s.selectByValue("11");
WebElement year =
driver.findElement(By.className("ui-datepicker-year"));
Select s1 = new Select(year);
s1.selectByValue("1996");
driver.findElement(By.xpath("//a[.='14']")).click();
driver.findElement(By.id("alternative_number")).sendKeys("9854798547");
driver.findElement(By.id("renew_policy_submit")).submit();
System.out.println("pass");
driver.close();
}
}
*/