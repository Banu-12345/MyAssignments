package testcases;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import base.ProjectspecificCommon;
import pages.LoginPage;	

	public class Tc_00_Login extends ProjectspecificCommon
	{
		@BeforeTest
		public void setup()
		{
			excelFile="loginforsalesforce";
			testName="LoginBoko";
			testDescription="Salesforce login";
			testcategory="Smoke";
			testAuthor="Banu";
			
		}
		@Test(dataProvider = "fetchdata")
		public void runLogin(String uname,String pwd) throws IOException
		{
			LoginPage lp=new LoginPage(driver, node);
			lp.enterusername(uname).enterpassword(pwd).clicklogin();			
		}
	}



