package stepDefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import base.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AppPage;



public class AppSteps extends Base {
	
	 AppPage obj3;
	 static Logger logger=LogManager.getLogger(AppSteps.class);
	 
	@Given("^The Application is in Running Status$")
	public void The_Application_is_in_Running_Status() throws Throwable {
		setUp();
		logger.info("Application is running for App Test");
	}
	
	@And("^I Click on App button$")
	public void i_Click_on_App_button() throws Throwable {
	obj3=new AppPage(ad);
	obj3.App_S1();
	logger.info("App click");
	}

	@And("^I Click on Action Bar$")
	public void i_Click_on_Action_Bar() throws Throwable {
		obj3=new AppPage(ad);
		obj3.App_S2();
		logger.info("Action Bar Click");
	}

	@When("^I click On Action Bar Mechanics$")
	public void i_click_On_Action_Bar_Mechanics() throws Throwable {
		obj3=new AppPage(ad);
		obj3.App_S3();
		logger.info("Action Bar Mechnics Click");
	}

	@Then("^Action Bar Mechanics Open$")
	public void action_Bar_Mechanics_Open() throws Throwable {
		obj3=new AppPage(ad);
		Assert.assertEquals(obj3.Action_Bar_Mechanics_opens.getText(), "App/Action Bar/Action Bar Mechanics");

		DriverClose();
		logger.info("Back to Home after App Test");
	}
}

