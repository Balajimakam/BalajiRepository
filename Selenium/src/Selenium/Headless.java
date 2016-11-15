package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new HtmlUnitDriver();
		
		HtmlUnitDriver driv = new HtmlUnitDriver();
		
		driv.setJavascriptEnabled(true);
		
		driver.get("http://newtours.demoaut.com/");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
