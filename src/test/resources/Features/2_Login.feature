Feature:Login

Background:
Given user is on the login page

Scenario:Verify login failure with invalid mabile number

When the user enter the invalid Mobile Number as "<invalid_mobile_no>"
Then an error message is displayed "Invalid mobile number"

Scenario:Verify  login failure with invalid OTP

When the user enter the valid Mobile Number as "<mobileno>"
And the user enter the invalid otp
Then an error message is displayed "Invalid OTP"

Scenario:Login successfully

When the user enter the valid Mobile Number as "<mobileno>"
And user request an otp
And user enter the otp
Then user should be successfully logged in