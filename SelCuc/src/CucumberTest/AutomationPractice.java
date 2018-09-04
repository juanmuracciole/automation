package CucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class AutomationPractice {

	public static void main(String[] args) {
		
		String exePath = "C:\\Users\\l0611573\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		

		
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		driver.findElement(By.cssSelector(".sf-menu > li:nth-child(1) > a:nth-child(1)")).click();
		//driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")).Click();
		
		driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("Women");
		
		
	}

}
