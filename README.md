# Assignment 3 - Strings
In this assignment you will write a Java program that calculates the value of a property based on its size and the current market value per square foot. The program should prompt the user for the property details and then generate a report that includes the property details and the calculated value. The market value per square foot should be looked up from a `MarketValueMapper` class that takes, among other things, a zip code as input. The zip code is used by the `MarketValueMapper` to determine the market value per square foot.

## Assignment Submission
You will submit your assignment using GitHub Classroom.  When you are finished and want to make your final submission, use the checkin comment "FINAL SUBMISSION":

        git add .
        git commit -m "FINAL SUBMISSION"
        git push origin main

Any submission not having this comment will be assumed to be a work-in-progress and therefore will be ignored.  This implies that you must make your final push with this commit comment before the deadline.

## Input
Your program will prompt the user for all the information needed about the property as seen in the Output
section below. Be sure to configure your `Scanner` correctly to collect the data accordingly.

## Output
The output should be formatted as show below.  In the Property Report, all the output after
the first line (that has the name of the property) is arranged into 4 columns.  The first and
third are labels that are right justified, 10 characters wide. The second colum is 20 characters
wide and the fouth is 10 characters wide.  In the second and fourth columns, all numerical data
is right justified and all alphabetic data is left justified. The first row of the Property
Report only has two columns with the first being 10 characters wide and the second being 30 
characters wide.

	$> java Main

	Enter property name: My Imaginary House
	Enter property size (sq ft): 15000
	Enter year built: 2020
	Enter property address: 555 Memory Lane
	Enter property city: Orlando
	Enter property state: Florida
	Enter property zip code: 32812

	Property Report
	===============
	 Property: My Imaginary House            
	  Address: 555 Memory Lane           City: Orlando   
	    State: Florida                    Zip:      32812
	     Size:                15000      PPSF:    $165.00
	Mkt Value:        $2,475,000.00     Built:       2020

## Implementation Notes
- You must write a `Property` class that represents a real estate property. The class should have the following fields:
 - **name** (String): the name of the property.
 - **size** (BigDecimal): the size of the property in square feet.
 - **marketValuePerSqFt** (BigDecimal): the current market value per square foot.
 - **yearBuilt** (int): the year the property was built.
 - **address** (String): the address of the property.
 - **city** (String): the city of the property.
 - **state** (String): the state of the property.
 - **zipCode** (String): the zip code of the property.
- You must write a method `getComputedValue()` in the `Property` class that calculates the value of the property.
 - The method should return a `BigInteger` representing the value in US dollars. 
 - The value is calculated by multiplying the size of the property by the market value per square foot.
- You must write `PropertyReportGenerator` class containing a `generateReport()` method that generates a report about the property in the form of a `String`. It does NOT print anything, it simply generates a `String` (the report) that can be printed.
 - The report `String` must be built using `StringBuilder` and includes the entire output show in the Output section above.
 - You must use the `DecimalFormat` class to format the size, market value per square foot, and value as currency with 2 decimal places.
 - You must use the `String.format()` method to align the report columns.
- Your application class should be called `Main`.
- The a main method prompts the user for the property details and then creates a Property object based on the user input. It then uses the `MarketValueMapper` and `PropertyReportGenerator` to generate the report.
