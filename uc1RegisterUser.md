#Register User#

|*uc1*|*Register User*| 
|----|----|
|Name|Register User|
|Use Case Id|uc2|
|Priority/Risk|1|
|Value|4|
|Primary Actor|Customer|
|Secondary Actor|Teacher, Tuner|
|Description|User registers new account in the system|
|Preconditions|Registration form must be completed and submitted|
|Trigger| |
| | | 
|Typical Scenario| |
| |1. User invokes register function|
| |2. System retrieves the next user id and displays registration form|
| |3. User enters and submits registration details*-Username, Name, User Type, Email, Phone, Password, Password Confirmation*|
| |4.	System validates details*-All fields must be entered, Email is valid format, Password and Password Confirmation must match*|
| |5. System assigns the system date as registration date and saves user details in the **User File**|
| |6.	System displays confirmation message|
| | |
|Alternate Scenario 1| |
| |2. System fails to retrieve next user id|
| |3.	System displays error message|
| | |
|Alternate Scenario 2| |
| |4.	System identifies invalid entry of details|
| |5.	System displays error message and prompts user to re-enter details|
| | | 
|Alternate Scenario 3| |
| |5.	System fails to save user details in the **User File**|
| |6.	System displays error message|
| | | 
|Conclusions|User is now registered in the system|
|Post conditions|User may now use the system|
|Business Rules| |
|Implementation Constraints| |
