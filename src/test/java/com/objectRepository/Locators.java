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
	
	// close profile
	public static By profileclose = By.xpath("//div[contains(@class, 'ProfileNew_icon-ic_cross')]");
	
	// click find doctor
	public static By finddoctor = By.xpath("//a[text()='Find Doctors']");
	
	// enter speciality
	public static By enterspeciality = By.xpath("//input[@placeholder='Enter Speciality']\r\n");
	
	// select specality
	public static By selectspeciality = By.xpath("//span[normalize-space(text())='Anaesthesia']");
	// date icon
	public static By dateicon = By.xpath("//span[@class='QuickBook_dateImage__hbyKS icon-date']");
	
	//select date
	public static By date = By.xpath("//abbr[text()='19']");
	
	// validate date
	public static By validatedate = By.xpath("//span[text()='Fri 19th Sep']");
	
	// location
	public static By location = By.xpath("//input[@placeholder='Search location']");
	
	// submit button
	public static By submitbtn = By.xpath("//span[text()='Submit']");
	
	// validate find doctor
	public static By validatefinddoctor = By.id("id=\"Hospital Visit\"");
	
	// select type
	public static By type = By.xpath("//label[normalize-space(text())='Consult Online']");
	
	// select doctor
	public static By selectdoctor = By.xpath("//p[normalize-space(text())='Dr. G Sakthi Vignesh']\r\n");
	
	// view details
	public static By viewdetails = By.xpath("//h1[normalize-space(text())='Dr. G Sakthi Vignesh']");
	
	//select consulationtype1
	public static By consultationtype1 = By.xpath("//button[normalize-space(text())='Consult Online']");
	// select consultation type
	public static By consultationtype = By.xpath("//button[normalize-space(text())='Visit Doctor']");
}
