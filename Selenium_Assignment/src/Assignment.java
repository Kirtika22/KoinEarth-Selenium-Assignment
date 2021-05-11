import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  
public class Assignment {
	   public static void main(String[] args) throws InterruptedException {  
	        
		    System.setProperty("webdriver.chrome.driver", "D:\\KoinEarth Assignment\\ChromeDriver\\chromedriver.exe");  
		    WebDriver driver=new ChromeDriver();  
		    
		    driver.get("https://www.makemytrip.com/");
		    driver.manage().window().maximize();
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    Thread.sleep(2000);
		    WebElement farecalenderbutton = driver.findElement(By.xpath("//a[contains(text(),'EXPLORE FARE CALENDAR')]"));
		    farecalenderbutton.click();
		    driver.findElement(By.xpath("(//div[@class='selectDropdown make_relative'])[2]")).click();
		    
		    driver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys("Chennai");
		    Thread.sleep(1000);

		    driver.findElement(By.xpath("//li[@role='option']//p//span[contains(text(),'Chennai')]")).click();
		    
		    
		    Thread.sleep(1000);
		    
		   WebElement tocity = driver.findElement(By.xpath("//input[@placeholder='Enter City']"));
		   
		   	tocity.sendKeys("Mumbai");
		    Thread.sleep(1000);

		    driver.findElement(By.xpath("//li[@role='option']//p//span[contains(text(),'Mumbai')]")).click();
		    
		    driver.findElement(By.xpath("//li[contains(text(),'May, 2021')]")).click();
		    driver.findElement(By.xpath(" //button[@class=' primaryBtn  hsw_searchButton']")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("(//div[@class='bestFareCal']//div[@class='bestFareCalList   cheapestDate']//p[contains(text(),'23')])[1] ")).click();
		    Thread.sleep(1000);

		    WebElement Viewprices_button = driver.findElement(By.xpath("(//button[@class='ViewFareBtn  text-uppercase '])[4]"));
		    js.executeScript("arguments[0].scrollIntoView();",Viewprices_button );	
		    Thread.sleep(1000);

		    Viewprices_button.click();

		    
		    driver.findElement(By.xpath("(//button[@class='btn fli_primary_btn text-uppercase '])[7]")).click();
		    driver.quit();
	   }
}
