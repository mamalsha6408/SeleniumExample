package examples;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBase {

	public WebDriver setupDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo.DESKTOP-I0HH4JP\\eclipse-workspace\\SeleniumExamples\\src\\main\\resources\\drivers\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
				
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public void tearDown(WebDriver driver) {
		driver.close();
		driver.quit();
	}
	
}
