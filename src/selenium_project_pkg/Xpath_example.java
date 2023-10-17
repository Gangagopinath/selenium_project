package selenium_project_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganga\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		/*
		//absolute xpath
		WebElement searchbox=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		searchbox.sendKeys("watches for women");
		WebElement searchbutton = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
		searchbutton.click();
		WebElement searchboxx=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		searchboxx.clear();
		WebElement search=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		search.sendKeys("watches for Men");
		WebElement searchbuttonn = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
		searchbuttonn.click();  */

		/*// Relative xpath -copy
		WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchbox.sendKeys("watches for women");
		WebElement searchbutton = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		searchbutton.click();
		WebElement searchboxx=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchboxx.clear();
		WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("watches for Men");
		WebElement searchbuttonn = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		searchbuttonn.click();  */
		/*
		// Relative xpath -type
				WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				searchbox.sendKeys("watches for women");
				WebElement searchbutton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
				searchbutton.click();
				WebElement searchboxx=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				searchboxx.clear();
				WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				search.sendKeys("watches for Men");
				WebElement searchbuttonn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
				searchbuttonn.click();
			*/
		// xpath OR code
/*	
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='field-keywords']"));
		searchbox.sendKeys("watches for women");
		WebElement searchbutton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button' or @type='submit' ]"));
		searchbutton.click();
		WebElement searchboxx=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='field-keywords']"));
		searchboxx.clear();
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='field-keywords']"));
		search.sendKeys("watches for Men");
		WebElement searchbuttonn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button' or @type='submit']"));
		searchbuttonn.click();
		*/
	/*
		//xpath using and
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'  or @name='field-keywords']"));
		searchbox.sendKeys("watches for women");
		WebElement searchbutton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button' or @class='nav-input nav-progressive-attribute' ]"));
		searchbutton.click();
		WebElement searchboxx=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='field-keywords']"));
		searchboxx.clear();
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='field-keywords']"));
		search.sendKeys("watches for Men");
		WebElement searchbuttonn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button' or @class='nav-input nav-progressive-attribute']"));
		searchbuttonn.click();
		*/		
    
		 //  xpath
    /*      
		WebElement searchbox =driver.findElement(By.xpath(" //form[@id='nav-search-bar-form']//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("watches for women");
		
		
	*/
				
				

		// xapth with contains()
		/*
		WebElement searchbox=driver.findElement(By.xpath("//input[contains(@id,'twotabsearch')]"));
		searchbox.sendKeys("watches for women");	
		WebElement searchbutton = driver.findElement(By.xpath("//input[contains(@id,'submit-button')]"));
		searchbutton.click();
		WebElement searchboxx=driver.findElement(By.xpath("//input[contains(@id,'search')]"));
		searchboxx.clear();
		WebElement search=driver.findElement(By.xpath("//input[contains(@id,'tabsearch')]"));
		search.sendKeys("watches for Men");
		WebElement searchbuttonn = driver.findElement(By.xpath("//input[contains(@id,'nav-search')]"));
		searchbuttonn.click();		
	*/
		// xpath with starts-with
		
		WebElement searchbox =driver.findElement(By.xpath("//input[starts-with(@id,'two')]"));
		searchbox.sendKeys("watches for women");
		WebElement searchbutton = driver.findElement(By.xpath("//input[starts-with(@id,'nav')]"));
		searchbutton.click();
		WebElement  searchboxx =driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
		searchboxx.clear();
		WebElement search=driver.findElement(By.xpath("//input[starts-with(@id,'twotabs')]"));
		search.sendKeys("watches for Men");
		WebElement searchbuttonn = driver.findElement(By.xpath("//input[starts-with(@id,'nav-search')]"));
		searchbuttonn.click();
		
		
		
		
		
		
		
	}

}
