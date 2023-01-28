# Introduction:

This project demonstrates how katalon studio helps users to use their existing TestProject based project into Katalon Studio. it conatins some of the test cases for Web Mobile and API test Migration.

# Requirement
* Katalon Studio
* TestProject Sample Project
* Basic understanding of Juniot and TestNG.
* Junit/TestNG Plugin https://store.katalon.com/product/180/TestNG-JUnit-Keywords

# TestProject

TestProject is an end-to-end automation tool that provides capabilities to automate Web, API, and Mobile applications. It is an open-source friendly tool built on top of Selenium and Appium.
TestProject uses OpenSDK with JUnit 5 for building and execution of the Test cases.

# How to migrate:
* Download a TestProject Sample Project.

![image](https://user-images.githubusercontent.com/84115288/210084530-22a208fa-c8a0-4834-b03a-a7c5e085d33a.png)

* Import all the required jars(build.gradle)

![image](https://user-images.githubusercontent.com/84115288/215267567-f7320a19-61b1-4970-ac3d-2814e8a591d6.png)


* Add all your project file into Include >> Script >>groovy

![image](https://user-images.githubusercontent.com/84115288/210084671-bed87d11-1cdf-4501-9d84-fb0dea43ef5a.png)

* Users have to fix all the errors.
* Change Junit 5 annotation to TestNG/Junit 4.(KS does not support Junit 5 for now)

![image](https://user-images.githubusercontent.com/84115288/210084851-39692b4d-4d0e-4860-8ff5-6c1896a9766e.png)

* Prepare TestNG.xml file

![image](https://user-images.githubusercontent.com/84115288/210084933-dfa55136-550c-470c-985d-50015b38e464.png)

* Prepare the test cases and run it.

![image](https://user-images.githubusercontent.com/84115288/210085012-b7c67da6-122e-41cc-8964-8e17bfa9ae2c.png)

* Verify test Execution Result

![image](https://user-images.githubusercontent.com/84115288/210085236-3c2b9cb4-a59e-4722-9d73-4b8cbf10bfb1.png)

Thanks
