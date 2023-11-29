package generic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseclassForBeforeMethod {
	@BeforeTest
	public void bt() {
		System.out.println("before Test");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("exe bm");
	}
	@AfterMethod
	public void am() {
		System.out.println("exe am");
	}
	@AfterTest
	public void at() {
		System.out.println(" After test");
	}
}
