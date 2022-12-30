import io.testproject.generated.tests.katalontestproject.*
import static com.katalon.junit4ks.JUnitCustomKeywords.runWithJUnitRunner
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testng.keyword.JUnitRunnerResult
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW


/*
List junitTestClasses = [SampleJUnitTest.class]
JUnitRunnerResult junitResult = TestNGKW.runJUnitTestClasses(junitTestClasses, FailureHandling.STOP_ON_FAILURE)
println junitResult.getJUnitResult().getRunCount()*/

runWithJUnitRunner(Katalon_demo_Junit.class)