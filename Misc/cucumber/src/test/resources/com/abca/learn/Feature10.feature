Feature: verify Feature 10
@A @B @C @Smoke @id-121
Scenario: As a user, I should be able to verify feature 1
Given I have the setup to use feature 1
When I try to use feature 1
Then I should see feature 1 details