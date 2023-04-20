package testcases;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import base.ProjectspecificCommon;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
public class Tc_02_EditIndividuals extends ProjectspecificCommon {
	
		@BeforeTest
		public void setup()
		{
			excelFile="Editinput";
			testName="Edit individual";
			testDescription="Salesforce";
			testcategory="Smoke";
			testAuthor="Banu";
			
		}
		@Test(dataProvider = "fetchdata")
		public void runEditIndividual(String uname,String pwd,String searchname,String fname) throws IOException, InterruptedException
		{
			LoginPage lp=new LoginPage(driver, node);
			lp.enterusername(uname).enterpassword(pwd).clicklogin().clickapplauncher().clickviewall()
			.moveIndividualPage().clicknewindividualtab().clickIndividuals().enterSearchName(searchname)
			.clickDropDownforEdit().clickEdit().clickSelect().clickMr().enterFirstname(fname).saveEdit().verifymessage();
					
		}	


		}

	


