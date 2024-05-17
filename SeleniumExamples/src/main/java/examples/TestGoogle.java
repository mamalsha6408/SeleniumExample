package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TestGoogle {
	public static void main(String[] args) {
		
		SeleniumBase base=new SeleniumBase();
		
		WebDriver driver=base.setupDriver();
		
		driver.navigate().to("https://www.google.lk/");

		driver.findElement(By.name("q")).sendKeys("Hello World");

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		System.out.println(driver.getPageSource().contains("Hello World"));
		
		base.tearDown(driver);
		
		
		
	}
}
