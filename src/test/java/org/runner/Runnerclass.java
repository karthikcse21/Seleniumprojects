package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;








@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue= "org.stepdefinition", monochrome=true, dryRun =true, tags ="@logout and @smoke and @invalid and @Homepage and @smoke and @valid")


public class Runnerclass {
	
	
	
	
	
	
	
	

}