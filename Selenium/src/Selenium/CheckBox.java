package Selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	static String Base_URL = "http://toolsqa.wpengine.com/automation-practice-form/";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(Base_URL);
		List<WebElement> l1 = driver.findElements(By.name("profession"));
		
		int chk_total = l1.size();
		
		try
		{
		for(int i=0; i<=chk_total; i++)
		{
			if(l1.get(i).isEnabled())
			{
				l1.get(i).click();
				System.out.println(l1.get(i).getAttribute("value") + ": is selected");
			}
			else
			{
				break;
			}
		}
		}catch(IndexOutOfBoundsException e){System.out.println(e);};
		
		
	
	}

}
