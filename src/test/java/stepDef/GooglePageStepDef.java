package stepDef;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class GooglePageStepDef {
	
	WebDriver driver;
	
		@Given("User is on Google Page")
		public void user_is_on_google_page() {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			
		}

		@When("User search Java Tutorial")
		public void user_search_java_tutorial() {
			WebElement searchbox= driver.findElement(By.name("q"));
			searchbox.sendKeys("Java Tutorial");
			searchbox.submit();
		}
		@Then("Display Java Result page")
		public void display_java_result_page() {
		   Assert.assertEquals("Java Tutorial - Google Search", driver.getTitle());
		}
		
		@When("User search Selenium Tutorial")
		public void user_search_selenium_tutorial() {
			WebElement searchbox= driver.findElement(By.name("q"));
			searchbox.sendKeys("Selenium Tutorial");
			searchbox.submit();
		}
		@Then("Display Selenium Result page")
		public void display_selenium_result_page() {
		   Assert.assertEquals("Selenium Tutorial - Google Searc", driver.getTitle());
		}
		

		
		@Then("Close the Browser")
			public void close_the_browser() {
			   driver.close();
			}

@After

public void attachImage(Scenario scenario) throws IOException
{

	if(scenario.isFailed())
	{
		
		TakesScreenshot src = (TakesScreenshot)driver;
		File srcFile = src.getScreenshotAs(OutputType.FILE);
		byte[] byteImg = FileUtils.readFileToByteArray(srcFile);
		scenario.attach(byteImg, "image/png", "Image1");
	}
}


}
