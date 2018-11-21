    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	 
	public class calendar_window {
		public static void main(String[] args) {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.makemytrip.com/");
		
			driver.manage().window().maximize();
			driver.findElement(By.id( "hp-widget__depart")).click();
			int count=0;
			String y ="//td[@data-year='2019' and @data-month='1']/a[text()='8']";
			String x ="//div[@class='dateFilter hasDatepicker']//span[text()='Next']";
			while(count<=24) {
				try {
					driver.findElement(By.xpath(y)).click();
					break;
				}catch(Throwable t) {
					driver.findElement(By.xpath(x)).click();
					count++;
				}
			}
			driver.close();

		}

	}

