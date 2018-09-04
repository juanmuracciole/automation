Feature: AutomationPractice

Scenario: Search blouse 

Given User is on webpage
When User select "Woman" tab
And enters a "blouse" in search box
Then the related products appears

Scenario: Capture product price
Given results are available
When the product "blouse" price appears
Then capture the price

Scenario: Add to cart
Given results are displayed
When the results are there
Then add the products to cart
And proceed to check out

Scenario: Check price and check out

When Total prices are displayed
Then compare with previously prices
And capture shipping cost
And proceed to check out

