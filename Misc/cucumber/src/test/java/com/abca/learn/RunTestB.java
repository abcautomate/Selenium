package com.abca.learn;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
					tags = {"@B"},	
					format = "pretty",
					glue	="com/abca/learn",
					features= "src/test/resources/com/abca/learn"		

				)

@RunWith(CustomCucumber.class)
public class RunTestB {
}