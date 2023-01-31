# Introduction:

This project demonstrates how katalon studio helps users to use their existing TestProject based project into Katalon Studio. it conatins some of the test cases for Web Mobile and API test migration.

# Requirement

* [Katalon Studio][KS] version 7.4.0 onwards.
* TestProject sample Project
* Basic understanding of Junit and TestNG.
* Junit/TestNG plugin. [Here][2]

# TestProject

TestProject is an end-to-end automation tool that provides capabilities to automate Web, API, and Mobile applications. It is an open-source friendly tool built on top of selenium and appium.
TestProject uses OpenSDK with Junit 5 for building and execution of the test cases.

# How to migrate:

* Download a TestProject sample project.

![image](https://user-images.githubusercontent.com/84115288/210084530-22a208fa-c8a0-4834-b03a-a7c5e085d33a.png)

* Import all the required jars(build.gradle) [Here][1]

![image](https://user-images.githubusercontent.com/84115288/215267567-f7320a19-61b1-4970-ac3d-2814e8a591d6.png)


* Add all your project file inside Include >> Script >> groovy.

![image](https://user-images.githubusercontent.com/84115288/210084671-bed87d11-1cdf-4501-9d84-fb0dea43ef5a.png)

* Users have to fix all the errors.

* Change Junit 5 annotation to TestNG/Junit 4.(KS does not support Junit 5 for now).

          @BeforeAll >> @BeforeClass
          @AfterAll >> @AfterClass

* Add @Test Annotation before the method "void execute()".

* Initialise Katalon Webdriver inside the @BeforeClass.

  For Web based application:

          WebUiBuiltInKeywords.openBrowser("");
	  WebUiBuiltInKeywords.maximizeWindow();
	  driver = DriverFactory.getWebDriver();
    
   For Mobile:
   
          String dirName = RunConfiguration.getProjectDir():
	  MobileBuiltInKeywords.startApplication(dirName+"/App/APIDemos.apk", false);
	  driver = MobileDriverFactory.getDriver();

![image](https://user-images.githubusercontent.com/84115288/210084851-39692b4d-4d0e-4860-8ff5-6c1896a9766e.png)

* Prepare TestNG.xml file by adding class name.

![image](https://user-images.githubusercontent.com/84115288/210084933-dfa55136-550c-470c-985d-50015b38e464.png)

* Prepare the test cases by adding TestNG or Junit Keywords
* Run the test execution. [Here][3]

![image](https://user-images.githubusercontent.com/84115288/210085012-b7c67da6-122e-41cc-8964-8e17bfa9ae2c.png)

* Verify test execution result. [Here][4]

![image](https://user-images.githubusercontent.com/84115288/210085236-3c2b9cb4-a59e-4722-9d73-4b8cbf10bfb1.png)



[1]: <https://docs.katalon.com/docs/general-information/proof-of-concept/dependencies-management-with-native-gradle-support-poc-in-katalon-studio#gradle-settings-in-katalon-studio> "Here"
[2]: <https://store.katalon.com/product/180/TestNG-JUnit-Keywords> "Here"
[KS]: <https://docs.katalon.com/docs/get-started/katalon-studio-installation/install-katalon-studio-on-macoswindows#download-katalon-studio> "Katalon Studio"

[3]: <https://docs.katalon.com/docs/execute/execute-tests-with-katalon-studio/execute-tests-with-katalon-studio-overview#ariaid-title1> "Here"
[4]: <https://docs.katalon.com/docs/analyze/reports/view-test-reports/view-test-reports-in-katalon-testops/view-test-results-and-execution-logs-in-katalon-testops#ariaid-title1> "Here"
