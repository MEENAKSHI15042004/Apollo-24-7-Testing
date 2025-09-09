package com.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.pages.AddPatientPage;
import com.parameters.ExcelReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddPatientPageStep {
	
	AddPatientPage addpatientpage;
	WebDriver driver = Hooks.driver;
	ExtentTest extTest = Hooks.extTest;
	static String[][] excelData;
	
	@When("user select the add patient")
	public void user_select_the_add_patient() {
		addpatientpage = new AddPatientPage(driver, extTest);
		addpatientpage.enteraddpatient();
		if(excelData == null) {
			excelData = ExcelReader.readdata();
		}
	    
	}
	@When("user enter the first name {string}")
	public void user_enter_the_first_name(String firstname) {
		int row = Hooks.firstrow;
		firstname = excelData[row][1];
		addpatientpage.enterfirstname(firstname);
	   
	}
	@When("user enter the last name {string}")
	public void user_enter_the_last_name(String lastname) {
		int row = Hooks.firstrow;
		lastname = excelData[row][2];
		addpatientpage.enterlastname(lastname);
	    
	}
	@When("user enter the dob")
	public void user_enter_the_dob() {
	    addpatientpage.enterdob();
	}
	@When("user enter the profile preffered for")
	public void user_enter_the_profile_preffered_for() {
	   addpatientpage.enterprofilecreate();
	}
	@When("user click the gender")
	public void user_click_the_gender() {
	    addpatientpage.entergender();
	}
	@When("user enter the email {string}")
	public void user_enter_the_email(String email) {
		int row = Hooks.firstrow;
		email = excelData[row][3];
		addpatientpage.enteremail(email);
	    
	}
	@When("user click the check box")
	public void user_click_the_check_box() {
		addpatientpage.clickcheckbox();
	    
	}
	@Then("user click the submit button")
	public void user_click_the_submit_button() {
	    addpatientpage.submit();
	}


}
