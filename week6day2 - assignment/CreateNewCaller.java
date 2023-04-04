package Project1;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;
import week6.day2.ReadExcel;

public class CreateNewCaller extends ProjectCommonMethod {
	
	@BeforeTest
	public void setup()
	{
		excelfile="Createnewcaller";
	}
	@Test(dataProvider = "fetchdata")
	public void createnewcaller(String uname, String fname,String lname,String title,String email,String pno,String searchname) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		dom.findElementByXPath("//input[@id='filter']").sendKeys("Caller");
		dom.findElementByXPath("//div[@id='all']").click();
		dom.findElementByXPath("//span[@class='menu-item-row highlighted-menu-item-row']").click();
		WebElement frm1 = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frm1);
		dom.findElementByXPath("//button[@id='sysverb_new']").click();
		driver.switchTo().defaultContent();
		WebElement frm2 = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frm2);
		Thread.sleep(3000);
		dom.findElementByXPath("// input[@id='sys_user.user_name']").sendKeys(uname);
		dom.findElementByXPath("// input[@id='sys_user.first_name']").sendKeys(fname);
		
		  dom.findElementByXPath("// input[@id='sys_user.last_name']").sendKeys(lname);
		  dom.findElementByXPath("// input[@id='sys_user.title']").sendKeys(title);
		 
		dom.findElementByXPath("//label[@id='label.ni.sys_user.web_service_access_only']").click();

		dom.findElementByXPath("// input[@id='sys_user.email']").sendKeys(email);

		WebElement lang = dom.findElementByXPath("//select[@id='sys_user.preferred_language']");
		Select eng = new Select(lang);
		eng.selectByVisibleText("English");
		WebElement dateformat = dom.findElementByXPath("//select[@id='sys_user.date_format']");
		Select dformat = new Select(dateformat);
		dformat.selectByVisibleText("dd/MM/yyyy");

		dom.findElementByXPath("//input[@id='sys_user.mobile_phone']").sendKeys(pno);

		dom.findElementByXPath("//button[@id='sysverb_insert']").click();
		driver.findElement(By.xpath("//input[@class='form-control']")).clear();

		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(searchname, Keys.ENTER);
//        List<WebElement>callerlist=dom.findElementsByXPath("//tr[@id='row_sys_user_b206eb3247b5251085161288c26d43b8']");
		String callerlists = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		if (callerlists.contains(searchname)) 
		{
			System.out.println("New caller ID created");
		}

	}

	
}