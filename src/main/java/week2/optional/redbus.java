package week2.optional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class redbus {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Maven\\Drivers\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Actions builder=new Actions (driver);

		WebElement from = driver.findElementByXPath("//input[@data-message='Please enter a source city']");

		from.sendKeys("Chennai",Keys.TAB);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement to = driver.findElementByXPath("//input[@data-message='Please enter a destination city']");

		to.sendKeys("Trichy",Keys.TAB);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Date date=new Date();

		DateFormat sdf=new SimpleDateFormat("dd");

		String today = sdf.format(date);

		int tomm = Integer.parseInt(today)+3;

		System.out.println(tomm);
		
		String tomday = String.valueOf(tomm);
		
		driver.findElementByXPath("//label[@class='db text-trans-uc move-up']").click();;
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));

           for (WebElement ele : alldates) {
        	   
        	   String date1 = ele.getText();
        	   
        	   if(date1.equalsIgnoreCase(tomday))
        	   {
        		   ele.click();
        		   break;
        		   
        	   }
        	   
        	 }
           
         //  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
           
        //   driver.findElementById("search_btn").click();
           
         
	}

}
