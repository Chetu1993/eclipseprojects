package packet;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
driver.findElement(By.cssSelector("a.blinkingText")).click();
Set <String> windows=driver.getWindowHandles();		
java.util.Iterator<String> it=windows.iterator();
 String parentId=it.next();
 String childId=it.next();
 driver.switchTo().window(childId);
 driver.switchTo().window(parentId);
 driver.findElement(By.id("username")).sendKeys("mentor@rahulshettyacademy.com");
 

		
		
		
		
	}

}
