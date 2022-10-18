package StepDefenation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
WebDriver driver;
	
	@Given("user is on hrm site")
	public void user_is_on_hrm_site() throws InterruptedException {
WebDriverManager.chromedriver().setup();	    
		 driver = new ChromeDriver(); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
	}

	@Given("user enters loginID")
	public void user_enters_login_id() throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
	
		Thread.sleep(2000);
		
	}

	@Given("user enters password")
	public void user_enters_password() throws InterruptedException {
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(2000);
	 
	}

	@Given("user clicks on submit")
	public void user_clicks_on_submit() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']/button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(5000);
	}
	
	@Given("verify the title")
	public void verify_the_title() throws InterruptedException {
		
		String title = driver.getTitle();
		System.out.println("The title of page is:- "+title);
	}
	
}



