import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FrameHandling {

	@Test
	public void framehandle() throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Javadoc")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("AcceptAlert")).click();
		
		
		
	}
		

	

}
