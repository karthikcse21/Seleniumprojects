package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;








@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue= "org.stepdefinition", monochrome=true, dryRun =false, tags =" @smoke")


public class Runnerclass {
	
	
	
	
	
	
	
	

}