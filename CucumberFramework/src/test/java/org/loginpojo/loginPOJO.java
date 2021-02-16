package org.loginpojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPOJO extends BaseClass{
	public loginPOJO() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="email")
	private WebElement txtEmail;

	public WebElement getTxtEmail() {
		return txtEmail;
	}
	
	@FindBy(id="pass")
	private WebElement txtPassword;
	
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	
	@FindBy(id="u_0_b")
	private WebElement btnLogIn;
	
	public WebElement getBtnLogIn() {
		return  btnLogIn;
	}
}
