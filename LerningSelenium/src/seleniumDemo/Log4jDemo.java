package seleniumDemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Log4jDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = Logger.getLogger(Log4jDemo.class);
		PropertyConfigurator.configure("resources\\log4j.properties");

		System.setProperty("webdriver.edge.driver", "C:\\testingSoftware\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		log.info("Browser Open");
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		log.info("Application opened");

		String expectedtitle = "Demo Web Shop. Login";
		String actualtitle = driver.getTitle();

		if (actualtitle.equals(expectedtitle)) {
			log.info("Corret page opened");
			driver.findElement(By.id("Email")).sendKeys("bk@mailsac.com");
			driver.findElement(By.id("Password")).sendKeys("b1234k");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();

			String expected = "Demo Web Shop";
			if (driver.getTitle().equals(expected)) {
				log.info("Login successful");
				driver.findElement(By.linkText("Log out")).click();
				log.info("Logged out successfully");
				driver.close();
			}

			else {
				log.error("Wrong credentials");
				driver.close();
			}

		} else {
			log.error("Wrong page");
			driver.close();
		}
	}
}
