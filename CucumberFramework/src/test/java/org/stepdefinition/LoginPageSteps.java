package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.loginpojo.loginPOJO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.*;

public class LoginPageSteps extends BaseClass{
	public static WebDriver d;

	@Given("user has to launch the chrome and hit the Fb url")
	public void user_has_to_launch_the_chrome_and_hit_the_Fb_url() {
		urlLaunch("http://www.facebook.com/");
	}
	
	@When("user has to enter the {string} and {string}")
	public void user_has_to_enter_the_and(String username, String password) {
	    loginPOJO l = new loginPOJO();
	    enterTheValues(l.getTxtEmail(), username);
	    enterTheValues(l.getTxtPassword(), password);
	}

	@When("user has to enter the username and password")
	public void user_has_to_enter_the_username_and_password(io.cucumber.datatable.DataTable dataT) {
		List<String> li = dataT.asList();
		d.findElement(By.id("email")).sendKeys(li.get(0));
		d.findElement(By.id("pass")).sendKeys(li.get(1));
	}


	@When("user has to enter username and password")
	public void user_has_to_enter_username_and_password(io.cucumber.datatable.DataTable da) {
		List<List<String>> li = da.asLists();
		d.findElement(By.id("email")).sendKeys(li.get(0).get(0));
		d.findElement(By.id("pass")).sendKeys(li.get(0).get(1));
	}

	@When("user has to enter username and the password")
	public void user_has_to_enter_username_and_the_password(io.cucumber.datatable.DataTable dat) {
		Map<String, String> mp = dat.asMap(String.class, String.class);
		d.findElement(By.id("email")).sendKeys(mp.get("username"));
		d.findElement(By.id("pass")).sendKeys(mp.get("password"));
	}

	@When("users have to enter username and the password")
	public void users_have_to_enter_username_and_the_password(io.cucumber.datatable.DataTable data) {
		List<Map<String, String>> mp = data.asMaps();
		d.findElement(By.id("email")).sendKeys(mp.get(2).get("username"));
		d.findElement(By.id("pass")).sendKeys(mp.get(2).get("password"));
	}

	@When("click the login button")
	public void click_the_login_button() {
		loginPOJO l = new loginPOJO();
		buttonClick(l.getBtnLogIn());
	}
	

    @Then("user unable to enter the homepage")
	public void user_unable_to_enter_the_homepage() {
	    System.out.println("user unable to enter the homepage!");
	}

	@When("user has to click the Forgot Password Link")
	public void user_has_to_click_the_Forgot_Password_Link() {
		d.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

	@When("user has to enter the {string}")
	public void user_has_to_enter_the(String mobNo) {
		d.findElement(By.id("identify_email")).sendKeys(mobNo);
	}

	@When("click search")
	public void click_search() {
		d.findElement(By.id("did_submit")).click();
	}

	@Then("user has to navigate to the Identify account dialogue box")
	public void user_has_to_navigate_to_the_Identify_account_dialogue_box() {
		WebElement resetText = d.findElement(By.xpath("(//h2[text()='Reset Your Password'])[2]"));
		boolean isD = resetText.isDisplayed();
		Assert.assertTrue("Element is Displayed!", isD);
	}
}
