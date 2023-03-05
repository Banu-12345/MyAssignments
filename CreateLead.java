package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhilshath");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Banu");
		
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop=new Select(source);
		drop.selectByVisibleText("Employee");
		
		WebElement marketcamp=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop2=new Select(marketcamp);
		drop2.selectByValue("9001");
		
		WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop4=new Select(ownership);
		drop4.selectByIndex(5);
		
	/*	WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop3=new Select(country);
		drop3.selectByVisibleText("Angola");
		*/
		
		
		driver.findElement(By.name("submitButton")).click();
	String tit =driver.getTitle();
	System.out.println(tit);
		
	}

}
