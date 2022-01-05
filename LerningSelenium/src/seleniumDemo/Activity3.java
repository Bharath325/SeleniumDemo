package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\testingSoftware\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Bharath");
		driver.findElement(By.name("LastName")).sendKeys("Kishore");
		driver.findElement(By.name("Email")).sendKeys("bk2@mailsac.com");
		driver.findElement(By.name("Password")).sendKeys("b12345k.com");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("b12345k.com");
		driver.findElement(By.id("register-button")).click();
	}

}
