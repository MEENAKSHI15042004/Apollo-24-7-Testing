package com.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.pages.FindDoctorPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FindDoctorSteps {
	
	FindDoctorPage finddoctorpage;
	WebDriver driver = Hooks.driver;
	ExtentTest extTest = Hooks.extTest;
	
	@When("user clicks the find doctor")
	public void user_clicks_the_find_doctor() {
		finddoctorpage = new FindDoctorPage(driver, extTest);
	    finddoctorpage.clickfinddoctor();
	}
	@When("user select the speciality")
	public void user_select_the_speciality() {
	    finddoctorpage.enterspecality();
	}
	@When("user select the date")
	public void user_select_the_date() {
		finddoctorpage.selectdate();
	    
	}
	@When("user enter the location")
	public void user_enter_the_location() {
	    finddoctorpage.selectlocation();
	}
	@Then("submit the data")
	public void submit_the_data() {
	    finddoctorpage.submit();
	}
	
}
