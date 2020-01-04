package day3.classrom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class createlead {
	
	@Test
	
	public void create() {

		// Set the property for ChromeDriver
           System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Maven\\Drivers\\chromedriver.exe");
           
		// Initiate the ChromeBroswer
          ChromeDriver driver=new ChromeDriver();

		// Maximize the browser
          driver.get("http://leaftaps.com/opentaps/control/main");
          
          driver.manage().window().maximize();
          
        // Enter the UserName
          WebElement username = driver.findElementById("username");
          username.sendKeys("DemoSalesManager");

		// Enter the Password
          driver.findElementById("password").sendKeys("crmsfa");

		// Click on Login Button
          driver.findElementByClassName("decorativeSubmit").click();

		// Click on crm/sfa button
          driver.findElementByLinkText("CRM/SFA").click();
          
          

		// Click on Leads
          
          driver.findElementByLinkText("Leads").click();
          
          driver.findElementByLinkText("Find Leads").click();
          
          driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Sanmitha");
          
          driver.findElementByXPath("//button[text()='Find Leads']").click();
          
          List<WebElement> elements = driver.findElementsByXPath("(//div[@class='x-grid3-row x-grid3-row-alt'])[1]");
          
          for (WebElement webElement : elements) {
        	  
        	  String text = webElement.getText();
        	  
        	  System.out.println(text);
			
		}
          System.out.println(elements);
          
          

		// Click on Create Lead button
          driver.findElementByLinkText("Create Lead").click();

		// Enter Company Name
          driver.findElementById("createLeadForm_companyName").sendKeys("TeastLeaf");

		// Enter First Name
           driver.findElementById("createLeadForm_firstName").sendKeys("Kalaivani");
		// Enter Last Name
            driver.findElementById("createLeadForm_lastName").sendKeys("Sugumar");
		// Click on Create Lead (Submit) button
            
            driver.findElementByName("submitButton").click();

		// Verify the Lead is created by checking the Company or First Name
            
            

	}

}


