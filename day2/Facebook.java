package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver(); 
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//a[contains(text(),'Create new')]")).click();
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dhilshath");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Banu");
driver.findElement(By.xpath("//input[contains(@name,'reg_email')]")).sendKeys("dhilshathbanu92@gmail.com");
driver.findElement(By.xpath("//input[contains(@name,'reg_passwd')]")).sendKeys("banubanu");
WebElement dob=driver.findElement(By.xpath("//select[contains(@name,'birthday')]"));
Select dob1=new Select(dob);
dob1.selectByVisibleText("14");
WebElement month=driver.findElement(By.xpath("//select[contains(@name,'month')]"));
Select month1=new Select(month);
month1.selectByIndex(10);
WebElement year=driver.findElement(By.xpath("//select[contains(@name,'year')]"));
Select year1=new Select(year);
year1.selectByValue("1992");
driver.findElement(By.xpath("//select[@id='day']/following::span[3]")).click();





	}
}
