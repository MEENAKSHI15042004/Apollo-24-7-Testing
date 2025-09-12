package com.pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.setup.Base;
import com.setup.PropertyReader;
import com.setup.Reporter;

public class ConfirmAppointmentPage {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest extReports;
	ExtentTest extTest;
	Properties prop = PropertyReader.readProperties();
	
	// Appointment details
		public static By appointmentdetails = By.xpath("//p[text()='Appointment Details']");
		
		// patient details 
		public static By patientdetails = By.xpath("//p[text()='Patient Details']");
		
		// confirm Appointment
		public static By confirmappointment = By.xpath("//button[span[text()='Confirm Appointment']]");
		
		// pop up Appointment details
		public static By popupappointment = By.xpath("//h2[text()='Appointment Confirmation']");
		
		// pop up ok
		public static By popupok =  By.xpath("//span[text()='OK, GOT IT']");
		
		// login popup
		public static By loginpopup = By.xpath("//div[@id='loginPopup']");
		
		// my appointments
		//public static By myappointment = By.xpath("//a[@href='/appointments']");
		public static By myappointment = By.xpath("//div[contains(@class,'account')]//a[normalize-space(text())='My Appointments']");
		
		// doctor in my appointment
		public static By myappointmentdoctor = By.xpath("//p[text()='Dr. Vijay Dureja']");
		
		// total charges
		public static By totalcharge = By.xpath("//div[text()='Total Charges']");
	
	public ConfirmAppointmentPage(WebDriver driver,ExtentTest extTest4) {
		this.driver = Base.driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.extTest = extTest4;
		
	}
	public void clickconfirmappointment() {
		
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(appointmentdetails));
			wait.until(ExpectedConditions.visibilityOfElementLocated(patientdetails));
			wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".AddNewPatientModal_addNewMemberBx__lT8gP")));
			wait.until(ExpectedConditions.elementToBeClickable(confirmappointment)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "Confirm Appointment successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Confirm Appointment not successfully");
			
		}
		
	}
	
	public void popup() {
		
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(popupappointment));
			wait.until(ExpectedConditions.visibilityOfElementLocated(popupok)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "Popup displayed and details verified successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Popup not displayed successfully");
			
		}
		
	}
	
	public void myappointment() {
		
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(myappointmentdoctor));
			Reporter.generateReport(driver, extTest, Status.PASS, "Popup displayed and details verified successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Popup not displayed successfully");
			
		}
		
	}
	
	public void totalcharge() {
		
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(myappointmentdoctor)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(totalcharge));
			Reporter.generateReport(driver, extTest, Status.PASS, "Total charges displayed successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Total charges not displayed successfully");
			
		}
		
	}

}
