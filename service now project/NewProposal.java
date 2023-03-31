package Project1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class NewProposal extends ProjectCommonMethod{
@Test(dataProvider = "fetch1")
	public void newproposals(String description)
{
		// TODO Auto-generated method stub

		WebElement filter=dom.findElementByXPath("//input[@id='filter']");
//    filter.click();
     filter.sendKeys("My Proposal");
     dom.findElementByXPath("//div[@id='all']").click();
     dom.findElementByXPath("//span[@class='menu-item-row highlighted-menu-item-row']").click();
   WebElement frame1=dom.findElementByXPath("//iframe[@id='gsft_main']");
     driver.switchTo().frame(frame1);
      
     dom.findElementByXPath("//button[@id='sysverb_new']").click(); 	
  //   JavascriptExecutor js=((JavascriptExecutor)driver);
//     js.executeScript("arguments[0].click();", newbutton);
     driver.switchTo().defaultContent();
     WebElement frame2=dom.findElementByXPath("//iframe[@id='gsft_main']");
     driver.switchTo().frame(frame2);
     dom.findElementByXPath("//input[@id='std_change_proposal.short_description']").sendKeys(description);
     dom.findElementByXPath("//button[@id='sysverb_insert']").click();
     driver.switchTo().defaultContent();
     WebElement frame3=dom.findElementByXPath("//iframe[@id='gsft_main']");
     driver.switchTo().frame(frame3);
     String text=dom.findElementByXPath("//tbody//td[4]").getText();
     if(text.contains("Banu"))
     {
    	 System.out.println("New proposal created");
     }   
	}
@DataProvider(name="fetch1")
public String[][] getnewproposal()
{
String data1[][]=new String[3][1];

data1[0][0]="ABC - Banu1";

data1[1][0]="gdfh - Banu1";

data1[2][0]="hjh-Banu";


return data1;

}
	}