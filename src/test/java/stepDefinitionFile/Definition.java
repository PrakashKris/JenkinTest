package stepDefinitionFile;

import cucumber.api.java.en.Given;

public class Definition {
	
	@Given("^I want to write a step with preconditions$")
	public void I_want_to_write_a_step_with_preconditions() throws Throwable {
		System.out.println("first scenario tag1");
	}

	@Given("^I want to write a step$")
	public void I_want_to_write_a_step() throws Throwable {
		System.out.println("second scenario tag2");
	}
	
@Given("^I want precondition$")
public void I_want_precondition() throws Throwable {
	System.out.println("third scenario tag1 and tag2");    
}




}
