package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amaznw4d2Ass2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.click();
		search.sendKeys("oneplus 9 pro",Keys.ENTER);
	String price1=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
	System.out.println(price1);
	String rating=driver.findElement(By.xpath("(//span[@class='a-size-base'])[1]")).getText();
	System.out.println(rating);
Thread.sleep(3000);
	WebElement mouseoverrating=driver.findElement(By.xpath("(//a[@class='a-popover-trigger a-declarative'])[1]"));
		Actions builder=new Actions(driver);
	builder.moveToElement(mouseoverrating).perform();
	Thread.sleep(2000);
//	String ratigpercentage=driver.findElement(By.xpath("(//a[contains(text(),'5 star')]/following::td)[2]")).getText();
//	System.out.println(ratigpercentage);
	driver.findElement(By.xpath("( //span[contains(text(),'(Renewed) OnePlus 9 Pro')])[1]")).click();
	Set<String> window=driver.getWindowHandles();
	List<String> windows=new ArrayList<String>(window);
	driver.switchTo().window(windows.get(1));
	System.out.println(driver.getTitle()); 
	File src=driver.getScreenshotAs(OutputType.FILE);
	File dest=new File("./snap/img1.png");
	FileUtils.copyFile(src, dest);
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	String price=driver.findElement(By.xpath("(//b[text()='Cart subtotal']/following::span)[1]")).getText();
	System.out.println(price);
	
	
	}

}
