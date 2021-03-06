package stepDefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import base.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ContentPage;



public class ContentSteps extends Base {
	
	ContentPage obj4;
	 static Logger logger=LogManager.getLogger(ContentSteps.class); 
	 
	@Given("^The applications is on Running Status$")
	public void the_applications_is_on_Running_Status() throws Throwable{
		setUp();
		logger.info("Application is running for Content Test");
	}

	@And("^I Click on Content button$")
	public void i_Click_on_Content_button() throws Throwable {
		obj4=new ContentPage(ad);
		obj4.Content_S1();
		logger.info("Content click");
	}

	@And("^I Click on Assets$")
	public void i_Click_on_Assets() throws Throwable {
		obj4=new ContentPage(ad);
		obj4.Content_S2();
		logger.info("Asset click");
	}

	@When("^I click On Read Asset$")
	public void i_click_On_Read_Asset() throws Throwable {
		obj4=new ContentPage(ad);
		obj4.Content_S3();
		logger.info("Read Asset click");
	}

	@Then("^Read Asset Open$")
	public void read_Asset_Open() throws Throwable {
		obj4=new ContentPage(ad);
		Assert.assertEquals(obj4.Read_Asset_Opens.getText(),"Content/Assets/Read Asset" );
		DriverClose();
		logger.info("Back to Home after Content Test");
	}

}

