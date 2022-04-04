Changes:
1. Enums and Annotations: 
	Account_type changed from static to enum
2. General Programming: 
	Override toString() method to replace to_string, this way it will adhere to generally accepted naming conventions
	Adhere to generally accepted naming conventions: Changed name of get methods to better represent the intention of the function
	Removed "temp" variable because it was not used anywhere
	Removed function print() because it does not do anything
	Removed unnecessary prints in get methods
	Removed "magic" numbers
3. Formatting: 
	Applied formatting to code
4. Input Validation: 
	Validate inputs: for setter methods check if input data is correct
	Throw exceptions if input data is invalid
5. Exceptions: 
	Added more explanatory exceptions classes to be used when adding invalid values for value or rate
6. Meaningful Names: 
	Changed all variables to use camel case to be more consistent
	Changed the names of some variables to be more meaningful
	Changed the names of some functions to be more meaningful
7. Single Responsability: 
	Outsource the way the broker fee is computed
8. Classes and Interfaces:
	Created the RateInterface class which adds the getMonthlyRate() function so the user will have to override it
	Added more setters and getters.
	Added daysActive in the constructor
9. Functions: 
	In constructor used the set functions to set the values for the variables so the code won't repeat
	Functions split into multiple simple stupid methods, like the calculateBrokerFee formula
10. Fundamentals: 
	When computing the account fee extracted loanValue as common factor in forumla
11. Comments:
	Explain yourself in codeChanges:
1. Enums and Annotations: 
	Account_type changed from static to enum
2. General Programming: 
	Override toString() method to replace to_string, this way it will adhere to generally accepted naming conventions
	Adhere to generally accepted naming conventions: Changed name of get methods to better represent the intention of the function
	Removed "temp" variable because it was not used anywhere
	Removed function print() because it does not do anything
	Removed unnecessary prints in get methods
	Removed "magic" numbers
3. Formatting: 
	Applied formatting to code
4. Input Validation: 
	Validate inputs: for setter methods check if input data is correct
	Throw exceptions if input data is invalid
5. Exceptions: 
	Added more explanatory exceptions classes to be used when adding invalid values for value or rate
6. Meaningful Names: 
	Changed all variables to use camel case to be more consistent
	Changed the names of some variables to be more meaningful
	Changed the names of some functions to be more meaningful
7. Single Responsability: 
	Outsource the way the broker fee is computed
8. Classes and Interfaces:
	Created the RateInterface class which adds the getMonthlyRate() function so the user will have to override it
	Added more setters and getters.
	Added daysActive in the constructor
9. Functions: 
	In constructor used the set functions to set the values for the variables so the code won't repeat
	Functions split into multiple simple stupid methods, like the calculateBrokerFee formula
10. Fundamentals: 
	When computing the account fee extracted loanValue as common factor in forumla
11. Comments:
	Explain yourself in code