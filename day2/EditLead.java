package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	//	driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.xpath("//a[text()='My Leads']//following::li[2]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("sanah");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	//driver.findElement(By.xpath("(//span[contains(text(),'Lead List')]/following::a)[24]")).click();
		driver.findElement(By.xpath("//a[text()='15475']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("TCS");
		
		driver.findElement(By.xpath("//input[@name='tickerSymbol']//following::input")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		
	
	}

}
