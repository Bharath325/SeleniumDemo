package seleniumDemo;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerificationRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\testingSoftware\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Bharath");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Kishore");
//		driver.findElement(By.xpath("")).sendKeys("bk@mailsac.com");
//		driver.findElement(By.xpath("")).sendKeys("9419144444");
		driver.findElement(By.xpath("//input[@name='radiooptions' and @value='Male']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));

		Select mth = new Select(month);
		List<WebElement> mths = mth.getOptions();
		System.err.println(mths.size());

		List<String> allMonths = mths.stream().map(WebElement::getText).collect(Collectors.toList());
		for (String mon : allMonths) {
			System.out.println(mon);
		}
		mth.selectByValue("May");

		driver.close();
	}

}
