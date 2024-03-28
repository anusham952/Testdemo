import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Selintroduction {

	public static void main(String[] args) throws InterruptedException {
		
		// Invoking Browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anusha\\Documents\\chromedriver.exe");
		//Firefox driver is not working for me
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anusha\\Documents\\geckodriver.exe");
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anusha\\Documents\\chromedriver.exe");		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		//System.out.println(driver.getTitle());	
		//System.out.println(driver.getCurrentUrl());
		//driver.quit();
		driver.findElement(By.id("inputUsername")).sendKeys("anusha");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("anu@notebook.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.cssSelector("reset-pwd-btn")).click();
		driver.findElement(By.cssSelector("form p")).getText();
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		
	
	}

}
