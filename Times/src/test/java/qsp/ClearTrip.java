package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;//div[@class='flex flex-middlep-relative homeCalender']
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	static{
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("BLR");
		driver.findElement(By.xpath("//p[@class='to-ellipsis o-hidden ws-nowrap fs-3 fw-500']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("GOI");
		driver.findElement(By.xpath("(//p[@class='to-ellipsis o-hidden ws-nowrap fs-3 fw-500'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']")).click();
		// xpath for <SVG > Tag
		WebElement svg = driver.findElement(By.xpath("(//*[name()='svg' and @data-testid='rightArrow']//*[name()='g']//*[name()='path'])[1]"));
		svg.click();
		svg.click();
		svg.click();
		svg.click();
		svg.click();
		driver.findElement(By.xpath("//div[@aria-label='Thu Sep 30 2023']")).click();
		driver.findElement(By.xpath("//button[.='Searchflights']")).click();
		List<WebElement> flights =
				driver.findElements(By.xpath("//img[@class]"));
		List<WebElement> time =
				driver.findElements(By.xpath("//img[@class]/../../../../../../../../div/div/div/div[2]/div/div[1]/p"));
		int count = flights.size();
		int count1 = time.size();
		System.out.println(count+" "+ count1);
		for(int i=0;i<count;i++ ) {
			String allflights = flights.get(i).getAttribute("alt");
			String deptTime = time.get(i).getText();
			System.out.println("Flight_name: " + allflights+"--->"+"Departure_time: "+deptTime);
		}
	}
}
