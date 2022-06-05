#API Demos Test Automation Suite:-

The following project demonstrate a list of test cases for API DEMOS application designed with the help automation tools.

Languages Used - Java, Gherkin

Automation Tools - Appium, TestNg

Softwares used - Android studio, Appium server, Appium inspector, Eclipse



## Packages Description-

base: It consists of Base class.

pages: Define all pages needed for tests.

features: It consists of feature files which is written using gherkin keywords and define all scenario and features description to be tested.

stepDefinition: It consists of step definition files which is generated after running the feature files.

runner: We can run tests using a test runner file for Cucumber.



## Pages and Test files Used-

###base

Base: This class defines all the dependencies.

###Pages

AccessibilityPage: It contains @AndroidFindBy and methods for accessibility services.

AnimationPage: It contains @AndroidFindBy and methods for animation default layout.

AppPage: It contains @AndroidFindBy and methods for app.

ContentPage: It contains @AndroidFindBy and methods for content.

GraphicsPage: It contains @AndroidFindBy and methods for animate graphics.

###Test Files

***features:-

Accessibility: Containing scenarios for accessibility services.

Animation: Containing scenarios for default layout animation.

App: Containing scenarios for app services.

Content: Containing scenarios for content.

Graphics: Containing scenarios for animate graphics.


***stepDefinition:-

AccessibilitySteps: It defines Given, When, and Then for accessibility services.

AnimationSteps: It defines Given, When, and Then for default layout animation.

AppSteps: It defines Given, When, and Then for app.

ContentSteps: It defines Given, When, and Then for content.

GraphicsSteps: It defines Given, When, and Then for animate graphics.

Hooks: This class defines @After, @Before.

***runner:-

Runner: This class defines cucumber option like feature, glue, tags, etc.