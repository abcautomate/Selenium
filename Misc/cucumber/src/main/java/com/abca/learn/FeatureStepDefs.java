package com.abca.learn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Hello world!
 *
 */
public class FeatureStepDefs {
	
	@Given("^I have the setup to use feature (\\d+)$")
	public void i_have_the_setup_to_use_feature(int arg1){
	    System.out.println("Given I have the setup to use feature "+arg1);
	}

	@When("^I try to use feature (\\d+)$")
	public void i_try_to_use_feature(int arg1) throws Throwable {
	    System.out.println("When I try to use Feature "+arg1);
	}

	@Then("^I should see feature (\\d+) details$")
	public void i_should_see_feature_details(int arg1) throws Throwable {
	    System.out.println("Then I should see feature "+arg1+" details");

	}
}
