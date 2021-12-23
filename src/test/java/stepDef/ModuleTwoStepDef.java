package stepDef;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;

public class ModuleTwoStepDef {

	WebDriver driver;
	
		@When("User create a new tasks")
		public void user_create_a_new_tasks() {
		    System.out.println("Create task- Module 2");
		}



	
}
