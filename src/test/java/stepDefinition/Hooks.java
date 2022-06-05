package stepDefinition;

import base.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks extends Base{

	@Before
	public void StartServer()
	{
		setUp();
	}
	
	@After
	public void StopServer()
	{
		DriverClose();	
	}
}
