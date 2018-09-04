package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	WebDriver driver;
	@Given("^User is on webpage$")
	public void user_is_on_webpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String exePath = "C:\\Users\\l0611573\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	    throw new PendingException();
	}

	@When("^User select \"([^\"]*)\" tab$")
	public void user_select_tab() throws Throwable {
		
		System.out.println("Seleccion tab woman");
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")).click();
	    throw new PendingException();
	}

/*	@When("^enters a \"([^\"]*)\" in search box$")
	public void enters_a_in_search_box() throws Throwable {

		
		// Write code here that turns the phrase above into concrete actions
		
		//driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("Women");
	    throw new PendingException();
	}*/

	@Then("^the related products appears$")
	public void the_related_products_appears() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^results are available$")
	public void results_are_available() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^the product \"([^\"]*)\" price appears$")
	public void the_product_price_appears(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^capture the price$")
	public void capture_the_price() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^results are displayed$")
	public void results_are_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^the results are there$")
	public void the_results_are_there() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^add the products to cart$")
	public void add_the_products_to_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^proceed to check out$")
	public void proceed_to_check_out() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Total prices are displayed$")
	public void total_prices_are_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^compare with previously prices$")
	public void compare_with_previously_prices() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^capture shipping cost$")
	public void capture_shipping_cost() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
}
