package packet;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCartClass {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		int j=0;
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
	String[] Myvegetables= {"Brocolli","Cauliflower","Cucumber","Beetroot"};
	Thread.sleep(2000);
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

	for(int i=0; i<products.size(); i++) {
		
		List itemsneeded= Arrays.asList(Myvegetables);
		
		String[] name=products.get(i).getText().split("-");
		String formattedName=name[0].trim();
		
		if(itemsneeded.contains(formattedName)) {

		j++;
		Thread.sleep(2000);
		for(int k=1; k<3;k++)
		{driver.findElements(By.xpath("//input[@type='number']")).get(i).click();
		driver.findElements(By.xpath("//a[@class='increment']")).get(i).click();}
		
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
}	
	}
		
		
	}}


