package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Screenshot {

	@Test
	 public void TestJavaS1()
	{
	// Open Firefox
	 WebDriver driver=new FirefoxDriver();
	 
	// Maximize the window
	driver.manage().window().maximize();
	 
	// Pass the url
	driver.get("http://www.google.com");
	 
	Screenshot.ScreenshotCpature(driver);
}
	public static void ScreenshotCpature(WebDriver driver)
	{
		// Take screenshot and store as a file format
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:/selenium/"+System.currentTimeMillis()+".png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }

	}
	
}
