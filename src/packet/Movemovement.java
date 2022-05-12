package packet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movemovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable");
		//driver.get("https://amazon.in");
		Actions a =new Actions(driver);
		driver.switchTo().frame(0);
		
//a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
//a.moveToElement(driver.findElement(By.xpath("//span[@class='nav-text'][normalize-space()='Your Wish List']"))).click().build().perform();

WebElement source=driver.findElement(By.id("draggable"));
WebElement target=driver.findElement(By.id("droppable"));
a.dragAndDrop(source,target).build().perform();
driver.switchTo().defaultContent();

driver.findElement(By.linkText("Demos")).click();
	
	
	
	}

}
