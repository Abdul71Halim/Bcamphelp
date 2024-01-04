package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.bdd.learning.DriverLogic.DriverFactory;
import com.bdd.learning.Pages.HomePage;
import com.bdd.learning.Pages.SearchPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	public WebDriver driver;
	public HomePage homepage;
	public SearchPage searchpage;
	
	@Given("User opens the application")
	public void user_opens_the_application() {
		driver = DriverFactory.getDriver();	
		driver.get("https://tutorialsninja.com/demo/");
		
	}

	@When("User adds a valid product {string}")
	public void user_adds_valid_product(String validProductText) {
		homepage = new HomePage(driver);
		homepage.enterProductDetail(validProductText);
	   // driver.findElement(By.name("search")).sendKeys(validProductText); 
	}
	
	
	
	@And("User clicks on the search button")
	public void user_clicks_on_the_search_button() {
		homepage = new HomePage(driver);
		searchpage = homepage.clickOnSearchIcon();
	   // driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click(); //this will go to SearchPage
	}

	@Then("User gets valid product info display in SearchPage")
	public void user_gets_valid_product_info_display_in_search_page() {
		searchpage = new SearchPage(driver);
		searchpage.verifyDisplayStatusOfValidProduct();
		//driver.findElement(By.linkText("HP LP3065")).isDisplayed();
	  
	}
	
	    @Then("Click on addToCart button")
	    	public void  click_on_addtocart_button() {
	    		driver.findElement(By.xpath("//div[@class='button-group']")).click();
	    	}
	    
	    

	  @And("User add product in cart button")
	  public void user_add_product_in_cart_button() {
		  driver.findElement(By.xpath("//button[@id='button-cart']")).click();
	  }
	    
	   @When("User click on shopping cart button")
	   public void user_click_on_shopping_cart_button() {
		   driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")).click();
	   }
	   
	   @And("click on view cart button")
	   public void click_on_view_cart_button() {
		   driver.findElement(By.xpath("//strong[normalize-space()='View Cart']")).click();
	   }
	   @Then("It is open new page")
	   public void it_is_open_new_page() throws Exception {
		   String expectedMessage = "What would you like to do next?";
			Thread.sleep(3000);
			String actualMessage = driver.findElement(By.xpath("//h2[normalize-space()='What would you like to do next?']")).getText();
			Assert.assertTrue(actualMessage.contains(expectedMessage));
			
			driver.findElement(By.linkText("Checkout")).click();//Checkout
	   }


}
