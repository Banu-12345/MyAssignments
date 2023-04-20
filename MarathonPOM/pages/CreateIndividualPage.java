package pages;
import java.io.IOException;
import java.time.Duration;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectspecificCommon;

public class CreateIndividualPage extends ProjectspecificCommon {
	
public CreateIndividualPage(ChromeDriver driver,ExtentTest node) {
	this.driver=driver;
	this.node=node;
}

public CreateIndividualPage verifyname() {
		String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(message);
		return this;
	}
}

