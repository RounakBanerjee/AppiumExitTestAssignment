
package stepDefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import base.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AccessiblityPage;


public class AccessiblitySteps extends Base {
	
	static Logger logger=LogManager.getLogger(AccessiblitySteps.class); 
	AccessiblityPage obj1;
	
	@Given("^The application is on Running Status$")
	public void the_application_is_on_Running_Status() throws Throwable {
		setUp();
		logger.info("Application running");
	}

	@And("^I click on Accessiblity$")
	public void i_click_on_Access() throws Throwable {
		obj1=new AccessiblityPage(ad);
		obj1.Accessiblity_S1();
		logger.info("Accessiblity click ");
	}

	@When("^I click on Accessiblity Node Provider$")
	public void i_click_on_Accessiblity_Node_Provider() throws Throwable {
		obj1=new AccessiblityPage(ad);
		obj1.Accessiblity_S2();
		logger.info("Accessiblity Node Provider click ");
	}

	@Then("^Accessiblity Node Provider Opens$")
	public void accessiblity_Node_Provider_Opens() throws Throwable {
		obj1=new AccessiblityPage(ad);
		Assert.assertEquals(obj1.ColouredSquare.getText(), "Accessibility/Accessibility Node Provider");
		DriverClose();
		logger.info("Back to Home after Accessiblity ");
	}

}
