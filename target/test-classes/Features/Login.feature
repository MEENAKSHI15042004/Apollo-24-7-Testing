Feature:Login
Scenario:Login successfully
Given user is on the login page
When the user enter the valid Mobile Number as "<mobileno>"
And user request an otp
And user enter the otp
Then user should be successfully logged in