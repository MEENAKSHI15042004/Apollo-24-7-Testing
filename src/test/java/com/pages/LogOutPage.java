package com.pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.objectRepository.Locators;
import com.setup.Base;
import com.setup.PropertyReader;

public class LogOutPage {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest extReports;
	ExtentTest extTest;
	Properties prop = PropertyReader.readProperties();
	
	public LogOutPage(WebDriver driver,ExtentTest extTest9) {
		this.driver = Base.driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.extTest = extTest9;
	}
	
	public void clickprofileicon() {
		// Switch back to the first window before clicking profile icon
		
//		 String mainWindow = driver.getWindowHandles().iterator().next(); // first opened window
//		 driver.switchTo().window(mainWindow);
		
		 driver.findElement(Locators.validatelogin).click();
	}
	public void clicklogout() {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     WebElement logoutBtn = wait.until(ExpectedConditions.presenceOfElementLocated(Locators.logout));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.logout)).click();
	}
	public void checklogout() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.login));
	}

}
