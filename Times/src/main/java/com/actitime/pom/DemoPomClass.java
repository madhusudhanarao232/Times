package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPomClass {
	@FindBy(id="username")
	private WebElement untbx;
	@FindBy(name="pwd")
    private WebElement pwtbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgbtn; 
	public DemoPomClass() {}
	public DemoPomClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setDemoPomClass(String un,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}
}
