package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadpopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/MADHAV/Desktop/html/ResumeUpload.html");
		File f=new File("./data/R Madhu.pdf");
		String abs = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(abs);
		Thread.sleep(4000);
		driver.close();
	}
}
