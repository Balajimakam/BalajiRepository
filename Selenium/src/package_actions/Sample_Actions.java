package package_actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample_Actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		Actions action = new Actions(driver);		
		driver.get("https://www.flipkart.com/");
		
		//WebElement li = driver.findElement(By.xpath("//div[@id='container']/div/header/div[2]/div/ul/li/a/span"));
		
		/*for(WebElement liwe: li)
		{
			li.
		}*/
		WebElement elec = driver.findElement(By.xpath("//div[@id='container']/div/header/div[2]/div/ul/li/a/span"));	
		System.out.println(elec.getText());
		/*action.moveToElement(elec);
		
		
		
		WebElement mobiles = driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[1]/a/span[1]"));		
		action.moveToElement(mobiles);

		action.click().build().perform();*/
		
	}

}
