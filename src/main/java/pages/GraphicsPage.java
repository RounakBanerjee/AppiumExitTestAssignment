package pages;

import org.openqa.selenium.support.PageFactory;

import base.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GraphicsPage extends Base {
	
	AppiumDriver<MobileElement> drivers;
	
	public GraphicsPage(AppiumDriver<MobileElement> driver)
	{
		drivers=driver;
		PageFactory.initElements(new AppiumFieldDecorator(ad), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Graphics\"]")
	public MobileElement Graphics1;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"AlphaBitmap\"]")
	public MobileElement AlphaBitmap;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public MobileElement AlphaBitmap_open;
	
	public void Graphics_S1()
	{
		Graphics1.click();
	}
	
	public void Graphics_S2()
	{
		AlphaBitmap.click();
	}

}
