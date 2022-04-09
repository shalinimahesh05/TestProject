package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class LoginPage extends TestBase{
	
		
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement pasword;
	
//	@FindBy(xpath="//button[@type='submit']")
//	WebElement loginBtn;
	
	@FindBy(id="u_0_h_kR")
	WebElement loginBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String validateloginPageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage login(String un,String pwd) throws InterruptedException
	{
		username.sendKeys(un);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		Thread.sleep(3000);
		pasword.sendKeys(pwd);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		Thread.sleep(3000);
		loginBtn.click();
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		return new HomePage();
	}

}
