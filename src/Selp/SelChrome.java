package Selp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelChrome {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\a889346\\Desktop\\Sel\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
	driver.get("www.google.com");
	System.out.println("1");
	driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
	System.out.println("2");
}
}