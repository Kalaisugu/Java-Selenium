package day3.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import FrameWork.Annotation;


import java.util.List;
import java.util.concurrent.TimeUnit;


public class Duplicatelead extends Annotation{
	
@Test
	
	public void duplicatelead() {
	
	{
		
         driver.findElementByXPath("//a[text()='Find Leads']").click();
         
         driver.findElementByXPath("(//a[@class='x-tab-right'])[3]").click();
         
         driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("kalaijanu14@gmal.com");
         
         driver.findElementByXPath("//button[text()='Find Leads']").click();
         
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         
         WebElement name = driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10231'])[4]");       

         System.out.println(name.getText());
         
         name.click();
         
         driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
         
         WebElement dlead = driver.findElementById("sectionHeaderTitle_leads");
         
        System.out.println(dlead.getText()); 
        
        driver.findElementByXPath("//input[@name='submitButton']").click();
        
        WebElement dname = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']");
        
       System.out.println(dname.getText());
        
        if (name.equals(dname))
        {
        	System.out.println("true");
        }
        
       
          }
}
}
         
         
         
         
         
	
