package Step_Definaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class Step_Def2 {
	
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    driver = new FirefoxDriver();
	    driver.get("https://www.saucedemo.com/");
	}

	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and(String u_ID, String pawd) {
	driver.findElement(By.id("user-name")).sendKeys(u_ID);
	driver.findElement(By.id("password")).sendKeys(pawd);
	}

	@And("Click on login Button")
	public void click_on_login_button() {
		driver.findElement(By.id("login-button")).click();

	}

	@Then("User is navigated to Home Page")
	public void user_is_navigated_to_home_page() {
	
	}

	@And("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}