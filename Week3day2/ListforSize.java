package Week3day2;


import java.time.Duration;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListforSize {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		driver.findElement(By.id("nav-search-submit-text")).click();
		
		List<WebElement> count=driver.findElements(By.className("a-price-whole"));
	//	int cnt=count.size();
/*		for(int i=1;i<count.size();i++)
		{
			System.out.println(count.get(i).getText());
		}	
		
	//	System.out.println(size);   */
		
		for(WebElement cnt1:count)
		{
			System.out.println(cnt1.getText());
						
		}
		
	}

	
	
}
