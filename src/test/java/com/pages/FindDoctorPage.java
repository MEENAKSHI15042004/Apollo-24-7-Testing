package com.pages;

import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
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

public class FindDoctorPage {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest extReports;
	ExtentTest extTest;
	Properties prop = PropertyReader.readProperties();
	
	
	public FindDoctorPage(WebDriver driver,ExtentTest extTest3) {
		this.driver = Base.driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.extTest = extTest3;
		
	}
	public void clickfinddoctor() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(Locators.finddoctor)).click();
	}

	
	public void enterspecality() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.enterspeciality)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(Locators.selectspeciality)).click();

			Reporter.generateReport(driver,extTest,Status.PASS,"specality selected successfully");
		}
		catch(TimeoutException te) {
			//fail the extent report
			Reporter.generateReport(driver,extTest,Status.FAIL,"specality not selected successfully");
		}
	}
	
	public void selectdate() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.dateicon)).click();
			driver.findElement(Locators.date).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.validatedate));
			Reporter.generateReport(driver,extTest,Status.PASS,"Date selected successfully");
		}
		catch(TimeoutException te) {
			//fail the extent report
			Reporter.generateReport(driver,extTest,Status.FAIL,"Date not selected successfully");
		}
	}
	public void selectlocation() {
	    try {
	        // Wait for location input and type "chennai"
	        WebElement location = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.location));
	        location.click();
	        location.sendKeys("chennai");

	        // Wait for the suggestion to appear
	        WebElement suggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//li[contains(text(), 'Chennai, Tamil Nadu')]")));
	        
	        wait = new WebDriverWait(driver,Duration.ofSeconds(10));

	        // Hover over suggestion and click
	        Actions actions = new Actions(driver);
	        actions.moveToElement(suggestion).click().perform();

	        // Report success
	        Reporter.generateReport(driver, extTest, Status.PASS, "Location selected successfully");

	    } catch (TimeoutException te) {
	        // Fail the extent report
	        Reporter.generateReport(driver, extTest, Status.FAIL, "Location not selected successfully");
	    }
	}
	

	public void submit() {
		try {
		
		driver.findElement(Locators.submitbtn).click();
		
		 Reporter.generateReport(driver, extTest, Status.PASS, "Submit successfully");
	    }
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "sunmit unsuccessfull");
		}
			
		}
		
}
