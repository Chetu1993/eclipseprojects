package packet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Jarclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\cks_1\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	//	System.setProperty("webdriver.edge.driver", "C:\\Users\\cks_1\\Downloads\\edgedriver_win64\\edgedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new EdgeDriver();
		
		driver.get("https://ox.ac.uk");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		
		
		
		
		
		
		
		
	}

}
