package com.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.pages.LaunchBrowserPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaunchBrowserSteps {
	
	LaunchBrowserPage launchbrowserpage;
	WebDriver driver ;
	
	
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		
		launchbrowserpage = new LaunchBrowserPage(driver);
		launchbrowserpage.launchbrowser();
	    
	}
	@When("user open the website")
	public void user_open_the_website() {
		launchbrowserpage.openwebsite();

	}
	@Then("the browser should display the Apollo home Page")
	public void the_browser_should_display_the_apollo_home_page() {
		launchbrowserpage.homepage();
	    
	}

}
