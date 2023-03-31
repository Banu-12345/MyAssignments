package Project1;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewCaller extends ProjectCommonMethod
{
@Test(dataProvider="fetch")
	public void createnewcaller(String uname,String fname,String searchname) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
        dom.findElementByXPath("//input[@id='filter']").sendKeys("Caller");
        dom.findElementByXPath("//div[@id='all']").click();
        dom.findElementByXPath("//span[@class='menu-item-row highlighted-menu-item-row']").click();
        WebElement frm1=dom.findElementByXPath("//iframe[@id='gsft_main']");
        driver.switchTo().frame(frm1);
        dom.findElementByXPath("//button[@id='sysverb_new']").click();
        driver.switchTo().defaultContent();
        WebElement frm2=dom.findElementByXPath("//iframe[@id='gsft_main']");
        driver.switchTo().frame(frm2);
		Thread.sleep(3000);
		 dom.findElementByXPath("// input[@id='sys_user.user_name']").sendKeys(uname);
		 dom.findElementByXPath("// input[@id='sys_user.first_name']").sendKeys(fname);
		/* 
		 * dom.findElementByXPath("// input[@id='sys_user.last_name']").sendKeys(lname);
		 * dom.findElementByXPath("// input[@id='sys_user.title']").sendKeys(title);
		 */
        dom.findElementByXPath("//label[@id='label.ni.sys_user.web_service_access_only']").click();

    //    dom.findElementByXPath("// input[@id='sys_user.email']").sendKeys(email);
      
        WebElement lang=dom.findElementByXPath("//select[@id='sys_user.preferred_language']");
        Select eng=new Select(lang);
        eng.selectByVisibleText("English");
        WebElement dateformat=dom.findElementByXPath("//select[@id='sys_user.date_format']");
        Select dformat=new Select(dateformat);
        dformat.selectByVisibleText("dd/MM/yyyy");
        
   //     dom.findElementByXPath("//input[@id='sys_user.mobile_phone']").sendKeys(pno);
        
        
        dom.findElementByXPath("//button[@id='sysverb_insert']").click();
        driver.findElement(By.xpath("//input[@class='form-control']")).clear();
      
//        dom.findElementByXPath("(//input[@class='form-control'])[1]]").sendKeys(searchname,Keys.ENTER);
        driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(searchname,Keys.ENTER);
//        List<WebElement>callerlist=dom.findElementsByXPath("//tr[@id='row_sys_user_b206eb3247b5251085161288c26d43b8']");
        String callerlists = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
        if(callerlists.contains(searchname)) {
        	System.out.println("New caller ID created");
        }

                
}
@DataProvider(name="fetch")
public String[][] getdata()
{
	String data[][]=new String[2][3];	
	data[0][0]="Sanah0997";
	data[0][1]="Sanah";
	data[0][1]="Sanah";
	/*
	 * data[0][2]="zafrin"; data[0][3]="Create new caller example";
	 * data[0][4]="sanah@gmail.com"; data[0][5]="9823"; data[0][6]="Sanah12";
	 */
	
	data[1][0]="Dulquer0997";
	data[1][1]="dulquer";
	data[1][2]="Dulquer";
	/*
	 * data[1][2]="zayan"; data[1][3]="Create new caller example2";
	 * data[1][4]="dulquer@gmail.com"; data[1][5]="9955"; data[1][6]="Dulquer12";
	 */
	return data;
			}
}