package com.pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.setup.Base;
import com.setup.PropertyReader;
import com.setup.Reporter;

public class FindDoctorPage {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest extReports;
	ExtentTest extTest;
	Properties prop = PropertyReader.readProperties();
	
	 // click find doctor
	public static By finddoctor = By.xpath("//a[text()='Find Doctors']");
	
	// enter speciality
	public static By enterspeciality = By.xpath("//input[@placeholder='Enter Speciality']\r\n");
	
	// select specality
	public static By selectspeciality = By.xpath("//span[normalize-space(text())='Anaesthesia']");
	
	// date icon
	public static By dateicon = By.xpath("//span[@class='QuickBook_dateImage__hbyKS icon-date']");
	
	//select date
	public static By date = By.xpath("//abbr[text()='19']");
	
	// validate date
	public static By validatedate = By.xpath("//span[text()='Fri 19th Sep']");
	
	// location
	public static By location = By.xpath("//input[@placeholder='Search location']");
	
	// submit button
	public static By submitbtn = By.xpath("//span[text()='Submit']");
	
	
	public FindDoctorPage(WebDriver driver,ExtentTest extTest3) {
		this.driver = Base.driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.extTest = extTest3;
		
	}
	public void clickfinddoctor() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(finddoctor)).click();
	}

	
	public void enterspecality() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(enterspeciality)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(selectspeciality)).click();

			Reporter.generateReport(driver,extTest,Status.PASS,"specality selected successfully");
		}
		catch(TimeoutException te) {
			Reporter.generateReport(driver,extTest,Status.FAIL,"specality not selected successfully");
		}
	}
	
	public void selectdate() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(dateicon)).click();
			driver.findElement(date).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(validatedate));
			Reporter.generateReport(driver,extTest,Status.PASS,"Date selected successfully");
		}
		catch(TimeoutException te) {
			Reporter.generateReport(driver,extTest,Status.FAIL,"Date not selected successfully");
		}
	}
	public void selectlocation() {
	    try {
	     
	        WebElement locationsearch = wait.until(ExpectedConditions.visibilityOfElementLocated(location));
	        locationsearch.click();
	        locationsearch.sendKeys("Chennai");	        
	        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        Reporter.generateReport(driver, extTest, Status.PASS, "Location selected successfully");

	    } catch (TimeoutException te) {
	        Reporter.generateReport(driver, extTest, Status.FAIL, "Location not selected successfully");
	    }
	}
	
	public void submit() {
		try {
		
		 driver.findElement(submitbtn).click();
		 Reporter.generateReport(driver, extTest, Status.PASS, "Submit successfully");
	    }
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "submit unsuccessfull");
		}
			
	}
		
}
