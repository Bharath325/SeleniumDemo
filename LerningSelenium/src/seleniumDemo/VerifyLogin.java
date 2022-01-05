package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifyLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\testingSoftware\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		String expectedtitle = "Demo Web Shop. Login";
		String actualtitle = driver.getTitle();

		System.out.println(actualtitle);
		if (actualtitle.equals(expectedtitle)) {
			System.out.println("On right page.");
			WebElement user = driver.findElement(By.id("Email"));
			user.sendKeys("bk@mailsac.com");
			WebElement pass = driver.findElement(By.id("Password"));
			pass.sendKeys("b1234k");
			driver.findElement(By.id("RememberMe")).click();

//		driver.findElement(By.className("login-button")).click();

			driver.findElement(By.xpath("//input[@value='Log in']")).click();

			driver.findElement(By.linkText("Log out")).click();
			driver.close();
		} else {
			System.out.println("On wrong page. Title didn't match");
			driver.close();
		}
	}

}
