package Jsp;

import java.io.FileOutputStream;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	@Test
	public void writeFlightTimings() throws Throwable{
		WebDriverManager.chromedriver().setup();
		//Creating Local date object 
		LocalDate date = LocalDate.now();
		System.out.println(date.getDayOfYear()+","+date.getDayOfMonth()+" ");
		LocalDate ddd = date.plusDays(2);
		LocalDate add = ddd.plusDays(2);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd yyyy");
        int pos=1;
		//launch the browser
		WebDriver driver=new ChromeDriver();
        // Type casting to JavascriptExecutor 
		JavascriptExecutor j=(JavascriptExecutor)driver;
		//Browser maximize
		driver.manage().window().maximize();
        //implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// login to applications
		driver.get("https://www.makemytrip.com/");
		// perform click operation to close the login credentials Using Action class
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.click().perform();
		// Enter from details and To address
		Thread.sleep(2000);
		a.click().perform();
		driver.findElement(By.xpath("//span[.='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Ben");
		List<WebElement> from = driver.findElements(By.xpath("//div[contains(@class,'pushRight font')]"));
		for (WebElement citycode: from) {
			if(citycode.getText().equalsIgnoreCase("BLR")) {
				citycode.click();
				break;
			}
		}
		// Enter  destination  address
		driver.findElement(By.xpath("//span[.='To']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("goa");
	
		List<WebElement> To=null;
		try {
			To = driver.findElements(By.xpath("//div[contains(@class,'lightGreyText latoBold')]"));
		}
		catch(Exception e) {
			System.out.println("  Handled-----> "+e);   
		}
		for (WebElement city: To) {
			Thread.sleep(1000);
			//wait.until(ExpectedConditions.visibilityOf(city));
			if(city.getText().equalsIgnoreCase("GOI")) {
				city.click();
				break;
			}
		}
		
		try {
		driver.findElement(By.xpath("//span[(.='Departure')]")).click();
		WebElement dc = driver.findElement(By.xpath("//div[@role='gridcell' and @aria-label='"+ddd.format(formatter)+"']"));
		Thread.sleep(2000);
		a.click(dc).perform();
	}
	catch(Exception e) {
	  
		System.out.println("  Handled-----> "+e);   
	}
		Thread.sleep(2000);
		// select Return date
		driver.findElement(By.xpath("//span[(.='Return')]")).click();
		WebElement Rd = driver.findElement(By.xpath("//div[@role='gridcell' and @aria-label='"+add.format(formatter)+"']"));
		Thread.sleep(2000);
		a.click(Rd).perform();
		// click On Search button
		driver.findElement(By.xpath("//a[.='Search']")).click();
		// click On OKAY, GOT IT! notification button
		//button[text()='OKAY, GOT IT!']
		driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
		// finding Location of Arrivals FLIGHTS 
		int yl = driver.findElement(By.xpath("//p[text()='Arrival at Bengaluru']")).getLocation().getY();
		// scroll down to find location 
		j.executeScript("window.scrollBy(0,"+yl+")");
		//click on Airlines SHOWMORE button
		try {
		driver.findElement(By.xpath("//p[.='Airlines']/parent::div/descendant::span[contains(text(),'more')]")).click();
	}
	catch(Exception e) {
		System.out.println("  Handled-----> "+e);   
	}
		// Fetch Airlines Names
		List<WebElement> airlines = driver.findElements(By.xpath("//p[.='Airlines']/parent::div/descendant::p[@class='checkboxTitle'][text()]")); 
		// Fetch Airlines availability count 
		for (WebElement web: airlines) {
			String num="";
			String text=web.getText();
			for(int i=0;i<text.length();i++) {
				char ch=text.charAt(i);
				// fetching number from String 
				if(ch>='0'&&ch<='9') {
					num=num+ch;   
				}
			}
			System.out.println(num.trim());
			int n=Integer.parseInt(num.trim());
			// click on CHECH BOX 
			Thread.sleep(2000);
			if(n<=10) {
				WebElement check = driver.findElement(By.xpath("(//p[.='Airlines']/parent::div/descendant::input[@name='listingFilterCheckbox'])["+pos+"]"));
				a.click(check).perform();
			}
			pos++;
		}//for-each loop
        // Availability Flight names in source location
		List<WebElement> flightNames = driver.findElements(By.xpath("//span[@class='boldFont blackText']"));
		// Flight departure Timings from source location
		List<WebElement> departureTime = driver.findElements(By.xpath("//div[@class='flexOne timeInfoLeft']/p[@class='appendBottom2 flightTimeInfo']/span[text()]"));
		// Flight Reaching Timings in Destination location
		List<WebElement> reachingTime = driver.findElements(By.xpath("//div[@class='flexOne timeInfoRight']/p[@class='appendBottom2 flightTimeInfo']/span[text()]"));
		// Flight prices 
		List<WebElement> price = driver.findElements(By.xpath("//p[@class='blackText fontSize16 blackFont'][text()]"));
        // Create Header ro
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("MMT");
		Row headerRow = sheet.createRow(0);
		Cell headerCell = headerRow.createCell(0);
		headerCell.setCellValue("FlightName");
		Cell headerCell2 = headerRow.createCell(1);
		headerCell2.setCellValue("Departure time");
		Cell headerCell3 = headerRow.createCell(2);
		headerCell3.setCellValue("Return time");
		Cell headerCell4 = headerRow.createCell(3);
		headerCell4.setCellValue("Price");

		for (int i = 0; i < flightNames.size(); i++) {
			Row dataRow = sheet.createRow(i + 1);
			Cell dataCell = dataRow.createCell(0);
			dataCell.setCellValue(flightNames.get(i).getText());
			Cell dataCell2 = dataRow.createCell(1);
			dataCell2.setCellValue(departureTime.get(i).getText());
			Cell dataCell3 = dataRow.createCell(2);
			dataCell3.setCellValue(reachingTime.get(i).getText());
			Cell dataCell4 = dataRow.createCell(3);
			dataCell4.setCellValue(price.get(i).getText());
		}
		
		FileOutputStream fileOut = new FileOutputStream("./trip.xlsx");
		workbook.write(fileOut);
		workbook.close();
		//driver.quit();
	}

}
