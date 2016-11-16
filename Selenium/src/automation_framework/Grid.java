package automation_framework;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;





	public class Grid {

		public static void main(String[] args) throws MalformedURLException {
			// TODO Auto-generated method stub

			String node = "http://10.87.174.76:5555/wd/hub";
			DesiredCapabilities cap= DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			
			WebDriver driver = new RemoteWebDriver(new URL(node), cap);
			
			driver.get("http://qz.com/838168/narendra-modis-demonetisation-banks-will-ink-the-fingers-of-indians-exchanging-banned-currency-to-stop-them-from-visiting-twice/");
				
		}

	}


