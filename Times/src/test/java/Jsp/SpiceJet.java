package Jsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {
	@Test
	public void validateFlight() throws Throwable {
		ChromeOptions option = new ChromeOptions();
		//FirefoxOptions option=new FirefoxOptions();
		option.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);
		//WebDriver driver=new FirefoxDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Actions a=new Actions(driver);
		// enter To address 
    WebElement from = driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]"));
	Thread.sleep(1000);
    from.sendKeys("delhi");
        // enter From address
	WebElement to = driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]"));
	Thread.sleep(1000);
	to.sendKeys("bengaluru");
	Thread.sleep(1000);
	//click on calender 
	driver.findElement(By.xpath("(//div[@class='css-1dbjc4n']//*[name()='svg' and @data-testid='svg-img'])[7]")).click();
	//click on date
	//driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
	//click on search
	driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
	//click on radio button
	 WebElement ele = driver.findElement(By.xpath("(//div[@data-testid='spiceflex-flight-select-radio-button-1'])[1]"));
	 Thread.sleep(1000);
	 a.moveToElement(ele).click().build().perform();
	//click on continue
	WebElement con = driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta']")); 
	 con.click();
	 // navigating to another page and fill the necessary details
	 //entering Contact Details
	 // entering First and Middle Name*
	 Thread.sleep(500);
	 driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")).sendKeys("MADHUSUDHANA RAO");
	 // entering LastNAme Name*
	 Thread.sleep(500);
	 driver.findElement(By.xpath("(//div[text()='Last Name*']/../following-sibling::div/input)[1]")).sendKeys("DANDE");
	 // entering Mobile number
	 Thread.sleep(500);
	 driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-1yadl64 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")).sendKeys("8500321287");
	 // entering Email address
	 Thread.sleep(500);
	 driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[3]")).sendKeys("madhu.dande25@gmail.com");
	 // Entering PAssenger details
	 // entering First and Middle Name*
	 Thread.sleep(500);
	 driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[4]")).sendKeys("MADHUSUDHANA RAO");
	 // entering LastNAme Name*
	 Thread.sleep(500);
	 driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[5]")).sendKeys("DANDE");
	 // entering Mobile number
	 Thread.sleep(500);
	 driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-1yadl64 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")).sendKeys("8500321287");
	 // click on continue button
	 WebElement cont = driver.findElement(By.xpath("//div[text()='Continue']"));
	 try {
		 cont.click(); 
	 }catch (org.openqa.selenium.ElementClickInterceptedException e) {
		a.click(cont).perform();
	}

	// clicking
	 WebElement conti = driver.findElement(By.xpath("(//div[text()='Continue'])[3]"));
		Thread.sleep(2000);
	 try {
		 
		 conti.click(); 
	 }catch (org.openqa.selenium.ElementClickInterceptedException e) {
		a.click(conti).perform();
		System.out.println(e);
	}
		Thread.sleep(2000);
	//performing click operation
		a.click().perform();
		a.click(conti).perform();
		// closing spiceflex window popup
//		WebElement cls = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr']"));
//		try {
//			cls.click();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		//verify Title   
		String actTitle = driver.getTitle() ;
		System.out.println(actTitle);
		String expTitle="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		SoftAssert sa=new SoftAssert();
		//sa.assertEquals(actTitle, expTitle);
		sa.assertEquals(expTitle, actTitle, "Title is verified");
		System.err.println("verified");

		
	 driver.quit();   
	sa.assertAll();
	}
}
//  wwwTestw      
//  w3t1e1s1t1w1 
	/*Exception 
	 * //div[@class='css-1dbjc4n r-1loqt21 r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr']
	 * org.openqa.selenium.interactions.MoveTargetOutOfBoundsException
	 * org.openqa.selenium.ElementClickInterceptedException
	 * //a.moveToElement(spiceflex).moveByOffset(xx, yy).click().build().perform();
	 */
