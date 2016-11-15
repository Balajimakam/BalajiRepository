package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		WebElement drp= driver.findElement(By.name("continents"));
		
		Select s = new Select(drp);
		
		s.selectByIndex(2);
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		driver.close();
		//driver.quit();
		
		
	}

}
