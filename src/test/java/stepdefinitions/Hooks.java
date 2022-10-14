package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public static WebDriver driver; // else create object of hooks class and then use that object to access the driver. static helps in directly using the webdriver
	@Before
	public void Setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@After
	public void Teardown() {

		driver.close();
	}

}
