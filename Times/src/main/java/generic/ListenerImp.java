package generic;
import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.*;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

//
//public class ListenerImp implements ITestListener {
//
//	@Override
//	public void onTestFailure(ITestResult result) {
//		String methodName = result.getMethod().getMethodName();
//		TakesScreenshot t=(TakesScreenshot)BaseClass.sdriver;
//		File src = t.getScreenshotAs(OutputType.FILE);
//		LocalDateTime ldt=LocalDateTime.now();
//		String dateTime = ldt.toString().replace(" : ", "_").replace(":", "_");
//		File dst = new File("./ScreenShots/"+methodName+"_"+dateTime+".png");
//		
//		try {
//			FileUtils.copyFile(src, dst);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		//ITestListener.super.onTestFailure(result);
//	}
//	package genericUtility;

	public class ListenerImp implements ITestListener{

		ExtentReports report;
		ExtentTest test;
	
		@Override
		public void onStart(ITestContext context) { 
			System.out.println("onStart Test Execution has started");
			ExtentSparkReporter htmlreport=new ExtentSparkReporter("./ExtentReports/reports-"+new JavaUtlity().getRequiredDate(0)+".html");
			htmlreport.config().setDocumentTitle("Actitime Reports");
			htmlreport.config().setTheme(Theme.STANDARD);
			htmlreport.config().setReportName("ActitimeReport");
			 report=new ExtentReports();
			 report.attachReporter(htmlreport);
			 report.setSystemInfo("Base url","https://demo.actitime.com");
			 report.setSystemInfo("Base Browser","chrome");
			 report.setSystemInfo("Reporter name","Madhu");	
		}
		@Override
		public void onTestStart(ITestResult result) {
			String methodname=result.getMethod().getMethodName();
			System.out.println(methodname+" ---> onTestStart Execution has started");
			test=report.createTest(methodname);
		}
		@Override
		public void onTestSuccess(ITestResult result) {
			String methodname=result.getMethod().getMethodName();
			test.log(Status.PASS,methodname+" ------> Success");		
		}
		@Override
		public void onTestSkipped(ITestResult result) {
			String methodname=result.getMethod().getMethodName();
			test.log(Status.FAIL,methodname+" -----> Skiped");
			test.log(Status.INFO,result.getThrowable());
		}
		@Override
		public void onTestFailure(ITestResult result) {
			JavaUtlity jlib=new JavaUtlity();
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			String methodname=	result.getMethod().getMethodName();
		      test.log(Status.FAIL,methodname+"----> Failed");
		      test.log(Status.INFO,result.getThrowable());
		      
		      String screenshotname=methodname+"-"+jlib.getRandomNumber();
		      TakesScreenshot t=(TakesScreenshot)driver;
		      try {
		    	 
		    	  File src = t.getScreenshotAs(OutputType.FILE);
		  		LocalDateTime ldt=LocalDateTime.now();
		  		String dateTime = ldt.toString().replace(" : ", "_").replace(":", "_");
		  		File dst = new File("./ScreenShots/"+screenshotname+"_"+dateTime+".png");
		    	FileUtils.copyFile(src, dst);  
		      }catch(Exception e) {
		    	  e.printStackTrace();
		      }
		}
		@Override
		public void onFinish(ITestContext context) {
			System.out.println("Test Execution has been finished");
			report.flush();
		}		
}