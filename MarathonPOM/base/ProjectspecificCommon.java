package base;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utils.ExcelReading;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ProjectspecificCommon {
	public ChromeDriver driver;
	public String excelFile;
	public static ExtentReports extent;
	public static ExtentTest createTest,node;
	public String testName,testDescription,testcategory,testAuthor;
	@BeforeSuite
	public void startreport() {
		
	
	ExtentHtmlReporter reporter=new ExtentHtmlReporter("Reports/Result.html");
	
	//Create obj for ExtentReports
     extent=new ExtentReports();
    
    //attach data with physical path
    extent.attachReporter(reporter);
	}
    
   @AfterSuite
   public void stopReport()
   {
	   extent.flush();
   }
   @BeforeClass
   public void testcasedetail()
   {
	   createTest = extent.createTest(testName,testDescription);
       createTest.assignCategory(testcategory);
       createTest.assignAuthor(testAuthor);
   }
   public int takeSnap() throws IOException
   {
	   int random=(int)(Math.random()*99999+100000);
	   File source = driver.getScreenshotAs(OutputType.FILE);
	   File dest=new File("./snap/img"+random+".png");
	   FileUtils.copyFile(source, dest);
	   return random;
   }
   public void reportstep(String stepdesc,String status) throws IOException
   {
	 if(status.equalsIgnoreCase("pass"))  {
		node.pass(stepdesc,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takeSnap()+".png").build()); 
	 }
	 else if(status.equalsIgnoreCase("fail"))
		 node.fail(stepdesc,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takeSnap()+".png").build()); 
   }
	
	@BeforeMethod
	public void launchBrowser() 
	{
		
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        node = createTest.createNode(testName);
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
	
	
	 @AfterMethod 
	 public void postcondition() 
	 { 
		 driver.close(); 
		 }
	 
	 @DataProvider(name="fetchdata")
	 public String[][] getData() throws IOException
	 {
	 	String inputdata[][]= ExcelReading.inputdata(excelFile);
	 	return inputdata;
	 	}

}
