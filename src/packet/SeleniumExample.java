package packet;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/dropdownsPractise");	

	driver.findElement(By.id("autosuggest")).sendKeys("ind");
	Thread.sleep(2000);
	List<WebElement> options=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));

	for(WebElement option:options) {
		
	if(option.getText().equalsIgnoreCase("india")) {option.click(); break;}
		
		
	}
	
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.cssSelector("a[value='JLR']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@value='STV'])[2]")).click();
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
    
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(4000);
	for(int i=1;i<5;i++) {driver.findElement(By.id("hrefIncAdt")).click();}
	
	driver.findElement(By.id("btnclosepaxoption")).click();
		
	
    WebElement hello= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	
		Select dropdown=new Select(hello);
		dropdown.selectByIndex(3);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		
	
	
		
		
		
		
	}

}
