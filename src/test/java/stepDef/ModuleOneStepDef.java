package stepDef;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ModuleOneStepDef {
	
	WebDriver driver;
	
//	@Before
//	public void startdDB()
//	{
//		System.out.println("StartDB");
//	}
	
//	@Before("@RegressionTest")
//	public void initChrome()
//	{
//		System.out.println("initChrome");
//	}
	
//	@Before(order=2)
//	public void initEdge()
//	{
//		System.out.println("initEdge");
//	}
//	
	
	
	@Before(order=2, value = "@RegressionTest")
	public void dbSetupReg()
	{
		System.out.println("dbSetupReg");
	}
	
	@Before(order=1, value = "@RegressionTest")
	public void Regbrowser()
	{
		System.out.println("RegressionBrowser");
	}
	
	@Before(order=1, value = "@SmokeTest")
	public void dbSetupSmoke()
	{
		System.out.println("dbSetupSmoke");
	}
	
	@Before(order=2, value = "@SmokeTest")
	public void Smokebrowser()
	{
		System.out.println("SmokeBrowser");
	}
	
		@Given("User is loggedIn")
		public void user_is_logged_in() {
			
			System.out.println("Logged in");
		 
		}
		
		


	

		@When("User create a new contact")
		public void user_create_a_new_contact() {
			System.out.println("Newcontact create");
		   
		}

		@When("User view contact details")
			public void user_view_contact_details() {
				System.out.println("View Contact");
			   
		}



		@When("User update a contact details")
				public void user_update_a_contact_details() {
					System.out.println("update contact");
				   
		}


				

		@When("User create a new Deal")
				public void user_create_a_new_deal() {
					System.out.println("Create new deal");
					    
		}



		@When("User view Deal details")
				public void user_view_deal_details() {
							
				System.out.println("view deal");
						
			}

@When("User update a Deal details")
public void user_update_a_deal_details() {
System.out.println("Update deal");
							   
}


						
@Then("User Logout from App")
	public void user_logout_from_app() {
	System.out.println("Logout");
								 
}

//@AfterStep
//public void endDB()
//{
//	System.out.println("endDB");
//}
}
