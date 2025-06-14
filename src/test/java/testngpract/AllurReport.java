package testngpract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class AllurReport {
	WebDriver driver;
	
	@Epic("Epic 1: Test launching a browser and navigating to a page")
	@Feature("Feature 2: logging in to OpenCart demo page")
	@Story("Story 2: login functionality test")
	@Step("Executing test method to open the browser and navigate to OpenCart demo page")
	@Severity(SeverityLevel.BLOCKER)
	@Test
	public void test() {
		System.out.println("AllurReport");
		driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
	}

	@Epic("Epic 1: Test Allure Reporting")
	@Feature("Feature 2: Basic Test Cases")
	@Story("Story 2: Test Allure Steps and Severity Levels")
	@Step("Executing test2 method")
	@Severity(SeverityLevel.CRITICAL)
	@Test
	public void test2() {
		System.out.println("Test2");
		//Assert.fail("failed test2");

	}

	@AfterClass
	@Step("Teardown method to close the browser")
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
