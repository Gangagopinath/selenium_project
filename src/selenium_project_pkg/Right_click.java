package selenium_project_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganga\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 // launch the application under test
	/*	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		 // right click the button to launch right click menu option
		Actions rc = new Actions(driver);
		// find the element using locator and store into WebElement
		WebElement element = driver.findElement(By.className("context-menu-one btn btn-neutral"));
		rc.contextClick(element).perform();   */
		
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		// double click the button to launch right click menu option
		Actions dc = new Actions(driver);
		// find the element using locator and store into WebElement
		WebElement link = driver.findElement(By.id("doubleClickBtn"));
		dc.doubleClick(link).perform();
		
		//right click
		
		Actions rc = new Actions(driver);
		// find the element using locator and store into WebElement
		WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]"));
		rc.contextClick(element).perform();   
		
		//click
		 WebElement cc =driver.findElement(By.id("OmxW3"));	
		 cc.click();
		
		
		
		
		
	}

}
