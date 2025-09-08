package com.objectRepository;

import org.openqa.selenium.By;

public class Locators {
	
	// login button
	public static By login = By.xpath("//span[text()='Login']");
	
	// Mobile Number entry
	public static By mobileNumberEntry = By.xpath("//input[@name='mobileNumber']");
	
	// continue button
	public static By continueButton = By.xpath("//button[contains(text(),'Continue')]");

	// OTP entry
	public static By otpentry = By.xpath("//input[@title='Please enter the otp']");
	
	// verify button
	public static By verifybutton = By.xpath("//button[contains(text(), 'Verify')]");
	
	//validate login
	public static By validatelogin = By.xpath("//*[@id=\"loginPopup\"]/img");
	
	//mobile field
	public static By mobilefield = By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div[1]/div[2]/ul/li/div/div/div[2]/div[2]/div[2]/div/p[2]");
	
	// invalid message
	public static By invalidmobileerrormsg = By.xpath("//div[text()='This seems like a wrong number']");
	
	// close button
	public static By closebtn = By.xpath("//span[@class='Rb']");
}
