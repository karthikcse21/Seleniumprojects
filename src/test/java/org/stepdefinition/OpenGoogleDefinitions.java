package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;



public class OpenGoogleDefinitions {
	
	public WebDriver driver = new ChromeDriver();
	
	@Given("user is entering instagram URL")
	public void user_is_entering_instagram_url() throws InterruptedException {
		
		
		
	    driver.get("https://www.github.com/");
	    Thread.sleep(10000);
	}

	@When("user is typing correct username and password")
	public void user_is_typing_correct_username_and_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		
		driver.findElement(By.xpath("//a[@class='HeaderMenu-link HeaderMenu-link--sign-in flex-shrink-0 no-underline d-block d-lg-inline-block border border-lg-0 rounded rounded-lg-0 p-2 p-lg-0']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("karthikcse21@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jamhub@1234");
		Thread.sleep(2000);
		
	}

	@Then("the user should able to login successfully")
	public void the_user_should_able_to_login_successfully() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(5000);
		//driver.close();
	}
	@Given("user click logout buttton")
	public void user_click_logout_buttton() {
	    // Write code here that turns the phrase above into concrete actions
		//*[@class='btn-primary btn btn-block']
		driver.findElement(By.xpath("//*[@class='btn-primary btn btn-block']")).click();
		System.out.println("Test1");
		
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be able to logout successfully")
	public void user_should_be_able_to_logout_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
		
		
	}


	
	
	
	
	
	
	
	
	
	


