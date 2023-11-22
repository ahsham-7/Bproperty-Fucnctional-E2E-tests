package E2EProject.Bproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class base {
	public WebDriver driver;
	public WebDriver InitializeDriver() throws IOException {
		Properties property = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ahsham.khan\\eclipse-workspace\\Bproperty\\src\\main\\java\\E2EProject\\Bproperty\\data.properties");
		property.load(fis);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahsham.khan\\Downloads\\Downloads\\chromedriver.exe");
		 driver =  new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-rent/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}


}
