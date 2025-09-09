Feature:Add Patient unsuccessful
@Ignore
Scenario:Validattion of adding patient unsuccessful
When user select the add patient
And user does not fill any field
And user does not enter the first name but enter the last name as "<lastname>"
And user does not enter the second name but enter the first name as "<firstname>"
And user does not enter the date of birth but enter the first name as "<firstname>" and last name as "<lastname>"
And user does not enter a valid email as "<email>" but enter the first name as "<firstname>" and last name as "<lastname>"
