package testcase;


import org.openqa.selenium.By;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateLead  extends ProjectSpecificMethod{
	
@Test(dataProvider = "fetchdata")
	public void runcreatelead(String cname,String fname,String lname,String pno) {
	
	driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pno);
		driver.findElement(By.name("submitButton")).click();
		
}
@DataProvider(name="fetchdata")
public String[][] getdata()
{
	String[][] data=new String[2][4];
	//set 1
	data[0][0]="CTS";
	data[0][1]="Banuu";
	data[0][2]="Ajeez";
	data[0][3]="100";
	//set 2
	data[1][0]="freshworks";
	data[1][1]="revathi";
	data[1][2]="A";
	data[1][3]="101";
	
	return data;
	}
}






