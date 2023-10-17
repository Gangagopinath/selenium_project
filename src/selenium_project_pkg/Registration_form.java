package selenium_project_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganga\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //create a new instance of the ChromDriver
		WebDriver driver= new ChromeDriver();
		//navigate to the demo application
		driver.navigate().to("https://qavbox.github.io/demo/signup/");
		//maximize the window
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[2]/input")) ;
		name.sendKeys("ganga gopinath");
		WebElement mail =driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[3]/input"));
		mail.sendKeys("gangagopi94@gmail.com");
		WebElement phone =driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[4]/input"));
		phone.sendKeys("123456798");
		WebElement exp  =driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[8]/input[1]"));
	    exp.click();
	    WebElement skill1 =driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[9]/input[1]"));
	    skill1.click();
	    WebElement skill2 =driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[9]/input[2]"));
	    skill2.click();
		Select dropdown = new Select(driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[7]/select")));
		dropdown.selectByVisibleText("Female");
		WebElement fax= driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[5]/input"));
		fax.sendKeys("12345");
		WebElement photo = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[6]/input"));
		photo.sendKeys("E:\\CERTIFICATES\\photo.jpg");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	   	
	}

}
