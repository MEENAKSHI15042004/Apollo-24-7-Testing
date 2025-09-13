package com.pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
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

public class ScheduleAppointmentPage {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest extReports;
	ExtentTest extTest;
	Properties prop = PropertyReader.readProperties();
	
	//select date
	public static By selectdate1 = By.xpath("//p[normalize-space(text())='18']");
	
	// select time
	public static By selecttime = By.xpath("//p[normalize-space(text())='06:45 PM']");
	
	public ScheduleAppointmentPage(WebDriver driver,ExtentTest extTest5) {
		this.driver = Base.driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.extTest = extTest5;
	}
	
	public void date() {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(selectdate1)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "Date selected successfully");
			}
			catch (TimeoutException te) {
				Reporter.generateReport(driver, extTest, Status.FAIL, "Date not selected successfully");
			}
		}
	
	public void selecttime() {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(selecttime)).click();
			Reporter.generateReport(driver, extTest, Status.PASS, "Time selected successfully");
			}
			catch (TimeoutException te) {
				Reporter.generateReport(driver, extTest, Status.FAIL, "Time not selected successfully");
			}
		}
		
	public void scheduleAppointment() {
	    try {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        WebElement schedule = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//button[.//span[normalize-space(text())='Schedule Appointment']]")
	        ));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", schedule);
	        schedule.click();
	        
	        Reporter.generateReport(driver, extTest, Status.PASS, "Schedule the Appointment Successfully");
	    } catch (TimeoutException te) {
	        Reporter.generateReport(driver, extTest, Status.FAIL, "Schedule the Appointment not Successfully");
	    } catch (ElementClickInterceptedException ecie) {
	        Reporter.generateReport(driver, extTest, Status.FAIL, "Element was intercepted – unable to click");
	    }
	}

		

}
