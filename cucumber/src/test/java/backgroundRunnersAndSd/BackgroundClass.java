package backgroundRunnersAndSd;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class BackgroundClass {
	
	WebDriver driver;

	@Given("Browser Is launched and url entered is {string}")
	public void browser_Is_launched_and_url_entered_is(String url) {
	
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	@Given("user enters the username {string} on login page.")
	public void user_enters_the_username_on_login_page(String string) {
	driver.findElement(By.name("firstname")).sendKeys(string);
	
	}

	@When("user enters the password {string} on login page.")
	public void user_enters_the_password_on_login_page(String string) {
		driver.findElement(By.name("pass")).sendKeys(string);
	}

	@When("user clicks on the login button.")
	public void user_clicks_on_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Given("user enters the last name {string} on login page.")
	public void user_enters_the_last_name_on_login_page(String string) {
	  
		
		driver.findElement(By.name("lastname")).sendKeys(string);
	 
		System.out.println("Last name entered.");
	}

	@Given("user clicks on the sign up button.")
	public void user_clicks_on_the_sign_up_button() {
	    
		
		System.out.println("Signed Up");
	}
	
	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
	   
		Thread.sleep(10000);
		driver.quit();
	}



}
