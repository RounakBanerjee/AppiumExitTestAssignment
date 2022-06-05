package pages;

import org.openqa.selenium.support.PageFactory;

import base.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AppPage extends Base {
	
	AppiumDriver<MobileElement> drivers;
	
	public AppPage(AppiumDriver<MobileElement> driver)
	{
		drivers=driver;
		PageFactory.initElements(new AppiumFieldDecorator(ad), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"App\"]")
	public MobileElement App1;

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Action Bar\"]")
	public MobileElement Action_Bar;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Action Bar Mechanics\"]")
	public MobileElement Action_Bar_Mechanics;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public MobileElement Action_Bar_Mechanics_opens;
	
	public void App_S1()
	{
		App1.click();	
	}
	
	public void App_S2()
	{
		Action_Bar.click();	
	}
	public void App_S3()
	{
		Action_Bar_Mechanics.click();	
	}

}
