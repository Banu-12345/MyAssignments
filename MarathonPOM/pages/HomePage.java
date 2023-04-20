package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentTest;
import base.ProjectspecificCommon;

public class HomePage extends ProjectspecificCommon {
	public HomePage(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}

	public HomePage clickapplauncher() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;
	}

	public HomePage clickviewall() {

		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
		driver.executeScript("arguments[0].scrollIntoView();", scroll);
        return this;
	}
	
	public IndividualPage moveIndividualPage() {

		WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
		driver.executeScript("arguments[0].click();", individual);
		return new IndividualPage(driver,node);
	}


}
