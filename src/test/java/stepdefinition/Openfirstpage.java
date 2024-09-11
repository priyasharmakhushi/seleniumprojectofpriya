package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Openfirstpage {
	WebDriver driver;
	
	@Given("^open web browser$")
	public void open_web_browser() {
		driver=new ChromeDriver();
	}

	@When("^enter url$")
	public void enter_url() throws InterruptedException {
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}

	@Then("^to validate the outcomes$")
	public void to_validate_the_outcomes() {
	    boolean b=driver.getPageSource().contains("Google offered in:  ");
	    if(b==true)
	    {
	    	System.out.println("test case pass");
	    }
	    else
	    {
	    	System.out.println("test case fail");
	    }
	}
}
