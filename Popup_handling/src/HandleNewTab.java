import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleNewTab {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath( "//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Apple iPhone SE (Space Grey, 32 GB)']")).click();
		Set<String> s =driver.getWindowHandles();
		Iterator<String> i =s.iterator();
		String parentsessionid =i.next();
		String childsessionid = i.next();
		driver.switchTo().window(childsessionid);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(10,2000)");
		driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
		driver.close();
		driver.switchTo().window(parentsessionid);
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("nokia",Keys.ENTER);
		driver.close();
		
	}

}
