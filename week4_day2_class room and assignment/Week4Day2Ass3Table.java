package week4day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Week4Day2Ass3Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement table1=driver.findElement(By.xpath("(//table)[1]"));
		List<WebElement> rows=table1.findElements(By.xpath("tr"));
		for(int i=1;i<=2;i++)
		{
		String rowsinfo=driver.findElement(By.xpath("(//table)[1]//tr["+i+"]/td[1]")).getText();
		System.out.println(rowsinfo);
		if(rowsinfo.equals("Market Share"))
		{
			for(int j=2;j<=4;j++)
			{
				String marketshareinfo=driver.findElement(By.xpath("(//table)[1]//tr[1]/td["+j+"]")).getText();
				System.out.println(marketshareinfo);

		}
		

	    }
		else if(rowsinfo.equals("Absolute Usage"))
			
		{
			for(int k=2;k<=4;k++) 
			{
			String absoluteusage=driver.findElement(By.xpath("(//table)[1]//tr[2]/td["+k+"]")).getText();
			System.out.println(absoluteusage);
			}
		}
	}

}
}
