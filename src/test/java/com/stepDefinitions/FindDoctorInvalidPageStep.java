package com.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.pages.FindDoctorInvalidPage;


import io.cucumber.java.en.When;

public class FindDoctorInvalidPageStep {
	
	FindDoctorInvalidPage finddoctorinvalidpage;
	WebDriver driver = Hooks.driver;
	ExtentTest extTest = Hooks.extTest;
	
	@When("user enter date only")
	public void user_enter_date_only() {
		finddoctorinvalidpage = new FindDoctorInvalidPage(driver, extTest);
		finddoctorinvalidpage.enterdateonly();
	}
	
	@When("user enter speciality and date only")
	public void user_enter_speciality_and_date_only() {
		finddoctorinvalidpage.enterspecialityanddate();
	    
	}
	
	@When("user enter location other than india")
	public void user_enter_location_other_than_india() {
		finddoctorinvalidpage.otherlocation();
	    
	}
	@When("the user enter the invalid pincode")
	public void the_user_enter_the_invalid_pincode() {
		finddoctorinvalidpage.pincode();
	    
	}
	@When("user only enter location without selecting from the suggestion")
	public void user_only_enter_location_without_selecting_from_the_suggestion() {
		finddoctorinvalidpage.enterlocationonly();
	    
	}

}
