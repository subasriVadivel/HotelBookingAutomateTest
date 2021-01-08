package AutomationTest.HotelBooking;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class globalDriver {

	public static WebDriver driver;
	public  WebDriver initializeDriver() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream FI=new FileInputStream("E:\\HotelBooking\\HotelBooking\\src\\test\\java\\AutomationTest\\HotelBooking\\CaseStudyHotelBooking.java");
		prop.load(FI);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\libs\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "E:\\Selenium\\libs\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	}
