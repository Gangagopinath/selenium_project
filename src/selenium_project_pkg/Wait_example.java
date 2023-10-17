package selenium_project_pkg;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganga\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	 
	    WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("gangagopi94@gmail.com");
        email.sendKeys(Keys.RETURN);
        WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("123456"); 
		WebElement submit_button = driver.findElement(By.name("login"));
		submit_button.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]")));
		
		driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		
		
		

	} 

}
