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

public class AddPatientPage {
	

	WebDriver driver;
	WebDriverWait wait;
	ExtentTest extReports;
	ExtentTest extTest;
	Properties prop = PropertyReader.readProperties();
	
	    // enter change
		public static By change = By.xpath("//button[.//span[text()='Change']]");
		
		// click add patient
		public static By clickaddpatient = By.xpath("//button[@aria-label='Button' and span[text()='Add Patient']]");
		
		// click first name
		public static By firstname = By.xpath("//input[@placeholder='First Name']");
		
		// click last name
		public static By lastname = By.xpath("//input[@placeholder='Last name']");
		
		// click dob
		public static By dob = By.xpath("//input[@placeholder='DD / MM / YYYY']");
		
		// selectdob
		public static By selectdob = By.xpath("//button[.//abbr[@aria-label=\"September 3, 2025\"]]");
		
		// click profile create for
		public static By profilecreatefor = By.xpath("//button[text()='Select relation']");
		
		// click me
		public static By me = By.xpath("//li[@role='option' and .//span[text()='Me']]");
		
		// click gender
		public static By gender = By.xpath("//button[text()='Female']");
		
		// click email
		public static By email = By.xpath("//input[@placeholder='Enter Email']");
		
		// check box
		public static By checkbox = By.xpath("//input[@type=\"checkbox\" and contains(@class, \"AddNewPatientModal_inputCheckbox__RVKPI\")]");
		
		// save button
		public static By save = By.xpath("//button[.//span[text()='Save']]");
		
	
	public AddPatientPage(WebDriver driver,ExtentTest extTest5) {
		this.driver = Base.driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.extTest = extTest5;
	}
	
	public void enteraddpatient() {
	    try {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        WebElement changeButton = wait.until(ExpectedConditions.elementToBeClickable(change));
	        changeButton.click();
	       
	        WebElement addPatientButton = wait.until(ExpectedConditions.elementToBeClickable(clickaddpatient));
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
			WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(firstname));
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
			WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(lastname));
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
			wait.until(ExpectedConditions.visibilityOfElementLocated(dob)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectdob)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "Date of birth selected successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Date of birth not selected successfully");
			
		}
		
	}
	
	public void enterprofilecreate() {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(profilecreatefor)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(me)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "Profile created for myself successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Profile not created for myself successfully");
			
		}
		
	}
	
	public void entergender() {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(gender)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "Gender selected successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Gender not selected successfully");
		}
		
	}
	
	public void enteremail(String mail) {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement emailenter = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
			emailenter.click();
			emailenter.sendKeys(mail);
			Reporter.generateReport(driver, extTest, Status.PASS, "email entered successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "email not enterd successfully");
		}
		
	}
	
	public void clickcheckbox() {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(checkbox)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "check box selected successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "check box not selected successfully");
		}
		
	}
	
	public void submitpatient() {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(save)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "Saved successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Not saved successfully");
		}
		
	}

}
