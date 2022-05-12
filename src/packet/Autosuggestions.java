package packet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise");
driver.findElement(By.id("autosuggest")).sendKeys("aus");
Thread.sleep(2000);
List<WebElement>options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

for(WebElement option: options) {
	
	if(option.getText().equalsIgnoreCase("Australia")) {option.click(); 
	break;
		}
	
}


	}
	

}
