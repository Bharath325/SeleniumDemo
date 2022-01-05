package activityWed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Activity1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\testingSoftware\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
		Thread.sleep(500);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		Thread.sleep(500);
		driver.findElement(By.linkText("Alert with Textbox")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\'Textbox\']/button")).click();
		driver.switchTo().alert().sendKeys("Bharath");
		driver.switchTo().alert().accept();

	}

}
