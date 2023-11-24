package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiDataProvider {
	
	@Test(dataProvider = "loginToaApp")
	public void getLoginDetails(String USERNAME,String PASSWORD) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String URL="https://demo.actitime.com/";
		try {
		driver.get(URL);
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//div[text() ='Login ']")).click();
		}
		finally {
			driver.close();
		} 
	} 

@DataProvider
public Object[][] loginToaApp() {
	 
	Object [][] obj=new Object[5][2];
	
	obj[0][0]="ghfht";
	obj[0][1]="gfhtfsh";
	
	obj[1][0]="hfdhtf";
	obj[1][1]="hfgdxsC";
	
	obj[2][0]="gftas";
	obj[2][1]="hgffas";
	
	obj[3][0]="asd";
	obj[3][1]="hfff";
	
	obj[4][0]="admin";
	obj[4][1]="manager";
	
	
	return obj;
}
}

