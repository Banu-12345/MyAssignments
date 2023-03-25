package week4day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.asm.Advice.Enter;

public class WebTableExcecise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ele=driver.findElement(By.id("txtStationFrom"));
		ele.clear();
		ele.sendKeys("MAS" ,Keys.ENTER);
		WebElement ele1=driver.findElement(By.id("txtStationTo"));
		ele1.clear();
		ele1.sendKeys("MDU" ,Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
	List<WebElement> list=driver.findElements(By.xpath("(//table)[2]//tr/td[2]"));
	System.out.println(list.size());
	
	//String text=driver.findElement(By.xpath("(//table)[2]//tr/td[2]")).getText();
	
	
	/*for(WebElement list1:list)
	{
		String text2 = driver.findElement(By.xpath("(//table)[2]//tr["++"]/td[2]")).getText();
        System.out.println(text2);
	}
	*/
		for(int i=2;i<list.size();i++)
		{
			
	            String text2 = driver.findElement(By.xpath("(//table)[2]//tr["+i+"]/td[2]")).getText();
	            System.out.println(text2);	
	            
		}   
		
	}

}
