package pages;

import org.openqa.selenium.support.PageFactory;

import base.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AccessiblityPage extends Base {
	
	AppiumDriver<MobileElement> drivers;
	
	public AccessiblityPage(AppiumDriver<MobileElement> driver)
	{
		drivers=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Accessibility\"]")
	public MobileElement Accessiblity1;
	
	@AndroidFindBy(xpath=" //android.widget.TextView[@content-desc=\"Accessibility Node Provider\"]")
	public MobileElement Accessiblity_Node_provider;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public MobileElement ColouredSquare;
	
	public void Accessiblity_S1()
	{
		Accessiblity1.click();
	}
	
	public void Accessiblity_S2()
	{
		Accessiblity_Node_provider.click();
	}

}






