import com.kms.katalon.core.annotation.Keyword
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryListener;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.LauncherSession;
import org.junit.platform.launcher.LauncherSessionListener;
import org.junit.platform.launcher.PostDiscoveryFilter;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherConfig;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;
import org.junit.platform.suite.api.SelectPackages;


public class junit5test {
	SummaryGeneratingListener listener = new SummaryGeneratingListener();
	@Keyword
	public void junit5Execution(String packageName, String testName) {

		LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
				.selectors(
				selectPackage(packageName),
				selectClass(MyTestClass.class)
				)
				.filters(
				includeClassNamePatterns(testName)
				)
				.build();

		TestPlan testPlan = session.getLauncher().discover(request);
	}

	@Keyword
	public void junit5Execution2() {

		LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
				.selectors(
				selectPackage("io.testproject.generated.tests.katalontestprojectCallTestCases"),
				selectClass(JUnitPlatform.class)
				)
				.filters(
				includeClassNamePatterns(".*Tests")
				)
				.build();

		SummaryGeneratingListener listener = new SummaryGeneratingListener();


		Launcher launcher = session.getLauncher();
		launcher.registerTestExecutionListeners(listener);
		TestPlan testPlan = launcher.discover(request);
		launcher.execute(testPlan);
		launcher.execute(request);

		TestExecutionSummary summary = listener.getSummary();
	}

	public void runOne() {
		LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
				.selectors(selectClass(FirstUnitTest.class))
				.build();
		Launcher launcher = LauncherFactory.create();
		TestPlan testPlan = launcher.discover(request);
		launcher.registerTestExecutionListeners(listener);
		launcher.execute(request);
	}
}