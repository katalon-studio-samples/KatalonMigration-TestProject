package io.testproject.generated.tests.katalontestproject;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.kms.katalon.core.webui.driver.DriverFactory;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords;

@RunWith(JUnit4.class)
public class Katalon_demo_Junit {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws Exception {
		WebUiBuiltInKeywords.openBrowser("");
		driver = DriverFactory.getWebDriver();
	}

	@Test
	public void execute() throws Exception {
		// set timeout for driver actions (similar to step timeout)
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
		By by;
		boolean booleanResult;

		// 1. Navigate to '{{ApplicationURL}}'
		// Navigates the specified URL (Auto-generated)
		GeneratedUtils.sleep(500);
		driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

		// 2. Click 'I'
		GeneratedUtils.sleep(500);
		by = By.xpath("//body/a/i");
		driver.findElement(by).click();

		// 3. Click 'Login'
		GeneratedUtils.sleep(500);
		by = By.xpath("//a[. = 'Login']");
		driver.findElement(by).click();

		// 4. Click 'username1'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#txt-username");
		driver.findElement(by).click();

		// 5. Type 'John Doe' in 'username1'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#txt-username");
		driver.findElement(by).sendKeys("John Doe");

		// 6. Click 'password'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#txt-password");
		driver.findElement(by).click();

		// 7. Type 'ThisIsNotAPassword' in 'password'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#txt-password");
		driver.findElement(by).sendKeys("ThisIsNotAPassword");

		// 8. Click 'Login1'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#btn-login");
		driver.findElement(by).click();

		// 9. Scroll window by ('0','500')
		GeneratedUtils.sleep(500);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", "");

		// 10. Click 'facility'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#combo_facility");
		driver.findElement(by).click();

		// 11. Select the 'Seoul CURA Healthcare Center' option in 'facility'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#combo_facility");
		(new Select(driver.findElement(by))).selectByValue("Seoul CURA Healthcare Center");

		// 12. Click 'hospital_readmission'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#chk_hospotal_readmission");
		driver.findElement(by).click();

		// 14. Click 'visit_date'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#txt_visit_date");
		driver.findElement(by).click();

		// 15. Click '27'
		GeneratedUtils.sleep(500);
		by = By.xpath("//td[3][. = '27']");
		driver.findElement(by).click();
		
		// 13. Click 'programs'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#radio_program_medicaid");
		driver.findElement(by).click();
		
		// 16. Click 'comment'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#txt_comment");
		driver.findElement(by).click();

		// 17. Type 'Test demo' in 'comment'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#txt_comment");
		driver.findElement(by).sendKeys("Test demo");

		// 18. Click 'Book Appointment'
		GeneratedUtils.sleep(500);
		by = By.cssSelector("#btn-book-appointment");
		driver.findElement(by).click();

		// 19. Click 'Go to Homepage'
		GeneratedUtils.sleep(500);
		by = By.xpath("//a[. = 'Go to Homepage']");
		driver.findElement(by).click();

	}

	@AfterClass
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
