package project;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class TFP {

		public static void main(String[] args) throws Throwable {
			
			System.setProperty("webdriver.chrome.driver", "F:\\javaselenium\\LiveTech Selenium Software\\Browsers\\New 95 chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://183.82.100.162:8082/");
			
			driver.manage().window().maximize();

			driver.findElement(By.xpath("//*[@id=\"ctl00_lblloginstatus\"]/a")).click();
			driver.findElement(By.id("ctl00_PageContent_txtUsername104")).sendKeys("tejaswini1122");
			driver.findElement(By.id("ctl00_PageContent_txtPassword106")).sendKeys("123456");
			driver.findElement(By.id("ctl00_PageContent_btnSave")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"ctl00_divPrograms\"]/div[4]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"ctl00_divPrograms\"]/div[5]")).click();
			
			Thread.sleep(5000);
			
			driver.close();
			driver.quit();
		}


}
