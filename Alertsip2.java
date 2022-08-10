package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertsip2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
	WebElement a1=driver.findElement(By.xpath("//*[@id=\"prompt\"]"));
	a1.click();
		Alert a2=driver.switchTo().alert();
		a2.sendKeys("yugandhar");
		//Thread.sleep(3000);
		a2.accept();

	}

}
