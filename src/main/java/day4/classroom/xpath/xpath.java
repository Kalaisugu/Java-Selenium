package day4.classroom.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class xpath {
	
	public static void main(String[] args) throws InterruptedException
	{
	
	// Set the property for ChromeDriver
    System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Maven\\Drivers\\chromedriver.exe");
    
	// Initiate the ChromeBroswer
   ChromeDriver driver=new ChromeDriver();
   
   driver.get("https://erail.in/trains-between-stations/");
   
   driver.findElementByXPath("//label[text()='Sort on Date']").click();
   
   driver.findElementById("chkSelectDateOnly").click(); 
   Thread.sleep(3000);
   WebElement Table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
   
   List<WebElement> rows = Table.findElements(By.tagName("tr"));
   
   for (int i = 0; i < rows.size(); i++)
   {
	   
	   List<WebElement> column = rows.get(i).findElements(By.tagName("td"));
	   System.out.println(column.get(1).getText());
	
}
   
  }
   
 }


