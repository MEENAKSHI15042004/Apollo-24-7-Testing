package com.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.pages.ConfirmAppointmentPage;

import io.cucumber.java.en.When;

public class ConfirmAppointmentPageStep {
	
	ConfirmAppointmentPage confirmappointmentpage;
	WebDriver driver = Hooks.driver;
	ExtentTest extTest = Hooks.extTest;
	
	@When("user review the doctor and patient details and click confirm appointment")
	public void user_review_the_doctor_and_patient_details_and_click_confirm_appointment() {
	    confirmappointmentpage = new ConfirmAppointmentPage(driver, extTest);
	    confirmappointmentpage.clickconfirmappointment();
	}
	@When("user check the popup message and click ok")
	public void user_check_the_popup_message_and_click_ok() {
		confirmappointmentpage.popup();
	   
	}
	@When("user view the doctor in my appointment")
	public void user_view_the_doctor_in_my_appointment() {
		confirmappointmentpage.myappointment();
	    
	}
	@When("user view tha total charges")
	public void user_view_tha_total_charges() {
		confirmappointmentpage.totalcharge();
	    
	}


}
