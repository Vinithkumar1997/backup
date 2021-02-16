package org.stepdefinition;

import org.baseclass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart extends BaseClass{
	
	@Given("user should launch the browser and hit the sears url")
	public void user_should_launch_the_browser_and_hit_the_sears_url() {
	    urlLaunch("https://www.sears.com/");
	}

	@When("user has to move the cursor to clothing menu")
	public void user_has_to_move_the_cursor_to_clothing_menu() {
	    
	}

	@When("user has to click the Coats & Jackets below the Mens clothing")
	public void user_has_to_click_the_Coats_Jackets_below_the_Mens_clothing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user should move to the Mens coats & Jackets product page")
	public void user_should_move_to_the_Mens_coats_Jackets_product_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user has to scroll down and click any product title")
	public void user_has_to_scroll_down_and_click_any_product_title() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user should move to the Add to cart page")
	public void user_should_move_to_the_Add_to_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user should select size and color")
	public void user_should_select_size_and_color() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user should click the Add to Cart button")
	public void user_should_click_the_Add_to_Cart_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user should click the Go to Cart button")
	public void user_should_click_the_Go_to_Cart_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user should view the Your Cart page")
	public void user_should_view_the_Your_Cart_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
