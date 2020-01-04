package Project;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Maven\\Drivers\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.findElementById("twotabsearchtextbox").sendKeys("oneplus 7 pro mobiles",Keys.ENTER);

		WebElement price = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]");

		System.out.println("First Resulting Price:"+price.getText());

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByXPath("//img[@alt='OnePlus 7 Pro (Nebula Blue, 8GB RAM, Fluid AMOLED Display, 256GB Storage, 4000mAH Battery)']").click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> lst=new ArrayList<String>(windowHandles);

		String nxt = lst.get(1);

		driver.switchTo().window(nxt);

		WebElement Ratings = driver.findElementById("averageCustomerReviews_feature_div");

		System.out.println(Ratings.getText());

		driver.findElementById("add-to-cart-button").click();

		WebElement Addedtocart = driver.findElementById("huc-v2-order-row-messages");

		System.out.println(Addedtocart.getText());

		driver.findElementByXPath("(//a[@id='hlb-ptc-btn-native'])[1]").click();

		String title = driver.getTitle();

		System.out.println(title);

		driver.findElementByClassName("a-button-input").click();

		WebElement error = driver.findElementByXPath("(//div[@class='a-box-inner a-alert-container'])[2]");

		System.out.println(error.getText());

		driver.quit();





	}

}
