package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.I;

public class Loginpage implements I {
	WebDriver driver;
	ExtentReports reports;
	ExtentTest test;
	
	@Given("^Open web browser$")
	public void open_web_browser() {
		reports= new ExtentReports("C:\\Users\\04srs\\eclipse-workspace\\cucumberclass\\getreport\\"+"autoreport.html");
		test=reports.startTest("Demo");
		driver= new ChromeDriver();
	}

	@When("^Enter url of website$")
	public void enter_url_of_website() throws InterruptedException {
		driver.get(websiteurl);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	   
	}

	@Then("Click on signup link$")
	public void click_on_signup_link() {
		driver.findElement(xpath_signup).click();
	    
	}

	@Then("^verify on signup page$")
	public void verify_on_signup_page() {
	   
		boolean b=driver.getPageSource().contains("New User Signup!");
		if(b==true)
		{
			test.log(LogStatus.PASS, "test case pass");
			//System.out.println("test case pass");
			
		}
		else
		{
			test.log(LogStatus.FAIL, "test case fail");
			//System.out.println("test case fail");
		}
		reports.endTest(test);
		reports.flush();
	}

	@Then("^Enter (.*) and (.*)$")    //(.*) for data retrieve need a variable
	public void enter_username_and_emailid(String username,String emailid ) {
		System.out.println("username = " + username);
		System.out.println("emailid = " + emailid);
		driver.findElement(By.name("name")).sendKeys(username);
		driver.findElement(xpath_signup_email).sendKeys(emailid);
		driver.findElement(xpath_signup_click).click();
		driver.close();
	}

   
}
