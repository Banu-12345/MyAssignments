package testcase;



import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class EditLead extends CommonMethodforTestcase{
	
@Test(dataProvider = "fetchdata" )
	public void rumeditlead(String pno,String cname) throws InterruptedException {
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.name("submitButton")).click();
		
}
@DataProvider(name="fetchdata")
public String[][] editdata()
{
	String[][] edit=new String[3][2];
	//set 1
	edit[0][0]="100";
	edit[0][1]="Zoho";
	//set 2
	edit[1][0]="200";
	edit[1][1]="Wipro";
	//set 3
	edit[2][0]="300";
	edit[2][1]="Accendos";
	return edit;
	     
}
}






