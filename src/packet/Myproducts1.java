package packet;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myproducts1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	WebDriverWait a =new WebDriverWait(driver,5);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
		String[] Myvegetables={"Brocolli","Cauliflower","Cucumber","Beetroot"};
		
		Thread.sleep(3000);
myItems(driver, Myvegetables);

driver.findElement(By.cssSelector("a.cart-icon")).click();
driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
a.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode")));
driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
driver.findElement(By.cssSelector("button.promoBtn")).click();
a.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());


	}	
		public static void myItems(WebDriver driver, String[] Myvegetables) {
			
			List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
			int j=0;
			for(int i=0; i<products.size(); i++) {
				
				List itemsneeded=Arrays.asList(Myvegetables);
				
				String[] name=products.get(i).getText().split("-");
				String Vegetables=name[0].trim();
				j++;
				if(itemsneeded.contains(Vegetables)) {
					
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					
					
				}
				
				
				
				
			}
			
			
			
			
			
		}

		
		
		
		
		
		
		
		
		
		}

	
		
		

