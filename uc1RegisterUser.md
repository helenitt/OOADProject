#Register User#

|*uc1*|*Register User*| 
|----|----|
|Name|Register User|
|Use Case Id|uc2|
|Priority/Risk|1|
|Value|4|
|Primary Actor|User|
|Description|User registers new account in the system|
|Preconditions|Registration form must be completed and submitted|
|Trigger| |
| | | 
|Typical Scenario| |
| |1.User invokes register function
2.System retrieves the next user id
3.System displays registration UI
4.User enters registration details
..*Username
..*Name
..*Address
..*Email 
..*Phone
..*Password
..*Password Confirmation
5.	User submits details
6.	System validates details
..*All fields must be entered
..*Email is valid format
..*Password and Password Confirmation must match
7.	System assigns the system date as registration date 
8.	System saves user details in the **User File** 
9.	System displays confirmation message
10.	System clears UI| 
| | | 
|Alternate Scenarios| |
6.	System identifies invalid entry
7.	System displays error message
8.	System prompts user to re-enter details
|Conclusions|User is now registered in the system|
|Post conditions|User may now use the system|
|Business Rules| |
|Implementation Constraints| |
