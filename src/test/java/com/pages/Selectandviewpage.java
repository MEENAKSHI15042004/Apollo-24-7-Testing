package com.pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.objectRepository.Locators;
import com.setup.Base;
import com.setup.PropertyReader;
import com.setup.Reporter;

public class Selectandviewpage {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest extReports;
	ExtentTest extTest;
	Properties prop = PropertyReader.readProperties();
	
	
	public Selectandviewpage(WebDriver driver,ExtentTest extTest4) {
		this.driver = Base.driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.extTest = extTest4;
	}
	
	public void selectdoctor() {
		try {
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(Locators.selectdoctor)).click();
		Reporter.generateReport(driver, extTest, Status.PASS, "Doctor selected successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Doctor not selected successfully");
		}
	}
	
	public void viewdetails() {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.viewdetails));
			Reporter.generateReport(driver, extTest, Status.PASS, "Doctor details viewed successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Doctor details not viewed successfully");
			
		}
	}
	
	public void consultationtype() {
		try {
			Reporter.generateReport(driver, extTest, Status.PASS, "consultation type selected successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "consultation type not selected successfully");
			
		}
		
	}

}
