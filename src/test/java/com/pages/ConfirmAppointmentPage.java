package com.pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.objectRepository.Locators;
import com.setup.Base;
import com.setup.PropertyReader;
import com.setup.Reporter;

public class ConfirmAppointmentPage {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest extReports;
	ExtentTest extTest;
	Properties prop = PropertyReader.readProperties();
	
	
	public ConfirmAppointmentPage(WebDriver driver,ExtentTest extTest4) {
		this.driver = Base.driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.extTest = extTest4;
		
	}
	public void clickconfirmappointment() {
		
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.appointmentdetails));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.patientdetails));
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.confirmappointment)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "Confirm Appointment successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Confirm Appointment not successfully");
			
		}
		
	}
	
	public void popup() {
		
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.popupappointment));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.popupok)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "Popup displayed and details verified successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Popup not displayed successfully");
			
		}
		
	}
	
	public void myappointment() {
		
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.loginpopup)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.myappointment)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.myappointmentdoctor));
			Reporter.generateReport(driver, extTest, Status.PASS, "Popup displayed and details verified successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Popup not displayed successfully");
			
		}
		
	}
	
	public void totalcharge() {
		
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.myappointmentdoctor)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.totalcharge));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.loginpopup)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "Total charges displayed successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Total charges not displayed successfully");
			
		}
		
	}
}
