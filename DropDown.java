package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		WebElement droplist = driver.findElement(By.className("ui-selectonemenu"));
		Select drop=new Select(droplist);
	drop.selectByVisibleText("Selenium");
	String title=driver.getTitle();
	System.out.println(title);
	if(title.contains("Select"))
	{
		System.out.println("Automationes has selcted the drop down");
	}
	else
		System.out.println("automation does not selected the drop down");
	}

}
