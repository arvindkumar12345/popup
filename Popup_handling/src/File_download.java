import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class File_download {

	public static void main(String[] args) {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.dir", "E:\\");
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("https://maven.apache.org/download.cgi");
		driver.findElement(By.linkText("apache-maven-3.5.4-bin.zip")).click();

	}

}
