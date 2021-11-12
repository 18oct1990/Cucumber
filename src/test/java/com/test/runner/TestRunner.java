package com.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)

@CucumberOptions(
		
		features={"C:\\Users\\uat02\\eclipse-workspace\\Login_Cucumber\\src\\test\\java\\com\\test\\feature\\Login.feature"},
		glue= {"Steps"}
		
		)

public class TestRunner {
	
	


}
