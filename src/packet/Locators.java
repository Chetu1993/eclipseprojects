package packet;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/locatorspractice/");
//System.out.println(driver.getCurrentUrl("https://rahulshettyacademy/locatorspractice/"));
//System.out.println(driver.getPageSource());
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElement(By.id("inputUsername")).sendKeys("rahul");
driver.findElement(By.name("inputPassword")).sendKeys("helloworld");
driver.findElement(By.className("signInBtn")).click();
System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
driver.findElement(By.linkText("Forgot your password?")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("chetan");
driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("chetan@gmail.com");
driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("chetan1@gmail.com");
driver.findElement(By.cssSelector("input[Placeholder='Phone Number']")).sendKeys("4545412541");
driver.findElement(By.className("reset-pwd-btn")).click();
driver.findElement(By.className("go-to-login-btn")).click();
Thread.sleep(1000);
driver.findElement(By.id("inputUsername")).sendKeys("rahul");
driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
driver.findElement(By.id("chkboxOne")).click();
driver.findElement(By.className("submit")).click();
Thread.sleep(5000);
driver.findElement(By.className("logout-btn")).click();
	}

}
