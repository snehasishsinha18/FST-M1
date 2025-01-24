
@activity3
Feature: Testing with Tags
	@SimpleAlert
  Scenario: Testing with Simple Alert
		Given: User is on the page
		When: User clicks the Simple Alert button
		Then: Alert opens
		And: Read the text from it and print it
		And: Close the alert
		And: Read the result text

	@ConfirmAlert
  Scenario: Testing with Confirm Alert
		Given: User is on the page
		When: User clicks the Confirm Alert button
		Then: Alert opens
		And: Read the text from it and print it
		And: Close the alert with Cancel
		And: Read the result text
    
	@PromtAlert
  Scenario: Testing with Prompt Alert
		Given: User is on the page
		When: User clicks the Promt Alert button
		Then: Alert opens
		And: Read the text from it and print it
		And: Write a custom message in it
		And: Close the alert
		And: Read the result text