package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Credit  limited account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[contains(@id,'officeSite')]")).sendKeys("Leaftaps");
		driver.findElement(By.xpath("(//input[contains(@class,'inputBox')])[5]")).sendKeys("100000");
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select industry1=new Select(industry);
		industry1.selectByVisibleText("Computer Software");
	    WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
	    Select ownership1=new Select(ownership);
	    ownership1.selectByVisibleText("S-Corporation");
	    WebElement source=driver.findElement(By.id("dataSourceId"));
	    Select source1=new Select(source);
	    source1.selectByValue("LEAD_EMPLOYEE");
	    WebElement campaign= driver.findElement(By.id("marketingCampaignId"));
	    Select campaign1=new Select(campaign);
	    campaign1.selectByIndex(6);
	   WebElement State=driver.findElement(By.name("generalStateProvinceGeoId"));
	   Select state1=new Select(State);
	   state1.selectByValue("TX");
	   driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	   driver.findElement(By.xpath("//a[contains(text(),'Create Account Ignoring')]")).click();
	String title=driver.getTitle();
	System.out.println(title);
	}

}
