package packet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datesselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://path2usa.com/travel-companions");
		driver.findElement(By.name("travel_date")).click();
	

	
	driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[1]/th[2]")).click();
	List<WebElement>dates=driver.findElements(By.className("day"));

	int Dates=driver.findElements(By.className("day")).size();
		
		for(int i=0;i<Dates;i++) {
			
			String hello=driver.findElements(By.className("day")).get(i).getText();
			if(hello.equalsIgnoreCase("18")) {
				
				driver.findElements(By.className("day")).get(i).click();
				
				break;
			}
			
		}
		
		
		
		
		
	}

}
