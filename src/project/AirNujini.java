package project;


	
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AirNujini {

			public static void main(String[] args) {
				
				System.setProperty("webdriver.chrome.driver","F:\\javaselenium\\LiveTech Selenium Software\\Browsers\\New 95 chrome\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://183.82.100.162:215");
				
				driver.manage().window().maximize();
		        driver.findElement(By.xpath("//*[@id=\"homepopup\"]/div/div/div/a/img")).click();
				driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div[3]/div/span/a")).click();
				
				
				
				driver.findElement(By.id("memberNum")).sendKeys("00100776922");
				driver.findElement(By.id("password")).sendKeys("Abcd@123");
				driver.findElement(By.name("submit")).click();


			}

	}
