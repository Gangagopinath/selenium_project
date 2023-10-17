package selenium_project_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actual_tittle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganga\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		
		String Title = driver.getTitle();
		System.out.println(Title);
	}

}
