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

public class AddPatientPage {
	

	WebDriver driver;
	WebDriverWait wait;
	ExtentTest extReports;
	ExtentTest extTest;
	Properties prop = PropertyReader.readProperties();
	
	public AddPatientPage(WebDriver driver,ExtentTest extTest5) {
		this.driver = Base.driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.extTest = extTest5;
	}
	
	public void enteraddpatient() {
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

	
	public void enterfirstname(String fname) {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.firstname));
			firstNameInput.click();
			firstNameInput.sendKeys(fname);
			Reporter.generateReport(driver, extTest, Status.PASS, "First name enterd successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "First name not enterd successfully");
			
		}
		
	}
	
	public void enterlastname(String lname) {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.lastname));
			lastNameInput.click();
			lastNameInput.sendKeys(lname);
			Reporter.generateReport(driver, extTest, Status.PASS, "Last name enterd successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Last name not enterd successfully");
			
		}
		
	}
	
	public void enterdob() {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.dob)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.selectdob)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "Date of birth selected successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Date of birth not selected successfully");
			
		}
		
	}
	
	public void enterprofilecreate() {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.profilecreatefor)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.me)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "Profile created for myself successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Profile not created for myself successfully");
			
		}
		
	}
	
	public void entergender() {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.gender)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "Gender selected successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Gender not selected successfully");
		}
		
	}
	
	public void enteremail(String mail) {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.email));
			email.click();
			email.sendKeys(mail);
			Reporter.generateReport(driver, extTest, Status.PASS, "email entered successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "email not enterd successfully");
		}
		
	}
	
	public void clickcheckbox() {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.checkbox)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "check box selected successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "check box not selected successfully");
		}
		
	}
	
	public void submit() {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.save)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "Saved successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Not saved successfully");
		}
		
	}

}
