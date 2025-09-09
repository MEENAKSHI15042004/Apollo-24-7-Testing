package com.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.pages.Scheduleappointmentpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScheduleAppointmentStep {

	Scheduleappointmentpage scheduleappointmentpage;
	WebDriver driver = Hooks.driver;
	ExtentTest extTest = Hooks.extTest;
	
	@When("user select the appointment date")
	public void user_select_the_appointment_date() {
	  scheduleappointmentpage = new Scheduleappointmentpage(driver, extTest);
	  scheduleappointmentpage.date();
	  
	}
	@When("user select the appointment time")
	public void user_select_the_appointment_time() {
		// scheduleappointmentpage.selecttime();
	   
	}
	@Then("user clicks the schedule Appointment")
	public void user_clicks_the_schedule_appointment() {
	    scheduleappointmentpage.scheduleAppointment();
	}
}
