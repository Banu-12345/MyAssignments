package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	//To click on find leads
		driver.findElement(By.xpath("//a[text()='My Leads']//following::li[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Name and ID']/following::li)[1]")).click();
		driver.findElement(By.xpath("//span[text()='Phone']/following::input[6]")).sendKeys("+91");
		driver.findElement(By.xpath("//span[text()='Phone']/following::input[7]")).sendKeys("9176796779");
	//	driver.findElement(By.xpath("//span[text()='Email']/following::button[1]")).click();
	//	driver.findElement(By.xpath("//a[text()='15698']")).click();
	//	driver.findElement(By.xpath("  //div[@class='frameSectionExtra']/child::a[4]")).click();
		driver.findElement(By.xpath("//a[text()='Merge Leads']/ancestor::div[1]/descendant::a[3]")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("15698");
		Thread.sleep(2000);
		//To click find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='No records to display']")).getText()); 
		String text=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(text.contains("No records"))
		{
			System.out.println("verified: it is diplayed");
			
		}
		else
			System.out.println("verified: It is not displayed");
			
	}

	
}
