package packet;

import java.beans.JavaBean;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.helpers.Util;

public class Footersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
System.out.println(footerdriver.findElements(By.tagName("a")).size());	

WebElement subfooter=footerdriver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
System.out.println(subfooter.findElements(By.tagName("a")).size());

for(int i=1;i<subfooter.findElements(By.tagName("a")).size();i++ ) {
	
	String Clickonlink1=Keys.chord(Keys.CONTROL,Keys.ENTER);
	subfooter.findElements(By.tagName("a")).get(i).sendKeys(Clickonlink1);
	
}
Set<String>windows1=driver.getWindowHandles();
java.util.Iterator<String>it1=windows1.iterator();
while(it1.hasNext()) {
	
	driver.switchTo().window(it1.next());
	System.out.println(driver.getTitle());
}

WebElement secondfooterdriver=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul"));
System.out.println(secondfooterdriver.findElements(By.tagName("a")).size());

for(int j=1;j<secondfooterdriver.findElements(By.tagName("a")).size();j++ ) {
	
	String Clickonlink2=Keys.chord(Keys.CONTROL, Keys.ENTER);
	secondfooterdriver.findElements(By.tagName("a")).get(j).sendKeys(Clickonlink2);
}

Set<String>windows2=driver.getWindowHandles();
java.util.Iterator<String>it2=windows2.iterator();
while(it2.hasNext()) {
	
	driver.switchTo().window(it2.next());
	System.out.println(driver.getTitle());
}

WebElement thirdfooterdriver=driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr/td[3]/ul"));
System.out.println(thirdfooterdriver.findElements(By.tagName("a")).size());

for(int k=1; k<thirdfooterdriver.findElements(By.tagName("a")).size();k++) {
	
	String Clickonlink3=Keys.chord(Keys.CONTROL,Keys.ENTER);
	thirdfooterdriver.findElements(By.tagName("a")).get(k).sendKeys(Clickonlink3);
	
}
Set<String>windows3=driver.getWindowHandles();
java.util.Iterator<String>it3=windows3.iterator();
while(it3.hasNext()) {
	
	driver.switchTo().window(it3.next());
	System.out.println(driver.getTitle());
	
}

WebElement fourthfootersection=driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr/td[4]/ul"));
System.out.println(fourthfootersection.findElements(By.xpath("a")).size());

for(int l=1; l<footerdriver.findElements(By.tagName("a")).size();l++) {
	
	String Clickonlink4 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	
	footerdriver.findElements(By.tagName("a")).get(l).sendKeys(Clickonlink4);
	
}
	Set<String> windows=driver.getWindowHandles();
java.util.Iterator<String>it=windows.iterator();
while(it.hasNext()) {
	
	driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());
	
	
	
}
	
	
	
	
	
	
	
		
	}}