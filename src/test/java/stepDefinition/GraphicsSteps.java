
package stepDefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import base.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GraphicsPage;



public class GraphicsSteps extends Base {
	
	GraphicsPage obj5;
	static Logger logger=LogManager.getLogger(GraphicsSteps.class); 
	
	@Given("^The app is on Running Status$")
	public void the_app_is_on_Running_Status() throws Throwable {
		setUp();
		logger.info("Application is running for Graphics Test");
	}
	
	@And("^I click on Graphics$")
	public void i_click_on_Graphics() throws Throwable {
		obj5=new GraphicsPage(ad);
		obj5.Graphics_S1();
		logger.info("Graphics click");
	}
	
	@When("^I click on AlphaBitMap$")
	public void i_click_on_AlphaBitMap() throws Throwable {
		obj5=new GraphicsPage(ad);
		obj5.Graphics_S2();
		logger.info("AlphaBitMap click");		
	}
	
	@Then("^AlphaBitMap Opens$")
	public void alphabitmap_Opens() throws Throwable {
		obj5=new GraphicsPage(ad);
		Assert.assertEquals(obj5.AlphaBitmap_open.getText(), "Graphics/AlphaBitmap");
		DriverClose();
		logger.info("Back to Home after Content Test");
	}

}

