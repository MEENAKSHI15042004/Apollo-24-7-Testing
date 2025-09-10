package com.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.pages.AddPatientInvalidPage;
import com.parameters.ExcelReader;

import io.cucumber.java.en.When;

public class AddPatientInvalidPageStep {
	
	AddPatientInvalidPage addpatientinvalidpage;
	WebDriver driver = Hooks.driver;
	ExtentTest extTest = Hooks.extTest;
	static String[][] excelData;
	
//	@When("user does not fill any field")
//	public void user_does_not_fill_any_field() {
//		addpatientinvalidpage = new AddPatientInvalidPage(driver, extTest);
//		addpatientinvalidpage.emptyfield();
//		if(excelData == null) {
//			excelData = ExcelReader.readdata();
//		}
//	}
//	@When("user does not enter the first name but enter the last name as {string}")
//	public void user_does_not_enter_the_first_name_but_enter_the_last_name_as(String lastname) {
//		int row = Hooks.firstrow;
//	    lastname = excelData[row][2];
//	    addpatientinvalidpage.invalidfirstname(lastname);
//	    
//	}
//	@When("user does not enter the second name but enter the first name as {string}")
//	public void user_does_not_enter_the_second_name_but_enter_the_first_name_as(String firstname) {
//		int row = Hooks.firstrow;
//	    firstname = excelData[row][1];
//	    addpatientinvalidpage.invalidlastname(firstname);
//
//	   
//	}
//	@When("user does not enter the date of birth but enter the first name as {string} and last name as {string}")
//	public void user_does_not_enter_the_date_of_birth_but_enter_the_first_name_as_and_last_name_as(String firstname, String lastname) {
//	   int row = Hooks.firstrow;
//	   firstname = excelData[row][1];
//	   lastname = excelData[row][2];
//	   addpatientinvalidpage.dobnotentered(firstname,lastname);
//	}
//	@When("user does not enter a valid email but enter the first name as {string} and last name as {string}")
//	public void user_does_not_enter_a_valid_email_but_enter_the_first_name_as_and_last_name_as(String string, String string2) {
//	    
//	}


}
