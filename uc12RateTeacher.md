#uc 12 Rate Piano Teacher# 
*uc12* Rate Piano Teacher 

|Name| Rate Piano Teacher|

|Use Case Id| uc 12|

|Priority/Risk| 3

|Value| 4|

|Primary Actor|Customer|

|Secondary Actor| N/A

|Description| The user wishes to rate a teacher 

|Preconditions| The user must have previously booked the teacher

|Trigger| User invokes the Rate Teacher option
 
 | | | 
 
 |Typical Scenario| | 
 1. Customer invokes the Rate Teacher Option
 2. System retrieves list of teachers that the user has booked
 3. Customer selects a teacher
 4. System displays the teachers details and rating 
 5. Customer enters a rating for the teacher
 6. System validates and saves the rating
 7. System adds the rating to the average ratings for that teacher
 
 |Alternate Scenario 1| |
 2. System fails to retrieve list of teachers
 3. System Displays error message
 
 |Alternate Scenario 2| |
 4. System fails to retrieve teacher details
 5. System displays error message
 
 |Alternate Scenario 3| |
 6.System fails to save rating
 7. System displays error message
 
 |Conclusions|
 Customer has given the teacher a rating
 |Post conditions|
 
 |Business Rules| |
 
 |Implementation Constraints| |
