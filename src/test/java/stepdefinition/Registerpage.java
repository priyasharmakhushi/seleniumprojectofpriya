package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registerpage {
	WebDriver driver;
	
	@Given("^open chrome browser$")
	public void open_chrome_browser() {
		driver= new ChromeDriver();
	}	
		
	
	
	@When("^Enter the site  url$")
	public void enter_the_site_url() throws InterruptedException {
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}


	@Then("^Verify that home page is visible successfully$")
	public void verify_that_home_page_is_visible_successfully() {
		boolean b=driver.getPageSource().contains("Automation exercise");
		if(b==true)
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		
	}
	

	@Then("Click on {string} button")
	public void click_on_button(String string) {
		driver.findElement(By.xpath("//a[@href='/login']")).click();
	   
	}

	@Then("Verify {string} is visible")
	public void verify_is_visible(String string) {
		boolean b=driver.getPageSource().contains("New User Signup!");
		if(b==true)
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
	}
	

	@When("^Enter name and email address$")
	public void enter_name_and_email_address() {
		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("akshara");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("akshara2310@gmail.com");
	    
	}

	@Then("Click {string} button")
	public void click_button(String string) {
		driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();
	}


}

	