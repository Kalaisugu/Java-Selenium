package FrameWork;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateLead extends Annotation{
	@BeforeClass
	public void setData() {
		filename = "createLead";
	}
	
	@Test(dataProvider="getData")
	public void runCreateLead(String cName, String fName, String lName,String Mobile) {
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(Mobile);
		driver.findElementByName("submitButton").click();
//		driver.close();
	}
}
