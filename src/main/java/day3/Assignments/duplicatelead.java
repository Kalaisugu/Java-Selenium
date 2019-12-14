package day3.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class duplicatelead {
	
	public static void main(String[] args)
	
	{
		System.setProperty ("webdriver.chrome.driver","C:\\Selenium\\Maven\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		 WebElement username = driver.findElementById("username");
         username.sendKeys("DemoSalesManager");

		// Enter the Password
         driver.findElementById("password").sendKeys("crmsfa");

		// Click on Login Button
         driver.findElementByClassName("decorativeSubmit").click();

		// Click on crm/sfa button
         driver.findElementByLinkText("CRM/SFA").click();
         
         driver.findElementByLinkText("Leads").click();
         
         driver.findElementByXPath("//a[text()='Find Leads']").click();
         
         driver.findElementByXPath("(//a[@class='x-tab-right'])[3]").click();
         
         driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("kalaijanu14@gmal.com");
         
         driver.findElementByXPath("//button[text()='Find Leads']").click();
         
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
        
        
			
		}
         
         
         
         
        
		
		
	}


