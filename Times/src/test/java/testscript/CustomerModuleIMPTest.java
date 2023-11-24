package testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModuleIMPTest {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("open Browser",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close Browser",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	@Test(priority=1,invocationCount=2,groups = {"regressionTest"})
	public void editCustomer() {
	Reporter.log("editCustomer",true);	
	}
	@Test(groups = {"smokeTest"})
	public void registerCustomer() {
		Reporter.log("registerCustomer",true);
	}
	@Test(groups = {"smokeTest"})
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}


}
