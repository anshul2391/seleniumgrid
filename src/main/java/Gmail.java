import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		

	}

}
