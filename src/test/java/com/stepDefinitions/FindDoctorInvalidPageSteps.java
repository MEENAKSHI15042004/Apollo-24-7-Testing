package com.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.pages.FindDoctorInvalidPage;
import com.parameters.ExcelReader;

import io.cucumber.java.en.When;

public class FindDoctorInvalidPageSteps {
	
	FindDoctorInvalidPage finddoctorinvalidpage;
	WebDriver driver = Hooks.driver;
	ExtentTest extTest = Hooks.extTest;
	static String[][] excelData;
	
	@When("user enter date only")
	public void user_enter_date_only() {
	   finddoctorinvalidpage = new FindDoctorInvalidPage(driver, extTest);
	   finddoctorinvalidpage.enterdateonly();
	   if(excelData == null) {
			excelData = ExcelReader.readdata();
		}
	}
	@When("user enter date and location only {string}")
	public void user_enter_date_and_location_only(String locationdata) {
		int row = Hooks.firstrow;
		locationdata = excelData[row][4];
	    finddoctorinvalidpage.enterdateandlocationonly(locationdata);
	}
	@When("user enter speciality and date only")
	public void user_enter_speciality_and_date_only() {
	    finddoctorinvalidpage.enterspecialityanddate();
	}
	@When("user enter location other than india {string}")
	public void user_enter_location_other_than_india(String locationdata) {
		int row = Hooks.firstrow;
		locationdata = excelData[row][5];
		finddoctorinvalidpage.otherlocation(locationdata);
	}
	@When("the user enter the invalid pincode {string}")
	public void the_user_enter_the_invalid_pincode(String pincodedata) {
		int row = Hooks.firstrow;
		pincodedata = excelData[row][6];
		finddoctorinvalidpage.pincode(pincodedata);
	}

	@When("user only enter location without selecting from the suggestion {string}")
	public void user_only_enter_location_without_selecting_from_the_suggestion(String locationdata) {
		int row = Hooks.firstrow;
		locationdata = excelData[row][4];
		finddoctorinvalidpage.enterlocationonly(locationdata);
	}

}
