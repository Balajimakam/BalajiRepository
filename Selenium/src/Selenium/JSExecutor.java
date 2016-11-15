package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class JSExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String URl ="http://www.softwaretestinghelp.com/katalon-studio-to-solve-web-ui-test-automation-problems/";
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(URl);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0, 300)", "");
		
		
	}

}
