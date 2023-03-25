package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NycaaAss1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(ele).perform();
		driver.findElement(By.xpath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']")).click();

		System.out.println(driver.getTitle());
	//	driver.findElement(By.xpath("//span[contains(text(),'Sort By')]")).click();
		
		//
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		//
		driver.findElement(By.xpath("//span[text()='Avg Customer Rating']")).click();
		driver.findElement(By.xpath(" //span[contains(text(),'4 stars') and@class='title']")).click();
		//
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Paris Colour Protect')]")).click();
		//
		Set<String> windows=driver.getWindowHandles();
		List<String> nwinodows=new ArrayList<String>(windows);
		driver.switchTo().window(nwinodows.get(1)); 
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		String price=driver.findElement(By.xpath("(//span[contains(text(),'MRP')]/following-sibling::span)[1]")).getText();
	//	System.out.println(price);
		price=price.replaceAll("[^0-9]", "");	
		System.out.println(price);
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Sign in']//following::*)[1]")).click();
		driver.switchTo().frame(0);
		String totprice=driver.findElement(By.xpath("(//p[text()='You Pay']//following::span)[3]")).getText();
		totprice=totprice.replaceAll("[^0-9]", "");
		System.out.println(totprice);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.switchTo().defaultContent();
		String pricedetial=driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
		pricedetial=pricedetial.replaceAll("[^0-9]", "");
		System.out.println(pricedetial);
		if(totprice.equals(pricedetial))
			System.out.println("Price is same as grand total");
		
	}

}
