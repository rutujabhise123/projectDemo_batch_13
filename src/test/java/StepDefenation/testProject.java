package StepDefenation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testProject {
	
	WebDriver driver;
	
	@Given("user is on loginpage")
	public void user_is_on_loginpage() throws InterruptedException {
	

		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://example.testproject.io/web/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
	}

	
	@When("user enters username")
	public void user_enters_username() {
	   driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rutuja");
	}

	@When("user enters passwd")
	public void user_enters_passwd() throws InterruptedException {
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");

	        Thread.sleep(5000);

	}


	@When("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		   driver.findElement(By.xpath("//button[@id='login']")).click();

	        Thread.sleep(5000);

	}

	@When("user enters address")
	public void user_enters_address() throws InterruptedException {
		   driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Latur");
	        Thread.sleep(5000);

	}

	@When("user enters email")
	public void user_enters_email() throws InterruptedException {
		   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rutu@gmail.com");
	        Thread.sleep(5000);

	}

	@When("user enters phone")
	public void user_enters_phone() throws InterruptedException {
		   driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7028575751");
	        Thread.sleep(5000);

	}

	@Then("login is successful")
	public void login_is_successful() {

		System.out.println("testing is successfully");
	}

	

}
