package demo;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import resources.baseWebdriver;

public class superTestNG extends baseWebdriver {
	
	@BeforeTest
	public void testsetup() throws IOException {
		driver = initializeDriver();
		extent = GetExtent();
	}
	
	@AfterTest
	public void tearDown() {
		extent.flush();
		driver.close();
		driver = null;
	}
	
	@AfterMethod
	public void getResult(ITestResult result)
    {
        if(result.getStatus()==ITestResult.FAILURE)
        {
            test.fail( result.getThrowable());
             
        }
    }
}
