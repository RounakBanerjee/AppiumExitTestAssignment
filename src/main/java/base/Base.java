package base;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Base {
	
	public static AppiumDriver<MobileElement> ad=null;
	public static AppiumDriverLocalService service;

	public void setUp()
	{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("platformVersion", "7.1.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.example.android.apis");
		capabilities.setCapability("appActivity" ,"com.example.android.apis.ApiDemos");
		capabilities.setCapability("deviceName", "Android SDK built for x86");

		try {
			ad = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
			ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


	public void DriverClose()
	{
		ad.quit();
	}

}
