Feature: verify Feature 2
@B @Smoke @id-121
Scenario: As a user, I should be able to verify feature 2
Given I have the setup to use feature 2
When I try to use feature 2
Then I should see feature 2 details