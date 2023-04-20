package testcases;

import java.io.IOException;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.ProjectspecificCommon;
import pages.LoginPage;

public class Tc_01_CreateIndividuals extends ProjectspecificCommon
{
	@BeforeTest
	public void setup()
	{
		excelFile="createindividual";
		testName="Creating individual";
		testDescription="Salesforce";
		testcategory="Smoke";
		testAuthor="Banu";
		
	}
	@Test(dataProvider = "fetchdata")
	public void runCreaeIndividual(String uname,String pwd,String lname) throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver, node);
		lp.enterusername(uname).enterpassword(pwd).clicklogin().clickapplauncher().clickviewall().moveIndividualPage().clicknewindividualtab().enterLastname(lname).clickSave().verifyname();
				
	}

}