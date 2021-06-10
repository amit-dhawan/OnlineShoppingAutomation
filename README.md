# OnlineShoppingAutomation
This project contains solution for automation exercise give on 10/06/2021 as part of QURATE Selenium session.

URL: http://automationpractice.com<br>
Requirement: To create an automation testing solution to test an end to end scenario. <br>
Tools and Technology: Selenium Webdriver, Java, TestNG, Maven and POM Concepts<br>
Total time: 2hrs<br>
<br>


1.	Home Page<br>
	Pre-requisite: Browser and Internet connection<br>
•	User should not be logged into the application<br>
•	Verify that below elements are visible on screen<br>
•	Page Header Image “SALE 70% OFF ALL PRODUCTS”<br>
•	Search Bar with Placeholder text as “Search”<br>
•	Phone Number as 0123-456-789<br>
•	Contact us link with mouse-hover text as “Contact Us”<br>
•	Menu Bar has Dresses tab present<br>
<br>
2.	Product Listing Page<br>
	Pre-requisite: User click on T-shirts tab<br>
•	Verify below web elements:<br>
•	Compare(0) button<br>
•	Mouse hover to the 1st item present & click on “Add to cart” button<br>
•	Verify the item successfully added to cart by checking “Product successfully added to your shopping cart”<br>
•	Click on Continue shopping button<br>
<br>

3.	Shopping Cart Summary Page<br>
Pre-requisite: item added to cart<br>

	Click on Cart
•	Validate Cart to have one product as selected<br><br>

<br>
<br>
Notes:<br>
1)	Project Name should be – QurateAssessment_<Your_Name><br>
2)	Application url should be fetched from a configuration/properties file.<br>
3)	For validations use TestNG default assertions<br>
4)	Implement the Page Object Design Pattern<br>
5)	Use System.out.println where you have to print the details<br>
6)	Execution should be done using TestNG xml or pom.xml<br>
