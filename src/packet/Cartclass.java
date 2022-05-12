package packet;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cartclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
	String[] Myproducts = {"Brocolli","Cauliflower","Cucumber","Beetroot"};
	
	Thread.sleep(2000);
	
	addItems(driver, Myproducts);
	

	}
	
	
	
	
	
	public static void addItems(WebDriver driver, String[] Myproducts )
	{
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;
		for(int i=0;i<products.size();i++) {
			
			String[] name=products.get(i).getText().split("-");
			String MyVegetables=name[0].trim();
			
			List Hello=Arrays.asList(Myproducts);
			
			if(Hello.contains(MyVegetables)) {
				
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
			}
			
		}
		
		
		

	
	
	
	}
}
