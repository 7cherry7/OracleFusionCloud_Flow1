package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.BaseClass;

public class ExtentReportManager implements ITestListener {
	
	
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	String repName;
	
	public void onStart(ITestContext testcontext) {
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		repName = "Test-Report-" + timeStamp + ".html";
		
				
		sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName); //Specify location of the report
		
		sparkReporter.config().setDocumentTitle("Oracle Fusion Cloud_Flow"); //Title of the report
		sparkReporter.config().setReportName("Oracle Fusion Cloud_Flow Functional Testing" ); //Name of the report
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Application", "Oracle Fusion Cloud");
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		extent.setSystemInfo("Environment", "QA");
		
		String os = testcontext.getCurrentXmlTest().getParameter("os");
		extent.setSystemInfo("Operating System", os);
		
		String browser = testcontext.getCurrentXmlTest().getParameter("browser");
		extent.setSystemInfo("browser", browser);

		}

	
	public void onTestSuccess(ITestResult result) {
		
		test = extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.PASS, result.getName() + " got successfully executed");
		
		}
	
	public void onTestFailure(ITestResult result) {
		
		test = extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());

		test.log(Status.FAIL, result.getName() + " got failed");
		test.log(Status.INFO, result.getThrowable().getMessage());
		
		try {
			
			String imgPath = new BaseClass().captureScreen(result.getName());
			test.addScreenCaptureFromPath(imgPath);
		}
		catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
	}
	
	public void onTestSkipped(ITestResult result) {
		

		test = extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.SKIP, result.getName() + " got skipped");
		test.log(Status.INFO, result.getThrowable().getMessage());
	}
	
	public void onFinish(ITestContext context) {
		
		extent.flush();
		
		String pathOfExtentReport = System.getProperty("user.dir") + "\\reports\\" + repName;
		File extentReport = new File(pathOfExtentReport);
		
		try {
			Desktop.getDesktop().browse(extentReport.toURI());
			
		}
        catch (IOException e) {
        	
        	e.printStackTrace();
        	
        }
		
		/*try {
			URL url = new URL("file:///" + System.getProperty("user.dir") + "\\reports\\" + repName);
			
			//Create the Email message
			
			ImageHtmlEmail email = new ImageHtmlEmail();
			email.setDataSourceResolver(new dataSourceUrlResolver(url));
			email.setHostName("smpt.googlemail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("pavanoltraining@gmail.com", "password"));
			email.setSSLOnConnect(true);
			email.setFrom("pavanoltraining@gmail.com"); //Sender
			email.setSubject("TestResults");
			email.setMsg("Please find attached report.......");
			email.addTo("pavankumar.busyqa@gmail.com"); //Receiver
			email.attach(url, "extentReport", "Please check report.......");
			email.send(); //Send the mail
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}*/
}

}
