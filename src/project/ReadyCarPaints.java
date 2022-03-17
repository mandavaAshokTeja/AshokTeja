package project;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ReadyCarPaints {

		public static void main(String[] args) { 
			
			System.setProperty(".chrome.driver", "F:\\javaselenium\\LiveTech Selenium Software\\Browsers\\New 95 chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://52.172.163.181:9000/");
			
			driver.manage().window().maximize();

			driver.findElement(By.id("login-title-955644")).click();
			
			driver.findElement(By.id("user_login")).sendKeys("tejaswini1122");
			driver.findElement(By.id("user_pass")).sendKeys("123456");
			driver.findElement(By.id("wp-submit")).click();
			
			
			
			driver.findElement(By.id("user_login")).sendKeys("pradeep.p@mavensoft.com");
			driver.findElement(By.id("user_pass")).sendKeys("Reset@123");
			driver.findElement(By.id("wp-submit")).click();
			

		}

	}
