package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeamRanckingsIndia {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> in = driver.findElements(By.xpath("//tbody/tr/td[2]/span[2]"));
		// int count=in.size();
		for(WebElement team:in) {
			if(team.getText().equalsIgnoreCase("india")) {
				System.out.println(team.getText());
			}
		}
	driver.close();	
	}

}
