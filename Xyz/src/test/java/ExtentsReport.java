


import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;


public class ExtentsReport {

@BeforeTest
	public void setUp() {
		extentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentReports.html");
	
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(htmlReporter);
		

	}


	public void tearDown() {

	}

}
