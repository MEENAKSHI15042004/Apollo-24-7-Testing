Feature:Find Doctor unsuccessful

Background:
When user clicks the find doctor

Scenario:Verify unsuccessful attempts to find a doctor

And user enter date only
And user enter date and location only "<location>"
And user enter speciality and date only
And user enter location other than india "<otherlocation>"
And the user enter the invalid pincode "<pincode>"
And user only enter location without selecting from the suggestion "<locationdata>"