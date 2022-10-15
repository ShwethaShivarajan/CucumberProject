package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	WebDriver driver = Hooks.driver;

	@Given("I have launched the application")
	public void i_have_launched_the_application() {
		// Write code here that turns the phrase above into concrete actions

		

		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

	}

	@Given("I click on Login link")
	public void i_click_on_Login_link() {
		// Write code here that turns the phrase above into concrete actions
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
	}

	@When("I enter the correct username and password")
	public void i_enter_the_correct_username_and_password() {
		// Write code here that turns the phrase above into concrete actions

		// Step2: Enter Username
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc3444@gmail.com");

		// Step3: Enter Password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Test@123");
	}

	@When("I click on Login button")
	public void i_click_on_Login_button() {
		// Write code here that turns the phrase above into concrete actions
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I enter the incorrect username and password")
	public void i_enter_the_incorrect_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		// Step2: Enter Username
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz.com");

		// Step3: Enter Password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Test@1234");

	}

	@When("I enter the username as {string} and Password as {string}")
	public void i_enter_the_username_as_and_Password_as(String usernameval, String passwordval) {
		// Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(usernameval);

		// Step3: Enter Password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(passwordval);
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String ExpError) {
		// Write code here that turns the phrase above into concrete actions
		WebElement Error = driver.findElement(By.id("msg_box"));

		String ActError = Error.getText();
		Assert.assertEquals(ExpError, ActError);
	}

}
