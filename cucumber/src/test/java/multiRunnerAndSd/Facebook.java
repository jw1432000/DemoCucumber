package multiRunnerAndSd;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;

public class Facebook {
	WebDriver driver;

	public Facebook(Hooks drive)
	{
		driver = drive.beforeStup();
	}

	@Given("Browser is launched")
	public void browser_is_launched() {

		System.out.println("Browser Launched.");

	}

	@Given("user enters the {string} on login page.")
	public void user_enters_the_on_login_page(String username) {

		driver.findElement(By.name("firstname")).sendKeys(username);
	}

	@When("user enters {string} on login page.")
	public void user_enters_on_login_page(String password) {

		driver.findElement(By.name("pass")).sendKeys(password);
	}

	@When("user clicks on the login button.")
	public void user_clicks_on_the_login_button() {

		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {

		System.out.println("Facebook Instance Closed.");
	}

}
