#uc11 Book Piano Tuner#

|*uc11*|* Book Piano Tuner *| 
|----|----|
|Name| Book Piano Tuner |
|Use Case Id|uc11|
|Priority/Risk|3|
|Value|4|
|Primary Actor|User|
|Secondary Actor| Tuner|
|Description|User chooses Tuner and sends a booking request|
|Preconditions|Booking form must be completed and submitted|
|Trigger|Selecting the Book Tuner Option |
| | | 
|Typical Scenario| |
| |1. User invokes Book Tuner function|
| |2. System retrieves a list of Piano Tuners|
| |3. System displays Piano Tuners Listing UI|
| |4. User selects a Piano Tuner |
| |5. System displays Piano Tuners Booking UI|
| |6.  User enters booking details | 
| |7. User submits details | 
| |8. System validates the details *- Date is valid format, time is valid format * | 
| |9. System saves booking request details in the **Booking Request File** | 
| |10. System forwards booking request to the Piano tuner|
| |11. System displays confirmation message of booking request being sent|
| |11.	System clears UI| 
| | |
|Alternate Scenario 1| |
| |2. System fails to retrieve list of Piano Tuners |
| |3.	System displays error message|
| |4.	System clears UI|
| | |
|Alternate Scenario 2| |
| |8.	System identifies invalid entry of details|
| |9.	System displays error message|
| |10.	System prompts user to re-enter details|
| | | 
|Alternate Scenario 3| |
| |9.	System fails to save booking request details in the **Booking Request File**|
| |10.	System displays error message|
| |11.	System displays Piano Tuners Booking UI with booking details|
| | | 
|Conclusions|User’s booking request forwarded to the Tuner|
|Post conditions| Tuner’s response|
|Business Rules| |
|Implementation Constraints| |
