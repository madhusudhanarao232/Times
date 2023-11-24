package testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNGTest {
	@Test(groups = {"regressionTest"})
	public void testDemo() {
		Reporter.log("Welcome To Automation Testing ");
		
	}

}
