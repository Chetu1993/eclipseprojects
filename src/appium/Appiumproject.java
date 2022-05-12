package appium;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Appiumproject {

	public static void main(String[] args) throws IOException, InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
String mypath=System.getProperty("user.dir");
HashMap<String, Object> chromeprefs=new HashMap<String, Object>();
chromeprefs.put("profile.default_content_settings.popups", 0);
chromeprefs.put("download_default_directory", mypath);
ChromeOptions options=new ChromeOptions();
options.setExperimentalOption("prefs", chromeprefs);
WebDriver driver=new ChromeDriver(options);
driver.get("https://www.ilovepdf.com/pdf_to_jpg");
driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
Thread.sleep(3000);
Runtime.getRuntime().exec("C:\\autoItfiles\\hellofile.exe");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@id='processTask']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
Thread.sleep(5000);
File fi=new File(mypath+"/ilovepdf_pages-to-jpg.zip");

if(fi.exists()) 
{System.out.println("file was found");}


if(fi.delete()) System.out.println("file is deleted");
}

}
	
	
	
