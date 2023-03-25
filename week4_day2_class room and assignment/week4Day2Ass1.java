package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class week4Day2Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		WebElement table= driver.findElement(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
	
		System.out.println(rows.size());
		List<WebElement> col=table.findElements(By.tagName("th"));
		System.out.println(col.size());
		
	//	String data=driver.findElement(By.xpath("(//table)[2]//tr["+i+"]/td[1]")).getText();
	Set<String> list=new HashSet<String>();
		
		for(int i=1;i<rows.size();i++)
		{
			String data=driver.findElement(By.xpath("(//table)[2]//tr["+i+"]/td[1]")).getText();
			
			list.add(data);
					
		} 
		
		System.out.println(list);
		List<String> list1=new ArrayList<String>(list);
		for(int ir=1;ir<=list1.size();ir++)
		{
			for(int jr=ir+1;jr<=list1.size();jr++)
			{
				if(list1.get(ir-1)==list1.get(jr-1))
		System.out.println(list1.get(ir));
				
					
				
		}
		
		}
	  
		System.out.print("no duplicate found in the list");
		
	}

	
}
