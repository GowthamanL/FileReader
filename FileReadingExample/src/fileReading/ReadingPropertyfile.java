package fileReading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingPropertyfile {

	public static void main(String[] args) throws IOException {

		//  First of all we need to create a configuration file that consist of browser name and driver location

		FileInputStream stream=new FileInputStream("config.properties");

		Properties properties=new Properties();

		properties.load(stream);

		String browser=properties.getProperty("Browser");
		String driverLocation=properties.getProperty("DriverLocation");

		if(browser.equalsIgnoreCase("chrome"))
		{

			System.setProperty("webdriver.chrome.driver",driverLocation);
			WebDriver driver=new ChromeDriver();
			driver.get("www.google.com");

		}else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",driverLocation);
			WebDriver driver=new FirefoxDriver();
			driver.get("www.google.com");

		}

	}
}
