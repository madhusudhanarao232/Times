package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<allLinks.size();i++) {
			String links = allLinks.get(i).getAttribute("href");
			System.out.println(links);
			URL url;
			int statusCode=0;
			try {
				url=new URL(links);
				URLConnection connection=url.openConnection();
				HttpURLConnection http=(HttpURLConnection)connection;
				statusCode=http.getResponseCode();
				if(statusCode>=400) {
				al.add(statusCode+" --> "+links);
				}
			} catch (Exception e) {
		         System.err.println(e);
				continue;
			}
		}
		System.err.println("========================================================================================");
		for(String s:al) {
			System.out.println(s);	
		}
		driver.quit();
	}
}
