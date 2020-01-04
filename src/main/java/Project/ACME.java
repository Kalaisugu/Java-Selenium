package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ACME {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Maven\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://acme-test.uipath.com/account/login");

		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='email']").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("leaf@12");
		
		driver.findElementByXPath("//button[@id='buttonLogin']").click();
		
		Actions builder=new Actions(driver);
		
		WebElement vendors = driver.findElement(By.xpath("//button[text()[contains(.,'Vendors')]]"));
		
		builder.moveToElement(vendors);
		
		Thread.sleep(2000);
		
		WebElement search = driver.findElementByLinkText("Search for Vendor");
		
		builder.moveToElement(search);
		
		
		
		
		
		
	
		
		
		
		
		
	}

}
