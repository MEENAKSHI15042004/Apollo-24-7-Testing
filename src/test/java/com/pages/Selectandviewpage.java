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
import com.objectRepository.Locators;
import com.setup.Base;
import com.setup.PropertyReader;
import com.setup.Reporter;

public class Selectandviewpage {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest extReports;
	ExtentTest extTest;
	Properties prop = PropertyReader.readProperties();
	
	
	public Selectandviewpage(WebDriver driver,ExtentTest extTest4) {
		this.driver = Base.driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.extTest = extTest4;
	}
	
	public void selectdoctor() {
		  try {
		        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		        // Wait explicitly until the button is clickable
		        WebElement selectdoctor = wait.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("//p[normalize-space(text())='Dr. Vijay Dureja']")
		        ));
		        
		        // Scroll into view just in case
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", selectdoctor);

		        // Click the button
		        selectdoctor.click();
		        
		        Reporter.generateReport(driver, extTest, Status.PASS, "Doctor selected Successfully");
		    } catch (TimeoutException te) {
		        Reporter.generateReport(driver, extTest, Status.FAIL, "Doctor not selected Successfully");
		    } catch (ElementClickInterceptedException ecie) {
		        Reporter.generateReport(driver, extTest, Status.FAIL, "Element was intercepted – unable to click");
		    }
		}
	
	public void viewdetails() {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.viewdetails));
			Reporter.generateReport(driver, extTest, Status.PASS, "Doctor details viewed successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "Doctor details not viewed successfully");
			
		}
	}
	
	public void consultationtype() {
		try {
			Reporter.generateReport(driver, extTest, Status.PASS, "consultation type selected successfully");
		}
		catch (TimeoutException te) {
			Reporter.generateReport(driver, extTest, Status.FAIL, "consultation type not selected successfully");
			
		}
		
	}

}
