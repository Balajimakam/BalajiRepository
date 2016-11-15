package automation_framework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG {
	public WebDriver driver;
 
	//Before Test Annotation
  @BeforeTest
  public void beforetest() {
	  
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	  
	  
  }
  
  @Test
  public void main() {
	 /* WebElement userName = driver.findElement(By.name("userName"));
	  userName.sendKeys("AAA");
	  
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("aaa");
	  
	  WebElement login = driver.findElement(By.name("login"));
	  login.click();*/
	  
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
		}catch(IndexOutOfBoundsException e){System.out.println(e);}
	  
  }

  @AfterTest
  public void afterTest() {
	// driver.close();
	  driver.quit();
  }

}
