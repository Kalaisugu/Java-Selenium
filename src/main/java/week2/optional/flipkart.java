package week2.optional;



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
		
		builder.moveToElement(Elec);
		
		//Thread.sleep(2000);
		
		WebElement mi = driver.findElementByXPath("//a[@title='Mi']");
		
		builder.click(mi).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
