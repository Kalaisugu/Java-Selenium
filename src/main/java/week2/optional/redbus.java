package week2.optional;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class redbus {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Maven\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		//Actions builder=new Actions (driver);
		
		WebElement from = driver.findElementByXPath("//input[@data-message='Please enter a source city']");
		
		from.sendKeys("Chennai",Keys.TAB);
		
		WebElement to = driver.findElementByXPath("//input[@data-message='Please enter a destination city']");
		
		to.sendKeys("Trichy",Keys.TAB);
		
		driver.findElementByXPath("//label[text()='Onward Date']").click();
		
		driver.findElementByXPath("//label[text()='Return Date']").click();
		
		driver.findElementByXPath("//input[@id='onward_cal']").sendKeys("05-Dec-2019");
	}

}
