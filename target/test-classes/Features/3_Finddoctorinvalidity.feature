Feature:Find Doctor unsuccessfull
Scenario:Verification of find the doctor unsuccessfull
When user clicks the find doctor
And user enter date only
And user enter date and location only "<location>"
And user enter speciality and date only
And user enter location other than india "<otherlocation>"
And the user enter the invalid pincode "<pincode>"
And user only enter location without selecting from the suggestion "<locationdata>"