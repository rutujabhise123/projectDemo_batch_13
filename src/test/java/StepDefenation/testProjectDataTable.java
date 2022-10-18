package StepDefenation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testProjectDataTable {

	WebDriver driver;
	@Given("user is on login")
	public void user_is_on_login() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://example.testproject.io/web/");
        driver.manage().window().maximize();
        Thread.sleep(10000);
	   
	}

	@When("user enters credentials")
	public void user_enters_credentials(DataTable dataTable) throws InterruptedException {
		List<List<String>> data = dataTable.cells();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(data.get(0).get(1));

		Thread.sleep(5000);

	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@id='login']")).click();;

		Thread.sleep(5000);
	   
	}

	@Then("user provides personal info")
	public void user_provides_personal_info(DataTable dataTable) throws InterruptedException {
		
		List<List<String>> data1 = dataTable.cells();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='address']")).sendKeys(data1.get(0).get(1));
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data1.get(1).get(1));
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(data1.get(2).get(1));
		Thread.sleep(3000);


	}
}
