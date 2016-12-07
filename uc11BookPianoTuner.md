#uc11 Book Piano Tuner#

|*uc11*|*Book Piano Tuner*| 
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
| |1. Customer invokes Book Tuner function|
| |2. System retrieves and displays a list of Piano Tuners|
| |3. Customer selects a Piano Tuner |
| |4. System displays Piano Tuners Booking form|
| |5. Customer enters and submits booking details |
| |6. System validates the details *- Date is valid format, time is valid format*| 
| |7. System saves booking request details in the **Booking Request File** | 
| |8. System forwards booking request to the Piano tuner and displays confirmation message| 
| | |
|Alternate Scenario 1| |
| |2. System fails to retrieve list of Piano Tuners |
| |3.	System displays error message|
| | |
|Alternate Scenario 2| |
| |6.	System identifies invalid entry of details|
| |7.	System displays error message and prompts user to re-enter details|
| | | 
|Alternate Scenario 3| |
| |7.	System fails to save booking request details in the **Booking Request File**|
| |8.	System displays error message|
| | | 
|Conclusions|Customer’s booking request forwarded to the Tuner|
|Post conditions| Tuner’s response|
|Business Rules| |
|Implementation Constraints| |
