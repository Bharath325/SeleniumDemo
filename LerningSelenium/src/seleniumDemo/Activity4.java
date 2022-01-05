package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\testingSoftware\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement year = driver.findElement(By.xpath("//select[@placeholder='Year']"));
		Select yr = new Select(year);
		yr.selectByValue("1998");

		WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select d = new Select(day);
		d.selectByVisibleText("28");

	}

}
