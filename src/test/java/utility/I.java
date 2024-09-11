package utility;

import org.openqa.selenium.By;

public interface I {
	String websiteurl="https://www.automationexercise.com";
	
	By xpath_signup =By.xpath("//a[@href='/login']");
	
	By xpath_signup_email= By.xpath("//input[@data-qa='signup-email']");
	
	By xpath_signup_click=By.xpath("//button[contains(text(),'Signup')]");
}
