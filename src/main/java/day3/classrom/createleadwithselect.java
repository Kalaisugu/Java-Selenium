package day3.classrom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class createleadwithselect {
	
	public static void main(String[] args) {

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

		// Click on Create Lead button
       
       driver.findElementByLinkText("Create Lead").click();

		// Enter Company Name
       
       driver.findElementById("createLeadForm_companyName").sendKeys("TeastLeaf");

		// Enter First Name
       
        driver.findElementById("createLeadForm_firstName").sendKeys("Kalaivani");
        
		// Enter Last Name
        
         driver.findElementById("createLeadForm_lastName").sendKeys("Sugumar");
         
        
         // Select 'Source' as 'Other' (Handling DropDown)
         
         WebElement Dropdown1 = driver.findElementById("createLeadForm_dataSourceId");
         
         Select dd1=new Select(Dropdown1);
         
         dd1.selectByValue("LEAD_EMPLOYEE");

		// Select 'Preferred Currency' as 'INR'
         
         WebElement Dropdown2 = driver.findElementByName("currencyUomId");
         
         Select dd2=new Select (Dropdown2);
         
         List<WebElement> options = dd2.getOptions();
         
        int length=options.size();
        
        dd2.selectByIndex(length-1);
        
        // // Select 'Marketing Camapign
         
        WebElement Dropdown3 = driver.findElementById("createLeadForm_marketingCampaignId");
        
        Select dd3=new Select(Dropdown3);
        
        dd3.selectByValue("9002");
        
     // // Select Industry
        
        WebElement Dropdown4 = driver.findElementByName("industryEnumId");
        
        Select dd4=new Select(Dropdown4);
        
        dd4.selectByVisibleText("Health Care");
      
     // // Select Owner
        
        WebElement Dropdown5 = driver.findElementById("createLeadForm_ownershipEnumId");
        
        Select dd5=new Select(Dropdown5);
        
        List<WebElement> options2 = dd5.getOptions();
        
        int option2=options2.size();
        
        dd5.selectByIndex(4);
        
        
        // // Select province 
        
          WebElement Dropdown8 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
           
        Select dd8=new Select(Dropdown8);
          
          dd8.selectByVisibleText("BIHAR");     
        
        
        WebElement Dropdown7 = driver.findElementById("createLeadForm_generalCountryGeoId");
        
        Select dd7=new Select(Dropdown7);
        
        dd7.selectByValue("IND");
        
     // // Select province 
        
     //  WebElement Dropdown8 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
        
    //   Select dd8=new Select(Dropdown8);
       
    //   dd8.selectByVisibleText("BIHAR");        
        
       
        driver.findElementByName("firstNameLocal").sendKeys("Kalai");
        
        driver.findElementByName("lastNameLocal").sendKeys("Vani");
        
        driver.findElementById("createLeadForm_personalTitle").sendKeys("Welcome");
        
        driver.findElementByName("generalProfTitle").sendKeys("create Lead");
        
        driver.findElementById("createLeadForm_annualRevenue").sendKeys("300000");
        
        driver.findElementByName("sicCode").sendKeys("637406");
        
        driver.findElementById("createLeadForm_description").sendKeys("my first program in Selenium");
        
        driver.findElementByName("importantNote").sendKeys("syntax");
        
        driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91");
        
        driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
        
        driver.findElementByName("primaryPhoneExtension").sendKeys("044");
        
        driver.findElementById("createLeadForm_departmentName").sendKeys("Testing");
        
        driver.findElementByName("numberEmployees").sendKeys("2000");
        
        driver.findElementByName("tickerSymbol").sendKeys("#");
        
        driver.findElementByName("primaryPhoneAskForName").sendKeys("Sugu");
        
        driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.Google.com");
        
        driver.findElementByName("generalToName").sendKeys("Sugumar");
        
        driver.findElementByName("generalAddress1").sendKeys("Dhandeeswaram");
        
        driver.findElementById("createLeadForm_generalAddress2").sendKeys("Velachery");
        
        driver.findElementByName("generalCity").sendKeys("Chennai");
        
        driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600042");
        
        driver.findElementByName("generalPostalCodeExt").sendKeys("44");
        
        driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9500637769");
        
        driver.findElementById("createLeadForm_primaryEmail").sendKeys("kalaijanu14@gmal.com");
        
        driver.findElementByClassName("smallSubmit").click();
        
        driver.findElementByXPath("//a[text()='Find Leads']").click();
        
        driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Kalaivani");
        
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[3]").isDisplayed();        
        
        
        
        
       
       
        
        
        
        

		// Click on Create Lead (Submit) button

		// Verify the Lead is created by checking the Company or First Name

	}

}


