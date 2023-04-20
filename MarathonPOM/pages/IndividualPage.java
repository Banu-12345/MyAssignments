package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentTest;
import base.ProjectspecificCommon;

public class IndividualPage extends ProjectspecificCommon {

	public IndividualPage(ChromeDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
	}

	public IndividualPage clicknewindividualtab() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='New']")).click();
		return this;
	}

	public IndividualPage enterLastname(String lname) throws IOException {
		try {
			driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys(lname);
			reportstep(lname + "firstname entered sucessfully", "Pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportstep(lname + "firstname entered sucessfully " + e, "Fail");
		}

		return this;
	}

	public CreateIndividualPage clickSave() {
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		return new CreateIndividualPage(driver, node);
	}

	public IndividualPage clickIndividuals() {
		WebElement clk = driver.findElement(By.xpath("//a[@title='Individuals']//span[1]"));
		driver.executeScript("arguments[0].click();", clk);
		return this;
	}

	public IndividualPage enterSearchName(String searchname) throws IOException {
		try {
			WebElement name = driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
			name.sendKeys(searchname);
			name.sendKeys(Keys.ENTER);
			reportstep(searchname + "firstname entered sucessfully", "Pass");
		} catch (Exception e) {
			reportstep(searchname + "firstname entered sucessfully " + e, "Fail");

		}
		return this;
	}

	public IndividualPage clickDropDownforEdit() throws InterruptedException {
		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
		driver.executeScript("arguments[0].click();", ele);
		return this;
	}
	public IndividualPage clickEdit() throws InterruptedException {
		Thread.sleep(3000);
		WebElement edit = driver.findElement(By.xpath("//a[@title='Edit']/div"));
		driver.executeScript("arguments[0].click();", edit);
		return this;
	}
	public IndividualPage clickSelect() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='select']")).click();
		return this;
	}
	public IndividualPage clickMr() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Mr.']")).click();
		return this;
	}
	public IndividualPage enterFirstname(String fname) throws InterruptedException, IOException {
		try {
			driver.findElement(By.xpath("//input[contains(@class,'firstName')]")).sendKeys(fname);
			reportstep(fname+"first name enetered sucessfully","Pass");
		} catch (Exception e) {
			reportstep(fname+"first name enetered sucessfully" +e,"Fail");
		}
		return this;
	}
	public IndividualPage saveEdit() throws InterruptedException {
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		return this;
	}
	public IndividualPage verifymessage() throws InterruptedException {
		String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(msg);
		return this;
	}
	
	public IndividualPage selectDelete() throws InterruptedException {
		WebElement delete = driver.findElement(By.xpath("//a[@role='menuitem']/div[@title='Delete']"));
		driver.executeScript("arguments[0].click();", delete);
		return this;
	}
	public IndividualPage confirmDelete() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		return this;
	}
	public IndividualPage searchdeletedname(String searchdeletename) throws InterruptedException, IOException {
		try {
			driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys(searchdeletename,Keys.ENTER);
			reportstep(searchdeletename+ "searched name sucessfully", "Pass");
		} catch (Exception e) {
			reportstep("search name failed "+e, "Fail");
		}
		Thread.sleep(3000);
		return this;
	}
	public IndividualPage verifyDelete() throws InterruptedException {
		String verify = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
		System.out.println(verify);
		return this;
	}
}


