package packet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	   driver.get("https://rahulshettyacademy.com/dropdownsPractise");
	    System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.id("divpaxinfo")).click();
	    Thread.sleep(4000);
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	    
	
	    
	    for(int i=1; i<8; i++){driver.findElement(By.id("hrefIncAdt")).click();}
	    
	    driver.findElement(By.id("btnclosepaxoption")).click();
	   
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	    
	}

}
