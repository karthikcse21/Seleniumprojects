package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.javaclasses.Java_String;;

public class Basic_selenium_functions {
	
	public WebDriver driver = new ChromeDriver();
	
	@Given("user is entering URL")
	public void user_is_entering_url() {
	    // URL check
		driver.get("https://www.amazon.in/");
		
		Java_String obj = new Java_String();
		
		obj.strmtd();
	    
	}

	@SuppressWarnings("deprecation")
	@When("the user click with wait")
	public void the_user_click_with_wait() {
	    // Implicit Wait check
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		System.out.println("Test pass");
		//Excplicit Wait check
		
		
		//Fluent Wait Check
		
		//driver close
		
		driver.close();
		
	}


}
