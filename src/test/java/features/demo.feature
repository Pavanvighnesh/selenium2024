Feature: Searching   a product
Scenario: user should be able to search products under mobiles category

Given I visit the website using given url
When I select mobiles option from search dropdown
And I click on mobiles search option
Then I should see page having heading regarding amazon mobiles

