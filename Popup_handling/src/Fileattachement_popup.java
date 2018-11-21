import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileattachement_popup {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timesjobs.com/candidate/register.html");
		Actions act = new Actions(driver);
		for(int i=0;i<9;i++) {
			act.sendKeys(Keys.TAB).perform();
		}
        act.sendKeys(Keys.ENTER).perform();
		
        Thread.sleep(4000);
        Runtime.getRuntime().exec("C:\\Users\\Arvind\\Desktop\\Autoitcode.exe");
	}

}
