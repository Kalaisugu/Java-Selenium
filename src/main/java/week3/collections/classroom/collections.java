package week3.collections.classroom;



import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class collections {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Maven\\Drivers\\chromedriver.exe");
	    
		
	   ChromeDriver driver=new ChromeDriver();
	   
	   driver.get("https://erail.in/trains-between-stations/");
	   
	   
	  WebElement From = driver.findElementById("txtStationFrom");
	   
	   From.clear();
	   
	   From.sendKeys("MAS",Keys.TAB);
	   
	   WebElement To = driver.findElementById("txtStationTo");
	   
	   To.clear();
	   
	   To.sendKeys("SBC",Keys.TAB);
	   
	   driver.findElementByXPath("//label[text()='Sort on Date']").click();
	   
	   //driver.findElementById("chkSelectDateOnly").click();
	   
	// WebElement Table = driver.findElementByXPath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//td[2]");
	 
	 List<WebElement> Alltrainnames = driver.findElements(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//td[2]"));
	   
	   System.out.println("Alltrain names:"+Alltrainnames.size());
	   
	   Set<String> uniquetrainnames = new HashSet<String>();
	   
	   for (WebElement eachtrain : Alltrainnames) 
	   
	   {
		   
		   String eachtrainname= eachtrain.getText();
		   uniquetrainnames.add(eachtrainname);
		   
	}
	   
	   int size=uniquetrainnames.size();
	   System.out.println("unique train names:"+size);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

	}

}
