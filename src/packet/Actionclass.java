package packet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().fullscreen();
		Actions a=new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("a[class='nav-a nav-a-2 nav-progressive-attribute']"));
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("vegetable").doubleClick().build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("a[class='nav-a nav-a-2 nav-progressive-attribute']"))).build().perform();
a.moveToElement(move).build().perform();
a.moveToElement(move).contextClick().build().perform();
		
		
		
	}

}
