package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingAss1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//input[@name='ComboBox_partyIdFrom']/following::a)[1]")).click();
		System.out.println(driver.getTitle());
		Set<String> window=driver.getWindowHandles();
		List<String> window2=new ArrayList(window);
		driver.switchTo().window(window2.get(1));	
		driver.switchTo().window(window2.get(0));
		driver.switchTo().window(window2.get(1));
	driver.findElement(By.xpath("(//a[text()='Hema'])[1]")).click();
	driver.switchTo().window(window2.get(0));
	driver.findElement(By.xpath("(//input[@name='ComboBox_partyIdTo']/following::a)[1]")).click();
	Set<String> windowhandle=driver.getWindowHandles();
	List<String> windowhandle2=new ArrayList(windowhandle);
	
driver.switchTo().window(windowhandle2.get(1));
	
driver.findElement(By.xpath("(//a[text()='Hema'])[2]")).click();
driver.switchTo().window(windowhandle2.get(0));
driver.findElement(By.xpath("//a[text()='Merge']")).click();
Alert alert=driver.switchTo().alert();
	alert.accept();

System.out.println(driver.getTitle());

	
		
	}

}
