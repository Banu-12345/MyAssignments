package pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentTest;
import base.ProjectspecificCommon;

public class LoginPage extends ProjectspecificCommon
{
	
	public LoginPage(ChromeDriver driver,ExtentTest node)
	{
		this.driver=driver;
		this.node=node;
	}
	public LoginPage enterusername(String uname) throws IOException
	{
		try {
			driver.findElement(By.id("username")).sendKeys(uname);
			reportstep(uname+"username entered sucessfully","Pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportstep(uname+"username not entered sucessfully"+e,"Fail");
		}
		return this;
	}
	

	public LoginPage enterpassword(String pwd) throws IOException
	{
		try {
			driver.findElement(By.id("password")).sendKeys(pwd);
			reportstep(pwd+"password entered sucessfully","Pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportstep(pwd+"Password not entered sucessfully"+e,"Fail");
		}
		return this;
	}
	public HomePage clicklogin()
	{
		driver.findElement(By.id("Login")).click();
		return new HomePage(driver, node);
	}
	
	}

	
