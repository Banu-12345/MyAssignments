package Project1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.sukgu.Shadow;

public class ProjectCommonMethod 
{
	public ChromeOptions option;
	public RemoteWebDriver driver;
	public Shadow dom;
	public String excelfile;
	
	@Parameters({"browser","url","user_name","user_password"})
	@BeforeMethod
	public void precondition(String browser,String url,String name,String pwd)
	{
		switch(browser)
		{
		case "chrome":
			option=new ChromeOptions();
		    option.addArguments("--remote-allow-origins=*");
		    option.addArguments("--disable-notifications");
			driver=new ChromeDriver(option);
			break;
		case "edge":
			driver=new EdgeDriver();
			break;			
		}
	
	
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(name);
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	
    dom=new Shadow(driver);
    dom.setImplicitWait(15);
    dom.findElementByXPath("//div[@id='all']").click();
	}
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}
	@DataProvider(name="fetchdata")
	public String[][] getdata() throws IOException
	{
		String[][] inputdata = week6.day2.ReadExcel.inputdata(excelfile);
		return inputdata;
	}

}
