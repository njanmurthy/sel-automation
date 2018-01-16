package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReport {
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentHtmlReporter htmlReporter;
//	public static String filePath = "./extentreport.html";
	public static String filePath = System.getProperty("user.dir")+"\\REPORT.html";
//	public static String filePath = "C:\\Users\\niranjana.shivakumar\\Desktop\\extentreport.html";
	
	public static ExtentReports GetExtent(){
		if (extent != null)
                    return extent; //avoid creating new instance of html file
        extent = new ExtentReports();		
		extent.attachReporter(getHtmlReporter());
		return extent;
	}
 
	private static ExtentHtmlReporter getHtmlReporter() {
	
        htmlReporter = new ExtentHtmlReporter(filePath);
	// make the charts visible on report open
//        htmlReporter.config().setChartVisibilityOnOpen(true);
//		
//        htmlReporter.config().setDocumentTitle("QAV automation report");
//        htmlReporter.config().setReportName("Regression cycle");
        htmlReporter.loadXMLConfig("./extentreport-config.xml");
        return htmlReporter;
	}
	
	public static ExtentTest createTest(String name, String description){
		test = extent.createTest(name, description);
		return test;
	}
}
