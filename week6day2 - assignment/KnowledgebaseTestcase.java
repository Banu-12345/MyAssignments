package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class KnowledgebaseTestcase extends ProjectCommonMethod {
    @Test
	public void knowlegebased() {
		// TODO Auto-generated method stub
		
        dom.findElementByXPath("//span[text()='Knowledge']").click();
        WebElement frme1=dom.findElementByXPath("//iframe[@id='gsft_main']");
        driver.switchTo().frame(frme1);
        dom.findElementByXPath("//button[@class='btn btn-primary']").click();
        driver.switchTo().defaultContent();
        WebElement frme2=dom.findElementByXPath("//iframe[@id='gsft_main']");
        driver.switchTo().frame(frme2);
        dom.findElementByXPath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']").sendKeys("IT",Keys.ENTER);
        dom.findElementByXPath("//input[@id='sys_display.kb_knowledge.kb_category']").sendKeys("Java",Keys.ENTER);
         dom.findElementByXPath("//a[@id='kb_knowledge.valid_to.ui_policy_sensitive']").click();
        dom.findElementByXPath("//td[@id='GwtDateTimePicker_month_next']").click();
        dom.findElementByXPath(" //a[@id='GwtDateTimePicker_day36']").click();
        dom.findElementByXPath("//input[@id='kb_knowledge.short_description']").sendKeys("This is for knowledge based category");
		/*
		 * WebElement articletype=dom.findElementByXPath(
		 * "//select[@id='kb_knowledge.article_type']"); Select articletypedrp=new
		 * Select(articletype); articletypedrp.selectByValue("wiki");
		 */
        dom.findElementByXPath("//label[@id='label.ni.kb_knowledge.display_attachments']").click();
   
        WebElement frme3=dom.findElementByXPath("//iframe[@id='kb_knowledge.text_ifr']");
        driver.switchTo().frame(frme3);
        
        dom.findElementByXPath("//body[@id='tinymce']").sendKeys("This is for knowledge based category and i have chosen java");
        driver.switchTo().defaultContent();
        WebElement frme4=dom.findElementByXPath("//iframe[@id='gsft_main']");
        driver.switchTo().frame(frme4);
        dom.findElementByXPath("//button[@id='sysverb_insert']").click();
	}

  
}
