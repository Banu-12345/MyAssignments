package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnanotherWaitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.leafground.com/waits.xhtml");
        WebElement invisible = driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
        invisible.click();
        String txt = driver.findElement(By.xpath("//span[text()='I am about to hide']")).getText();
        System.out.println(txt);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[text()='I am about to hide']"))));
        

	}

}
