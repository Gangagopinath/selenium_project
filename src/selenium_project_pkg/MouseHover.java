package selenium_project_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganga\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.browserstack.com/");
		//driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		WebElement live = driver.findElement(By.xpath("/html/body/div[2]/main/section/article/section/div[1]/div/div/div/article[1]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/a"));
		ac.moveToElement(live).build().perform();
		
		WebElement appautomate = driver.findElement(By.xpath("/html/body/div[2]/main/section/article/section/div[1]/div/div/div/article[1]/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/a"));
		appautomate.click();
		
		
		
		 

	}

}
