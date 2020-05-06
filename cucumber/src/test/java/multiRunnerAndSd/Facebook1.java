package multiRunnerAndSd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Facebook1 {

	WebDriver driver;

	public Facebook1(Hooks drive)
	{
		driver = drive.beforeStup();
	}

	@Given("enters the {string} on login page.")
	public void enters_the_on_login_page(String string) {

		driver.findElement(By.name("firstname")).sendKeys(string);

	}

	@When("enters {string} on login page.")
	public void enters_on_login_page(String string) {

		driver.findElement(By.name("pass")).sendKeys(string);
	}

	@When("clicks on the login button.")
	public void clicks_on_the_login_button() {

		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
