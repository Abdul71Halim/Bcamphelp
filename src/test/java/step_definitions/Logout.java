package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
	public WebDriver driver;
	@Given("I open a Chrome Browser")
	public void i_open_a_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@When("I enter the URL for tutorialsninja")
	public void i_enter_the_URL_for_tutorialsninja() {
		driver.get("https://tutorialsninja.com/demo/");
	}
	@Then("I click on my account button")
	public void i_click_on_my_account_button() {
		driver.findElement(By.linkText("My Account")).click();
	}
	@And("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.linkText("Login")).click();
		
	}
	@And("login page i enter username")
	public void login_page_i_enter_username() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
	}
	@And("I enter user password")
	public void i_enter_user_password() {
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
	}
	@Then("I click on login option")
	public void i_click_on_login_option() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	@Given("I am inside the Inbox page")
	public void i_am_inside_the_inbox_page() {
		WebElement editYourAccountInfoLink = driver.findElement(By.linkText("Edit your account information"));
		Assert.assertTrue(editYourAccountInfoLink.isDisplayed());
	}
	@And("I validate the presence of the Logout link")
	public void i_validate_presence_logout_link() {
		WebElement editYourAccountInfoLink = driver.findElement(By.linkText("Edit your account information"));
		WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		Assert.assertTrue(editYourAccountInfoLink.isDisplayed() && logoutLink.isDisplayed());
	}
	@When("I click on the Logout button")
	public void click_on_logout_button() {
		driver.findElement(By.linkText("Logout")).click();
		
	}
	@Then("I logged out of successfuly")
	public void i_logged_out_of_successfuly() {
		String expectedMessage = "You have been logged off your account. It is now safe to leave the computer.";
		String actualMessage = driver.findElement(By.xpath("//p[contains(text(),' It is now safe to leave the computer.')]")).getText();
		Assert.assertTrue(actualMessage.contains(expectedMessage));
	}
}
