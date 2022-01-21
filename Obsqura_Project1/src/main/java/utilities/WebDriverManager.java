package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
	public WebDriver launchBrowser() throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);//1 sec wait
		return driver;
	}
}
