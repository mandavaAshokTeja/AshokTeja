package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyChoiceMyPlan {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\javaselenium\\LiveTech Selenium Software\\Browsers\\New 95 chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mavensoft.org/php4/mychoice");
		
		driver.manage().window().maximize();
        
		driver.findElement(By.xpath("//*[@id=\"tophead\"]/div/div/div/div[2]/a")).click();
		
		
		driver.findElement(By.id("erf_username")).sendKeys("teju1990");
		driver.findElement(By.id("erf_password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"post-1945\"]/div/div/div[2]/div/div[1]/form[1]/div[7]/div/button")).click();

	}

}

