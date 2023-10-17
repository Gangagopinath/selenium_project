package selenium_project_pkg;

import java.sql.Date;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_time {

	private static final String CurrentDateTime = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganga\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		//current  date and time 
	/*	Calendar calendar_Date_Time = Calendar.getInstance();
		java.util.Date currentDateTime = calendar_Date_Time.getTime();
		System.out.println(currentDateTime);
		driver.close(); */
		
		//future date and time
	/*	Calendar calendar_Date_Time = Calendar.getInstance();
		calendar_Date_Time.add(Calendar.DAY_OF_YEAR,10);
		java.util.Date futureDateTime = calendar_Date_Time.getTime();
        System.out.println(futureDateTime);
        driver.close();  */
		 
		// past Date and Time
		Calendar calendar_Date_Time= Calendar.getInstance();
		calendar_Date_Time.add(Calendar.DAY_OF_YEAR,-10);
		java.util.Date pastDateTime = calendar_Date_Time.getTime();
        System.out.println(pastDateTime);
        driver.close(); 
	
		

	}

}
