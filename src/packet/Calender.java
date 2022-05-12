package packet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise");
	//driver.findElement(By.)
	driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.cssSelector("a[value='BLR']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	
	
	}
	
	

}
