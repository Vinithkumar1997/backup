package org.stepdefinition;

import org.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	
	@Before
	public void beforeExecution() {
		launchBrowser();
		browserMax();
	}
	
	@After
	public void afterExecution() {
		System.out.println("close the browser");
	}
}
