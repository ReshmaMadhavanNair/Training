package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.WebDriverManager;

public class Loadingurl {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager objmanager=new WebDriverManager();
		driver=objmanager.launchBrowser();
		//test case for title verification
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Obsqura Testing"))
		{
			System.out.println("Testing passed");
		}
		else
		{
			System.out.println("Testing failed");
		}
		//test case for url verification
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("https://selenium.obsqurazone.com/index.php"))
		{
			System.out.println("url is working fine");
		}
		else
		{
			System.out.println("url loadingest failed");
		}
		driver.close();
		
	}

}
