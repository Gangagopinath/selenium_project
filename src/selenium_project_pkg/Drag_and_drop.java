package selenium_project_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganga\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		 
		driver.switchTo().frame(0);
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		Actions ac = new Actions(driver);
		ac.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		

	}

}
