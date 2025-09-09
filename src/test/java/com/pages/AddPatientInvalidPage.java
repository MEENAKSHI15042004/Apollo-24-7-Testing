package com.pages;

import java.time.Duration;
import java.util.Properties;

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

public class AddPatientInvalidPage {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest extReports;
	ExtentTest extTest;
	Properties prop = PropertyReader.readProperties();
	
	public AddPatientInvalidPage(WebDriver driver,ExtentTest extTest6) {
		this.driver = Base.driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.extTest = extTest6;
	}
	
	public void invalidaddpatient() {
		try {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        WebElement changeButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.change));
	        changeButton.click();
	       
	        WebElement addPatientButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.clickaddpatient));
	        addPatientButton.click();
	        Reporter.generateReport(driver, extTest, Status.PASS, "'Add Patient' button clicked successfully");

	    } catch (TimeoutException te) {
	        Reporter.generateReport(driver, extTest, Status.FAIL,
	                "Timeout: Could not find 'Change' or 'Add Patient' buttons within 20 seconds");
	    } catch (Exception e) {
	        Reporter.generateReport(driver, extTest, Status.FAIL,
	                "Unexpected error during 'Add Patient' step: " + e.getMessage());
	    }
		
	}
	
	public void emptyfield() {
		
//		try {
		
//		 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	        WebElement changeButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.change));
//	        changeButton.click();
	       
//	        WebElement addPatientButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.clickaddpatient));
//	        addPatientButton.click();
	        
//	        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//			WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.firstname));
//			firstNameInput.click();
//			
//			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//			WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.lastname));
//			lastNameInput.click();
//			
//			Reporter.generateReport(driver,extTest,Status.FAIL,"All fields are empty! ");
//			driver.findElement(Locators.cancel);
//		}
//		catch (TimeoutException te) {
//			Reporter.generateReport(driver, extTest, Status.PASS, "All fields are filled");
//			
//		}
		try {
			Reporter.generateReport(driver,extTest,Status.FAIL,"All fields are empty! ");
			driver.findElement(Locators.cancel).click();
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.PASS, "All fields are filled");
			
		}
		
	}
	
	public void invalidfirstname(String lname) {
		try {
			
			WebElement addPatientButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.clickaddpatient));
			addPatientButton.click();
		        
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.firstname));
			firstNameInput.click();
			
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.lastname));
			lastNameInput.click();
			lastNameInput.sendKeys(lname);
			
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.dob)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.selectdob)).click();
			
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.profilecreatefor)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.me)).click();
		
			Reporter.generateReport(driver,extTest,Status.FAIL,"First Name field is empty");
			driver.findElement(Locators.cancel).click();
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.PASS, "All fields are filled");
			
		}
		
	}
	
	public void invalidlastname(String fname) {
		
	try {
			
			WebElement addPatientButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.clickaddpatient));
			addPatientButton.click();
		        
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.firstname));
			firstNameInput.click();
			firstNameInput.sendKeys(fname);
			
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.lastname));
			lastNameInput.click();
			
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.dob)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.selectdob)).click();
			
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.profilecreatefor)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.me)).click();
		
			Reporter.generateReport(driver,extTest,Status.FAIL,"last Name field is empty");
			driver.findElement(Locators.cancel).click();
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.PASS, "All fields are filled");
			
		}
		
	}
	
	public void dobnotentered(String fname,String lname) {
		
	try {
			
			WebElement addPatientButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.clickaddpatient));
			addPatientButton.click();
		        
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.firstname));
			firstNameInput.click();
			firstNameInput.sendKeys(fname);
			
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.lastname));
			lastNameInput.click();
			lastNameInput.sendKeys(lname);
					
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.profilecreatefor)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.me)).click();
		
			Reporter.generateReport(driver,extTest,Status.FAIL,"Date of birth field is empty");
			driver.findElement(Locators.cancel).click();
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.PASS, "All fields are filled");
			
		}
		
	}
	
	public void invalidemail(String fname,String lname,String mail) {
		
	try {
			
			WebElement addPatientButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.clickaddpatient));addPatientButton.click();
		        
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.firstname));
			firstNameInput.click();
			firstNameInput.sendKeys(fname);
			
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.lastname));
			lastNameInput.click();
			lastNameInput.sendKeys(lname);
			
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.dob)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.selectdob)).click();
			
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.profilecreatefor)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.me)).click();
			
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.email));
			email.click();
			email.sendKeys(mail);
		
			Reporter.generateReport(driver,extTest,Status.FAIL,"Email is invalid");
			driver.findElement(Locators.cancel).click();
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.PASS, "All fields are filled");
			
		}
		
	}

}
