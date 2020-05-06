package dataTableRunnerAndSd;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DataTableClass {
	
	WebDriver driver;

	@Given("Browser launched and url entered is {string}")
	public void browser_launched_and_url_entered_is(String url) {
	
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	
	@Given("user has entered {string} in first name")
	public void user_has_entered_in_first_name(String first) {
		
		driver.findElement(By.name("firstname")).sendKeys(first);

	}

	@Given("user has entered {string} in last name")
	public void user_has_entered_in_last_name(String last) {
		driver.findElement(By.name("lastname")).sendKeys(last);
	 
	}

	@Given("user has entered {string} in mobile field")
	public void user_has_entered_in_mobile_field(String mob) {
		
		driver.findElement(By.name("reg_email__")).sendKeys(mob);

	}
	
	@Then("browser is closed")
	public void browser_is_closed() throws InterruptedException {
	
		Thread.sleep(10000);
		driver.quit();
	}



}
