package com.test.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GSTstepdefination {
		
		WebDriver driver;
		
		  @Given("I am on GST page") public void i_am_on_GST_page() throws
		  InterruptedException {
		  
		  
		  driver=new ChromeDriver(); driver.manage().window().maximize();
		  driver.get("https://uatr1services.gst.gov.in/services/login");
		  Thread.sleep(2000); }
		  
		  @When ("I will enter EmailID Password and Captcha") public void
		  i_will_enter_EmailID_Password_and_Captcha() { WebElement
		  UN=driver.findElement(By.id("username")); WebElement
		  PWD=driver.findElement(By.id("user_pass")); WebElement
		  CAP=driver.findElement(By.id("captcha"));
		  
		  UN.sendKeys("AmitAE_002"); PWD.sendKeys("Hamid@444"); CAP.sendKeys("121212");
		  
		  }
		  
		  @When ("Click on login") public void Click_on_login() { WebElement
		  LOGIN=driver.findElement(By.xpath("\"//button[normalize-space()='Login']"));
		  LOGIN.click(); }
		  
		  @Then ("Verify the title") public void Verify_the_title() { String Title=
		  driver.getTitle(); System.out.println(Title); }
		  
		 String git="Commit";
		 
		
		


}

