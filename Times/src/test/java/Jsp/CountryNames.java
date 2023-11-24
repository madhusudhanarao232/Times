package Jsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CountryNames {

	@Test
	public void automateScenario() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.get("https://cosmocode.io/");
		WebElement mte = driver.findElement(By.xpath("(//li[contains(@id,'5318')])[position()=2]"));
		  
		Actions a=new Actions(driver);
		a.moveToElement(mte).perform();
		
		driver.findElement(By.xpath("(//a[text()='Automation Practice | WebTable'])[position()=2]")).click();
		
		
		List<WebElement> names = driver.findElements(By.xpath("//td[contains(text(),'Dollar') ]/following-sibling::td[contains(text(),'English')]/parent::tr/td[@style='width: 134.667px;']"));
		int count = names.size();
		System.out.println("count of countries---> "+count);
		for(WebElement name:names) {
			System.out.println(name.getText());
		}
		driver.close();
	}
}
