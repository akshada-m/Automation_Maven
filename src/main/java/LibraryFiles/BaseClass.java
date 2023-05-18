package LibraryFiles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public WebDriver driver;
	public void initialise_Browser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\24july_maven\\Browsers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(UtilityClass.GetDataFromPC("URL"));
		
	}
}
