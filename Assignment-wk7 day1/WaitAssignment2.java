package week7.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


public class WaitAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.leafground.com/waits.xhtml");
        WebElement ele= driver.findElement(By.xpath("//span[text()='Click First Button']"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        ele.click();
        WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ele2= driver.findElement(By.xpath("//p[text()='Message Content']"));
        wait2.until(ExpectedConditions.visibilityOf(ele2));
        String msg= driver.findElement(By.xpath("//p[text()='Message Content']")).getText();
        System.out.println(msg);
	}

}
