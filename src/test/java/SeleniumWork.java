import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWork {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setUp() {
		
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@Test
	public void testdata() throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");
		System.out.println(driver.getTitle());
		Actions ac = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("")
		
		driver.findElement(By.id("currentAddress")).sendKeys("adding the data in current address");
		
		ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		ac.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		driver.findElement(By.id("subjectsContainer")).click();
		ac.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}
