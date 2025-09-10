package com.pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.objectRepository.Locators;
import com.setup.Base;
import com.setup.PropertyReader;
import com.setup.Reporter;

public class FindDoctorInvalidPage {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest extReports;
	ExtentTest extTest;
	Properties prop = PropertyReader.readProperties();
	
	
	public FindDoctorInvalidPage(WebDriver driver,ExtentTest extTest9) {
		this.driver = Base.driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.extTest = extTest9;
	}
	
	public void enterdateonly() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(Locators.finddoctor)).click();
		
		try {        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.dateicon)).click();
			driver.findElement(Locators.date).click();
			
			driver.findElement(Locators.submitbtn).click();

			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			Reporter.generateReport(driver,extTest,Status.FAIL,"Please select Area/Pin code and speciality");
		}
		catch(TimeoutException te) {
			Reporter.generateReport(driver,extTest,Status.PASS,"submitted successfully");
		}
		
	}
	
	public void enterspecialityanddate() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(Locators.finddoctor)).click();
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.enterspeciality)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(Locators.selectspeciality)).click();
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.dateicon)).click();
			driver.findElement(Locators.date).click();
			
			driver.findElement(Locators.submitbtn).click();

			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			Reporter.generateReport(driver,extTest,Status.FAIL,"Please select Area/Pin code");
		}
		catch(TimeoutException te) {
			Reporter.generateReport(driver,extTest,Status.PASS,"submitted successfully");
		}
		
	}
	
	public void otherlocation() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(Locators.finddoctor)).click();
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.enterspeciality)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(Locators.selectspeciality)).click();
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.dateicon)).click();
			driver.findElement(Locators.date).click();
			
		   WebElement location = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.location));
	        location.click();
	        location.sendKeys("newyork");
	        driver.findElement(Locators.submitbtn).click();
	        
	        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        Reporter.generateReport(driver,extTest,Status.FAIL,"Please select the location in India");
		}
		catch(TimeoutException te) {
			Reporter.generateReport(driver,extTest,Status.PASS,"submitted successfully");
		}
		
	}
	
	public void pincode() {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(Locators.finddoctor)).click();
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.enterspeciality)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(Locators.selectspeciality)).click();
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.dateicon)).click();
			driver.findElement(Locators.date).click();
		   
			WebElement location = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.location));
	        location.click();
	        location.sendKeys("1234567");
	        driver.findElement(Locators.submitbtn).click();
	        
	        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        Reporter.generateReport(driver,extTest,Status.FAIL,"Pin code length is exceeded");
		}
		catch(TimeoutException te) {
			Reporter.generateReport(driver,extTest,Status.PASS,"submitted successfully");
		}
		
	}
		
	
	public void enterlocationonly() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(Locators.finddoctor)).click();
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.enterspeciality)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(Locators.selectspeciality)).click();
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.dateicon)).click();
			driver.findElement(Locators.date).click();
		   
			WebElement location = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.location));
	        location.click();
	        location.sendKeys("chennai");
	        driver.findElement(Locators.submitbtn).click();
	        
	        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        Reporter.generateReport(driver,extTest,Status.FAIL,"Please enter and select the location");
		}
		catch(TimeoutException te) {
			Reporter.generateReport(driver,extTest,Status.PASS,"submitted successfully");
		}
		
	}
}
