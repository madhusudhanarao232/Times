package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriResumeUpload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("madhusudhanarao232@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Madhu@232");
		driver.findElement(By.xpath("//button[text()='Login']")).submit();
		driver.findElement(By.className("nI-gNb-bar1")).click();
		driver.findElement(By.xpath("//a[text()='View & Update Profile']")).click();
		
		File f=new File("./data/R Madhu.pdf");//    (//input[@type='file'])[1]
		String resume = f.getAbsolutePath();
		Thread.sleep(4000);
	
	   driver.findElement(By.id("attachCV")).click();
		//driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
	    driver.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys(resume);
		
		System.out.println("Succesfully added Resume into Naukri.com");
		// From here to Example fro  File download PopUp
		/*driver.findElement(By.xpath("//i[@title='Click here to download your resume']")).click();
		Thread.sleep(4000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		*/
		
	}

}
