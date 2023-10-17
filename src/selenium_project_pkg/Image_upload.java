package selenium_project_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image_upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganga\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     	WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://qavbox.github.io/demo/signup//");
		driver.manage().window().maximize();
		WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"container\"]/div[6]/input"));
		fileInput.sendKeys("E:\\CERTIFICATES\\photo.jpg");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
