package week4day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Week4Day2Ass2Rowcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement table1=driver.findElement(By.xpath("(//table)[1]"));
		WebElement table2=driver.findElement(By.xpath("(//table)[2]"));
		List<WebElement>row1=table1.findElements(By.tagName("tr"));
		List<WebElement>col1=table1.findElements(By.tagName("th"));	
		System.out.println("No.on rows in table 1 is: " +row1.size());
		System.out.println("No.on col in table 1 is: " +col1.size());
		List<WebElement>row2=table2.findElements(By.tagName("tr"));
		List<WebElement>col2=table2.findElements(By.tagName("th"));
		System.out.println("No.on rows in table 2 is:"+" " +row2.size());
		System.out.println("No.on col in table 2 is:"+" "+col2.size());

	}

}
