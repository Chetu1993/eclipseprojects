package packet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Autosuggestivedropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
	
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
	
		for(WebElement option: options) {
			
			if(option.getText().equalsIgnoreCase("india")) {option.click();
			break;}
			
		}
		//driver.findElement(By.xpath("//li[@id='ui-id-110']")).sendKeys("BANGALORE CITY JN | SBC");
		//driver.findElement(By.xpath("//input[@placeholder='Boarding To']")).click();
		//driver.findElement(By.xpath("")).click();
		
		
		
		
		
	}

}
