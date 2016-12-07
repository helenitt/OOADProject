#uc10 Buy Piano#

BuyPiano can be started either directly(by giving id and quantity) or by first searching all pianos and then buying one of it.

|*uc10*|*Buy Piano*| 
|----|----|
|Name|Register User|
|Use Case Id|uc10|
|Priority/Risk|3|
|Value|4|
|Primary Actor|Customer|
|Secondary Actor|System, Piano|
|Description|User Buys Piano|
|Preconditions|for Typical Scenario 1 Piano needs to be searched|
|Trigger| |
| | | 
|Typical Scenario 1| |
| |1. User invokes buy piano function|
| |2. System retrieves piano id and displays piano details|
| |3. User confirms whether or not he wants to buy the piano|
| |4. System takes the amount needed to pay for the piano from his account|
| |5. System displays a confirmation message|
|Typical Scenario 2| |
| |2. User invokes buy piano function|
| |3. System asks for Piano ID|
| |4. User inserts Piano ID|
| |5. System asks for quantity|
| |6. User inserts quantity|
| |7. System displays message that informs whether the piano was bought or not|
| |8. System prints all the pianos that were bought by the user|
| | |
|Alternate Scenario 2 for Typical Scenario 1| |
| |2. System fails to retrieve the piano id|
| |3.	System displays an error message|
| | |
|Alternate Scenario 3 for Typical Scenario 1| |
| |3. User does not want to buy the piano|
| |4.	System displays an error/cancel message|
| | |
|Alternate Scenario 4 for Typical Scenario 1| |
| |4. System fails to take the cost of the piano from the users account|
| |5.	System displays an error message|
| | |
|Alternate Scenario 5 for Typical Scenario 2| |
| |7. System fails to find piano with that ID|
| |8.	System displays an error message|
| | |
|Alternate Scenario 6 for Typical Scenario 2| |
| |7. System tried to buy more pianos than in stock|
| |8.	System informs user that he tried to buy more than in stock and that it bought the maximum possible quantity instead|
| |9. System prints all pianos bought by the user|
| | |
|Conclusions|User bought piano|
|Post conditions| |
|Business Rules| |
|Implementation Constraints| |
