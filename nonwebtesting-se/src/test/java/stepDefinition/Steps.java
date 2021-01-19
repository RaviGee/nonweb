package stepDefinition;

import org.junit.Assert;

import cucumber.api.java.en.*;

public class Steps {
	
	@Given("^I have two numbers to add (\\d+) and (\\d+) and show results$")
	public void i_have_two_numbers_to_add_and_and_show_results(int numberOne, int numberTwo) throws Throwable {
		
		int	total = numberOne + numberTwo;
//		int total = 10;
		
		System.out.println( "Sum of two numbers " + numberOne + " and " + numberTwo + " is :" + total);
//		Assert.assertTrue(false);
	     
	}

	@Then("^I want to multiple two numbers (\\d+) and (\\d+) and show results$")
	public void i_want_to_multiple_two_numbers_and_and_show_results(int numberOne, int numberTwo) throws Throwable {

		int total = numberOne * numberTwo;
//		int total = 100;
		System.out.println( "Multiplication1 of two numbers " + numberOne + " and " + numberTwo + " is :" + total);
	     
	}

	@Then("^I want to perform division of (\\d+) and (\\d+) and show output$")
	public void i_want_to_perform_division_of_and_and_show_output(int numberOne, int numberTwo) throws Throwable {
		
		float total = numberOne / numberTwo;
//		int total = 1000;
		System.out.println( "Division1 of two numbers " + numberOne + " and " + numberTwo + " is :" + total);
	     
	}
	
	 


}
