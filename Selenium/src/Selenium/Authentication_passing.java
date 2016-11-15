package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Authentication_passing {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\A551684\\TAM\\Testing Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String JBPM = "http://" + "ww930\\A551684" + ":" + "Lenova@@2016!" + "@" + "source.myatos.net";
		driver.get(JBPM);
	}

}
