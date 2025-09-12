package com.pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class FindDoctorInvalidPage {
	
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
	
	
	public FindDoctorInvalidPage(WebDriver driver,ExtentTest extTest9) {
		this.driver = Base.driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.extTest = extTest9;
	}
	
	public void enterdateonly() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(finddoctor)).click();
		
		try {        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(dateicon)).click();
			driver.findElement(date).click();
			
			WebElement locationsearch = wait.until(ExpectedConditions.visibilityOfElementLocated(location));
			locationsearch.click();
			driver.findElement(location).sendKeys(Keys.CONTROL + "a");
			driver.findElement(location).sendKeys(Keys.BACK_SPACE);
			
			driver.findElement(submitbtn).click();

			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			Reporter.generateReport(driver,extTest,Status.FAIL,"Please select Area/Pin code and speciality");
		}
		catch(TimeoutException te) {
			Reporter.generateReport(driver,extTest,Status.PASS,"submitted successfully");
		}
		
	}
	
	public void enterdateandlocationonly(String locationdata) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(finddoctor)).click();
		
		try {        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(dateicon)).click();
			driver.findElement(date).click();
			
			WebElement locationsearch = wait.until(ExpectedConditions.visibilityOfElementLocated(location));
			locationsearch.click();
			driver.findElement(location).sendKeys(Keys.CONTROL + "a");
			driver.findElement(location).sendKeys(Keys.BACK_SPACE);
			
			locationsearch.sendKeys(locationdata);
			driver.findElement(submitbtn).click();

			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			Reporter.generateReport(driver,extTest,Status.FAIL,"Please select the speciality");
		}
		catch(TimeoutException te) {
			Reporter.generateReport(driver,extTest,Status.PASS,"submitted successfully");
		}
		
	}
	
	public void enterspecialityanddate() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(finddoctor)).click();
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(enterspeciality)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(selectspeciality)).click();
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(dateicon)).click();
			driver.findElement(date).click();
			
			 WebElement locationsearch = wait.until(ExpectedConditions.visibilityOfElementLocated(location));
			 locationsearch.click();
			 driver.findElement(location).sendKeys(Keys.CONTROL + "a");
			 driver.findElement(location).sendKeys(Keys.BACK_SPACE);
			
			driver.findElement(submitbtn).click();

			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			Reporter.generateReport(driver,extTest,Status.FAIL,"Please select Area/Pin code");
		}
		catch(TimeoutException te) {
			Reporter.generateReport(driver,extTest,Status.PASS,"submitted successfully");
		}
		
	}
	
	public void otherlocation(String locationdata) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(finddoctor)).click();
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(enterspeciality)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(selectspeciality)).click();
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(dateicon)).click();
			driver.findElement(date).click();
			
		   WebElement locationsearch = wait.until(ExpectedConditions.visibilityOfElementLocated(location));
		   locationsearch.click();
		   driver.findElement(location).sendKeys(Keys.CONTROL + "a");
		   driver.findElement(location).sendKeys(Keys.BACK_SPACE);
	       locationsearch.sendKeys(locationdata);
	       driver.findElement(submitbtn).click();
	        
	        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        Reporter.generateReport(driver,extTest,Status.FAIL,"Please select the location in India");
		}
		catch(TimeoutException te) {
			Reporter.generateReport(driver,extTest,Status.PASS,"submitted successfully");
		}
		
	}
	
	public void pincode(String pincodedata) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(finddoctor)).click();
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(enterspeciality)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(selectspeciality)).click();
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(dateicon)).click();
			driver.findElement(date).click();
		   
			WebElement locationsearch = wait.until(ExpectedConditions.visibilityOfElementLocated(location));
			 locationsearch.click();
			driver.findElement(location).sendKeys(Keys.CONTROL + "a");
			driver.findElement(location).sendKeys(Keys.BACK_SPACE);
	       
	        locationsearch.sendKeys(pincodedata);
	        driver.findElement(submitbtn).click();
	        
	        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        Reporter.generateReport(driver,extTest,Status.FAIL,"Pin code length is exceeded");
		}
		catch(TimeoutException te) {
			Reporter.generateReport(driver,extTest,Status.PASS,"submitted successfully");
		}
		
	}
		
	
	public void enterlocationonly(String locationdata) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(finddoctor)).click();
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(enterspeciality)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(selectspeciality)).click();
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(dateicon)).click();
			driver.findElement(date).click();
		   
			WebElement locationsearch = wait.until(ExpectedConditions.visibilityOfElementLocated(location));
	        locationsearch.click();
			driver.findElement(location).sendKeys(Keys.CONTROL + "a");
			driver.findElement(location).sendKeys(Keys.BACK_SPACE);
	        locationsearch.sendKeys(locationdata);
	        driver.findElement(submitbtn).click();
	        
	        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        Reporter.generateReport(driver,extTest,Status.FAIL,"Please enter and select the location");
		}
		catch(TimeoutException te) {
			Reporter.generateReport(driver,extTest,Status.PASS,"submitted successfully");
		}
		
	}
}
