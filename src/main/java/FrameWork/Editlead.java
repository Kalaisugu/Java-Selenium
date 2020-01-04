package FrameWork;

		import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

	public class Editlead extends Annotation{
		
		@BeforeClass
		public void setData() {
			filename = "Editlead";
		}
		
		@Test(dataProvider="getData")
		
		public void runEditLead(String cName, String fName, String lName,String Mobile) throws InterruptedException {
			driver.findElementByLinkText("Find Leads").click();
			driver.findElementByXPath("//span[text()='Phone']").click();
			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
			driver.findElementByLinkText("Edit").click();
			driver.findElementById("updateLeadForm_companyName").clear();
			
			driver.findElementByName("submitButton").click();
//			driver.close
	}
	}



