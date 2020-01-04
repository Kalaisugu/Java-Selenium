package Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Leafground_Wait {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Maven\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leafground.com/");

		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Wait for Text Change").click();
		
		WebElement clickme = driver.findElementById("btn");
		
		String text2 = clickme.getText();
		
		WebDriverWait wait=new WebDriverWait(driver,5);
		
		wait.until(ExpectedConditions.textToBePresentInElement(clickme,"Click ME!"));
		
		clickme.click();
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		
		alert.accept();
		
		if(text.equals(text2))
		{
			System.out.println("Text Matched");
		}
		
		
}

}
