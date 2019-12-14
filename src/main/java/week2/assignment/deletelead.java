package week2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class deletelead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Maven\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
	       
	       driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
	 
	       driver.findElementByClassName("decorativeSubmit").click();
	       
	       driver.findElementByLinkText("CRM/SFA").click();
	       
	       driver.findElementByXPath("//a[text()='Leads']").click();
	       
	       driver.findElementByXPath("//a[text()='Find Leads']").click();
	       
	       driver.findElementByXPath("//span[text()='Phone']").click();
	       
	       driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9500637769");
	       
	       driver.findElementByXPath("//button[text()='Find Leads']").click();
		
	}

}
