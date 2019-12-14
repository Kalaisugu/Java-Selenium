package week4.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) {

		System.setProperty ("webdriver.chrome.driver","C:\\Selenium\\Maven\\Drivers\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leafground.com/pages/Window.html");

		driver.manage().window().maximize();

		driver.findElementByXPath("//button[.='Open Multiple Windows']").click();

		Set<String> windowHandles = driver.getWindowHandles();

		System.out.println(windowHandles.size());

		List<String> lst=new ArrayList<String>(windowHandles);

		String lastw = lst.get(windowHandles.size()-1);

		//String lastw = lst.get(1);

		driver.switchTo().window(lastw);

		String title = driver.getTitle();

		System.out.println(title);

		driver.quit();





	}

}
