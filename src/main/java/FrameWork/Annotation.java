package FrameWork;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation {

	public ChromeDriver driver;

	public String filename;

	@BeforeMethod
	@Parameters({"url","username","password"})

	public void login(String url,String unam,String pass)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Maven\\Drivers\\chromedriver.exe");

		// Initiate the ChromeBroswer
		driver=new ChromeDriver();

		// Maximize the browser

		driver.manage().window().maximize();
		driver.get(url);

		// Enter the UserName
		driver.findElementById("username").sendKeys(unam);;



		// Enter the Password
		driver.findElementById("password").sendKeys(pass);

		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();

		// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Leads").click();

	}
	@AfterMethod

	public void logout()
	{
		driver.close();
	}

	@DataProvider

	public String[][] getData() throws IOException
	{
		//String[][] data=new String[2][3];

		/*	data[0][0]="Testleaf";
		data[0][1]="Kalaivani";
		data[0][2]="Sugumar";


		data[1][0]="Testleaf";
		data[1][1]="Sugumar";
		data[1][2]="Janathanam";*/

		LearnExcel data =new LearnExcel();

		return data.learnexcel(filename);





	}	

}


