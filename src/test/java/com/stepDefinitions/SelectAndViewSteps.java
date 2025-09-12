package com.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.pages.SelectAndViewPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectAndViewSteps {
	
	SelectAndViewPage selectandviewpage;
	WebDriver driver = Hooks.driver;
	ExtentTest extTest = Hooks.extTest;
	
	@When("the user select the doctor from the list")
	public void the_user_select_the_doctor_from_the_list() {
	   selectandviewpage = new SelectAndViewPage(driver,extTest);
	   selectandviewpage.selectdoctor();
	   
	}
	@When("user view the doctor details")
	public void user_view_the_doctor_details() {
		selectandviewpage.viewdetails();
	    
	}
	@Then("user select the consultation type")
	public void user_select_the_consultation_type() {
	   selectandviewpage.consultationtype();
	}

}
