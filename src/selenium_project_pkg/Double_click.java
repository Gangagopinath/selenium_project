package selenium_project_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganga\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 // launch the application under test
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		 // right click the button to launch right click menu option
		Actions press = new Actions(driver);
		
		 WebElement link = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		 press.doubleClick(link).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
