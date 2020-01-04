package week2.optional;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Maven\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage() .window().maximize();
		
		driver.findElementByXPath("//button[text()='✕']").click();
		
		Actions builder=new Actions (driver);
		
		WebElement Elec = driver.findElementByXPath("//span[text()='Electronics']");
		
		builder.moveToElement(Elec).perform();
		
		driver.findElementByXPath("(//li[@class='_1KCOnI _3ZgIXy']//a)[1]").click();;
		
		//List<WebElement> count = driver.findElementsByXPath("//div[text()='Redmi 8 (Sapphire Blue, 64 GB)']");
		
		WebElement firstresult = driver.findElementByXPath("//div[text()='Redmi 8 (Sapphire Blue, 64 GB)']");
		
		System.out.println(firstresult.getText());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
