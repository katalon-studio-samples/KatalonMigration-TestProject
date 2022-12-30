import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

List testng_TestNG = ['Include/resource/Katalon_demo_TestNG.xml']

TestNGKW.runTestNGTestSuites(testng_TestNG, FailureHandling.STOP_ON_FAILURE)


