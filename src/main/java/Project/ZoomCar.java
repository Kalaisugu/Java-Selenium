package Project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Maven\\Drivers\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.zoomcar.com/chennai");

		driver.manage().window().maximize();

		driver.findElementByXPath("//a[text()='Start your wonderful journey']").click();

		driver.findElementByXPath("(//div[@class='items'])[3]").click();

		driver.findElementByClassName("proceed").click();

		Date date=new Date();

		DateFormat sdf=new SimpleDateFormat("dd");

		String today = sdf.format(date);

		Integer tomorrow = Integer.parseInt(today)+1;

		System.out.println(tomorrow);
		
		String tom = String.valueOf(tomorrow);


		driver.findElementByXPath("//div[@class='days']//div[contains(text(),'"+tom+"')]").click();

		driver.findElementByClassName("proceed").click();

		WebElement day = driver.findElementByXPath("//div[@class='day picked ']");

		if(tom.contains(tomorrow+""))
		{

			driver.findElementByXPath("//button[contains(text(),'Done')]").click();
		}
		else {
			System.out.println("Date verification failed");
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> count = driver.findElementsByClassName("price");
		
		int c = count.size();
		
		System.out.println(c);
		
		List<Integer> a=new ArrayList<>();
		
		
		for (WebElement price : count) {
			
			String v = price.getText();
			
			String price1 = v.replaceAll("\\D","");
			
			//System.out.println(price1);
			
	       int value = Integer.parseInt(price1);
	       
	       a.add(value);
	       
	      	}
		
		 //System.out.println(a);
		 
		 Collections.sort(a);
		 
		System.out.println(a);
		 
		 System.out.println(a.get(c-1));
		 
		 driver.findElement(By.xpath("(//button[text()='BOOK NOW'])[13]")).click();
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		driver.quit();
		
}
		
}



















	


