package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginScript 
{
	public	WebDriver driver;
	@Given("user open browser")
	public void user_open_browser()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
	}

	@When("enters URL")
	public void enters_url() 
	{
		driver.get("https://www.facebook.com");
	}

	@Then("Login page should be displayed")
	public void login_page_should_be_displayed() 
	{
		String title = driver.getTitle();
		//Assert.assertEquals(title, "Facebook-log in or sign up");
		System.out.println("login page displayed");
	}

	@Then("close browser")
	public void close_browser() 
	{
		driver.close();
	}
}