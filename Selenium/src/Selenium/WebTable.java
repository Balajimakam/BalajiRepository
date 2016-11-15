package Selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebTable {

	static String Base_URL = "http://toolsqa.wpengine.com/automation-practice-table/";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("WebDriver.ie.driver", "C:\\A551684\\TAM\\Testing Softwares\\Selenium\\IEDriverServer.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(Base_URL);
		
		//OPerations of sample webtable
		
		String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(sCellValue);
		
		WebElement html_table =driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]"));
		
		//List rowcount = html_table.findElements(By.tagName("tr"));
		
		List<WebElement> columncount = html_table.findElements(By.tagName("td"));
		
		for(int i=0; i<=columncount.size(); i++)
		{
			driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[i]")).getText();
		}
		
		System.out.println(columncount.size());
		
		
	/*	// Here we are clicking on the link of first row and the last column
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
		System.out.println("Link has been clicked otherwise an exception would have thrown");
		driver.close();*/
		
	}

	

}
