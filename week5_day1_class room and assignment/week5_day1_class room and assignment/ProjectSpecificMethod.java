//package testcase;
package testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
	public ChromeOptions option;
@BeforeMethod	
public void precondition()
{
	ChromeOptions option=new ChromeOptions();
    option.addArguments("--remote-allow-origins=*");
    option.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	

}
@AfterMethod
public void postcondition()
{
	driver.close();
	}
}
