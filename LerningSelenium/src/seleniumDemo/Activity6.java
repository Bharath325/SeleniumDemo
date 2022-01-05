package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\testingSoftware\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Selenium");
		new Actions(driver).sendKeys(Keys.ENTER).perform();

	}

}
