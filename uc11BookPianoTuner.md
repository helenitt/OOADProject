#uc11 Book Piano Tuner#

<<<<<<< HEAD
|*uc11*|*Book Piano Tuner*| 
=======
|*uc11*|* Book Piano Tuner *| 
>>>>>>> refs/remotes/origin/HelensBranch
|----|----|
|Name| Book Piano Tuner |
|Use Case Id|uc11|
|Priority/Risk|3|
|Value|4|
<<<<<<< HEAD
|Primary Actor|Customer|
=======
|Primary Actor|User|
>>>>>>> refs/remotes/origin/HelensBranch
|Secondary Actor| Tuner|
|Description|User chooses Tuner and sends a booking request|
|Preconditions|Booking form must be completed and submitted|
|Trigger|Selecting the Book Tuner Option |
| | | 
|Typical Scenario| |
<<<<<<< HEAD
| |1. Customer invokes Book Tuner function|
| |2. System retrieves and displays a list of Piano Tuners|
| |3. Customer selects a Piano Tuner |
| |4. System displays Piano Tuners Booking form|
| |5. Customer enters and submits booking details |
| |6. System validates the details *- Date is valid format, time is valid format*| 
| |7. System saves booking request details in the **Booking Request File** | 
| |8. System forwards booking request to the Piano tuner and displays confirmation message| 
=======
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
>>>>>>> refs/remotes/origin/HelensBranch
| | |
|Alternate Scenario 1| |
| |2. System fails to retrieve list of Piano Tuners |
| |3.	System displays error message|
<<<<<<< HEAD
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

=======
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
>>>>>>> refs/remotes/origin/HelensBranch
