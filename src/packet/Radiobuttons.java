package packet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise");
//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
