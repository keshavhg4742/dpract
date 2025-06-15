package testngpract;

import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.Step;
import io.qameta.allure.SeverityLevel;

public class Demo {
	@Severity(SeverityLevel.NORMAL)
	@Step("This is a step in the Demo class")
	@Test
	public void testMethod() {
		System.out.println("This is a test method in the Demo class.");
	}

}
