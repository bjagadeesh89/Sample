package stepDef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginStepDef {

	WebDriver driver;
	
		@Given("User is in Login Page")
		public void user_is_in_login_page() {
			
			WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://the-internet.herokuapp.com/login");
		    
		}


		

//		@When("User enters Login Credentials")
//		public void user_enters_login_credentials() {
//			driver.findElement(By.id("username")).sendKeys("tomsmith");
//	        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//	        driver.findElement(By.className("radius")).click();
//	
//		}
		
		//Using parameterization and scenario outline
		
//			@When("User enters  {string} and {string}")
//			public void user_enters_and(String strUser, String strPwd) {
//				driver.findElement(By.id("username")).sendKeys(strUser);
//		        driver.findElement(By.name("password")).sendKeys(strPwd);
//		        driver.findElement(By.className("radius")).click();
//			}
		
		
		//Data table as list and passing parameter from step
	
//		@When("User enters Login Credentials")
//		public void user_enters_login_credentials(DataTable userCred) {
//			
//			List<List<String>> data = userCred.asLists();
//			//record 1 -username, pwd
//			//get(0) - get(0),get(1)
//			//record2 - username2,pwd2
//			//get(1) - get(0),get(1)
//		
//			driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
//	        driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//	        driver.findElement(By.className("radius")).click();
//
//		
//		}
		
		
		//Data table as map and passing parameter from step
		
		@When("User enters Login Credentials")
		public void user_enters_login_credentials(DataTable userCred) {
			
			List<Map<String, String>> data = userCred.asMaps();
			//record 1 -username, pwd
			//get(0) - get(0),get(1)
			//record2 - username2,pwd2
			//get(1) - get(0),get(1)
		
			driver.findElement(By.id("username")).sendKeys(data.get(0).get("username"));
	        driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
	        driver.findElement(By.className("radius")).click();
		System.out.println();
		}
		
		
		
		@Then("User is on Home Page")
		public void user_is_on_home_page() {
			
		        boolean isValidUser = driver.findElement(By.cssSelector("div.success")).isDisplayed();
		        Assert.assertTrue(isValidUser);
		    
		}



	
}
