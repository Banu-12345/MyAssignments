package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AUIExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("//iframe[@class='demo-frame']");
		//driver.switchTo().frame("//iframe[@class='demo-frame']");
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions builder=new Actions(driver);
		builder.dragAndDrop(src,dest).perform();

	}

}
