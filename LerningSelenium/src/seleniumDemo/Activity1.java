package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\testingSoftware\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());

		String expectedurl = "http://demowebshop.tricentis.com/login";
		String actualurl = driver.getCurrentUrl();

		System.out.println(actualurl);

		if (actualurl.equals(expectedurl)) {
			System.out.println("You are on the right page");
		}

		else {
			System.out.println("You are on the wrong page");
		}

		System.out.println(driver.getPageSource().length());

		driver.close();
	}

}
