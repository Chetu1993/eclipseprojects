package packet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//a[@value='BLR'] //a[@value='HBX']
		WebDriver driver=new ChromeDriver();
		driver.get("https://testproject.io/");
		driver.findElement(By.xpath("//a[@title='Platform']")).click();
		
		driver.findElement(By.xpath("//ul[@class='inner-menu']//a[normalize-space()='Mobile Test Recorder']")).click();
	
		
		
	}

}
