package week4.classroom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {

		System.setProperty ("webdriver.chrome.driver","C:\\Selenium\\Maven\\Drivers\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

		//driver.manage().timeouts().implicitlyWait(5, s);

		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");

		driver.findElementByXPath("//button[.='Try it']").click();

		Alert alert = driver.switchTo().alert();

		alert.sendKeys("Kalaivani");

		alert.dismiss();

		//alert.dismiss();

		System.out.println(driver.findElementByXPath("//p[@id='demo']").getText());

		//driver.switchTo().defaultContent();















	}

}
