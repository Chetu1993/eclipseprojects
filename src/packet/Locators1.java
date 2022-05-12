package packet;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\cks_1\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	//System.setProperty("webdriver.edge.driver","C:\\Users\\cks_1\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new EdgeDriver();
		//driver.get("https://ox.ac.uk");
		
		WebDriver driver= new ChromeDriver();
		String name="chetan";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
	Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
         Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");
         
   
				}

}
