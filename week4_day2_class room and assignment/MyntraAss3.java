package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MyntraAss3 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement men= driver.findElement(By.xpath("//a[text()='Men']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(men).perform();
		driver.findElement(By.xpath("//a[text()='Jackets']")).click();
		List<WebElement> products=driver.findElements(By.xpath("//h3[@class='product-brand']"));
		System.out.println(products.size());
		String totitem=driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		totitem=totitem.replaceAll("[^0-9]", "");
		System.out.println(totitem);
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[1]")).click();
		driver.findElement(By.xpath(" //div[@class='brand-more']")).click();
		driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("Duke");
		driver.findElement(By.xpath("//label[@class=' common-customCheckbox']")).click();
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		List<WebElement> brands=driver.findElements(By.xpath("//h3[text()='Duke']"));
		
		for(WebElement dukebrands:brands)
		{
			if(dukebrands.getText().equals("Duke"))
			System.out.println(dukebrands.getText());
			break;
		}
		
		WebElement sort=driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		builder.moveToElement(sort).perform();
		List<WebElement> sortdropdown=driver.findElements(By.xpath("//label[@class='sort-label ']"));
		for(int i=0;i<sortdropdown.size();i++)
		{
			if(sortdropdown.get(i).getText().equals("Better Discount"))
			sortdropdown.get(i).click();
			
		}
		System.out.println("Better Discount is clicked");
		String price=driver.findElement(By.xpath(" (//div[@class='product-price'])[1]")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
		Set<String> list= driver.getWindowHandles();
		List<String> newlist=new ArrayList<String>(list);
		driver.switchTo().window(newlist.get(1));
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/img2.png");
		FileUtils.copyFile(src, dest);
		
	}

}
