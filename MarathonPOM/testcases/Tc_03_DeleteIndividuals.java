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

public class Tc_03_DeleteIndividuals extends ProjectspecificCommon {
	@BeforeTest
	public void setup()
	{
		excelFile="delete";
		testName="Delete individual";
		testDescription="Salesforce";
		testcategory="Smoke";
		testAuthor="Banu";
		
	}
	@Test(dataProvider = "fetchdata")
	public void rundeleteIndividual(String uname,String pwd,String searchname,String searchdeletename) throws IOException, InterruptedException
	{
	LoginPage lp=new LoginPage(driver, node);
	 lp.enterusername(uname).enterpassword(pwd).clicklogin().clickapplauncher().clickviewall()
	.moveIndividualPage().clicknewindividualtab().clickIndividuals().enterSearchName(searchname)
	.clickDropDownforEdit().selectDelete().confirmDelete().searchdeletedname(searchdeletename).verifyDelete().verifymessage();
	}
}
