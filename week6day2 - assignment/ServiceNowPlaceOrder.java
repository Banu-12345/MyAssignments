package Project1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ServiceNowPlaceOrder extends ProjectCommonMethod {
@Test
	public void servicenoworder() {
		// TODO Auto-generated method stub
	
       dom.setImplicitWait(5);
       WebElement filter= dom.findElementByXPath("//span[text()='Service Catalog']");
       filter.click();
     //  driver.switchTo().frame(0);
       WebElement frmae=dom.findElementByXPath("//iframe[@id='gsft_main']");
       driver.switchTo().frame(frmae);
       dom.findElementByXPath("//h2[contains(text(),'Mobiles')]").click();
       dom.findElementByXPath("//strong[text()='Apple iPhone 6s']").click();
       WebElement color=driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
       Select obj=new Select(color);
       obj.selectByVisibleText("Gold");
       
       WebElement storage=driver.findElement(By.xpath("//select[@id='IO:e0b15e33d7033100a9ad1e173e24d4a1']"));
       Select obj1=new Select(storage);
       List<WebElement> alloptions=obj1.getOptions();
       for(WebElement options:alloptions)
       {
    	   if(options.getText().contains("128"))
    		   options.click();
    	   
       }
       dom.findElementByXPath("//button[@id='oi_order_now_button']").click();
       String orederplace=driver.findElement(By.xpath("//dl[@class='dl-horizontal sc-dl-horizontal']")).getText();
       System.out.println(orederplace);
             
	}

}
