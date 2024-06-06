package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demo {
	WebDriver driver =new ChromeDriver();
	
	

	@Given("^I visit the website using given url$")
	public void I_visit_the_website_using_given_url() {
		
		
		
		driver.get("https://www.amazon.in/");
		
	}
	@When("^I select mobiles option from search dropdown$")
	public void I_select_mobiles_option_from_search_dropdown() {
		WebElement searchbox = driver.findElement(By.id("searchDropdownBox"));
		searchbox.click();
		
		
				
		
	}
	@And("^I click on mobiles search option$")
	public void I_click_on_mobiles_search_option() {
		System.out.println("this is third feature file");
		
		
	}
	@Then("^I should see page having heading regarding amazon mobiles$")
	public void I_should_see_page_having_heading_regarding_amazon_mobiles() {
		System.out.println("this is fourth feature file");
		
		
	}
	

}
