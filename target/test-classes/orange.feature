Feature: Checking The Functionality Of Book A Free Demo 

Scenario: Book A Demo Page 
	Given user Must Launch The URL 
	When user Must Click The Book A Free Demo Button 
	And user Enter The Name In The Full Name Field 
	And user Enter The Email In The Business Email Field 
	And user Select The Country In The Country Field 
	And user Enter The Phone Number In The Phone Number Field 
	Then user Click The Submit Button To Book A Free Demo 
	
Scenario Outline: Contact Sales Page 
	When user Click The Contact Sales Button To Register Their Details 
	And user Enter The Name In The Your Full Name Field 
	And user Enter The Phone Number In The Contact Page Phone Number Field 
	And user Enter The Email "<Email>" In The Contact Page Business Email Field 
	And user Select The Country In The Contact Page Country Field 
	And user Select The Employees In The Number Of Employees Field 
	And user Enter The Job Title In The Job Title Field 
	And user Enter The Message In The Your Message Box Field 
	Then user Click The Submit Button To Register Their Details 
	
	Examples: 
		|Email|
		|abc@gamil.com|
		|def@gamil.com|
		
		
Scenario Outline: FaceBook Account Signup Page 
	When user Nagivate To FaceBook Page 
	And user Click The Create New Account Button 
	And user Enter The First Name In The First Name Field 
	And user Enter The Last Name In The Sur Name Field 
	And user Enter The Mobile Number In The Mobile Number Or Email Address Field 
	And User Enter The Password In The New Password Field 
	And user Select The Date "<Date>" In The Date Of Birth DropDown Box 
	And user Select The Month "<Month>" In The Date Of Birth DropDown Box 
	And user Select The Year In The Date Of Birth DropDown Box 
	And user Click The Male In The Gender Radio Button 
	Then user Click The Sign Up Button And Immediately To Take Whole Page Screenshot 
	
	
	Examples: 
		|Date|Month|
		|10|Sep|
		|12|Aug|
		
