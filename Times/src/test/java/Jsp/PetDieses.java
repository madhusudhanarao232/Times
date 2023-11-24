package Jsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class  PetDieses {

	@Test
	public void javaScript() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://petdiseasealerts.org/forecast-map/");
		//Type casting to JavaScript Executor to Scroll down the window 500px vertically  
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
		//driver.findElement(By.xpath("//div[@class='capc-map-embed mode-widget']"));
		// capturing frame id 
		//----> xpath   //iframe[@id='map-instance-52242'] Donot use
		// ---->xpath  //iframe[starts-with(@id,'map-instance')]
		WebElement id = driver.findElement(By.xpath("//iframe[starts-with(@id,'map-instance')]"));
		//Switch the control main page to frame Using WebElelment as an args in frame()
		
		driver.switchTo().frame(id);
		//finding element to select/click on perticular state
		// select California state
		//------>xpath //*[name()='path' and @name='California'] or 
		// ----->xpath  //*[name()='g' and @class='rpath']//*[name()='path' and @name='California']
		driver.findElement(By.xpath("//*[name()='g' and @class='rpath']//*[name()='path' and @name='California']")).click();
	}
}
