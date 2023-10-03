package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// =====================================
// Partial Link
//public class SEL_04_HandleLink {
//	public static void main(String[] args) throws InterruptedException {
//		String baseUrl = "https://ashokonmi3.github.io/Selenium.Pages/FindElements.html";
//		WebDriver driver = new ChromeDriver();
//		driver.get(baseUrl);
//		Thread.sleep(5000);
//		driver.findElement(By.partialLinkText("Selenium")).click();
//		System.out.println("title of page is: " + driver.getTitle());
//		Thread.sleep(3000);
//		driver.navigate().back();
//		driver.findElement(By.linkText("Selenium Webdriver")).click();
//		Thread.sleep(3000);
//		System.out.println("title of page is: " + driver.getTitle());
//		driver.quit();
//	}
//}
// ===========================
//
public class SEL_04_HandleLink {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "http://demo.guru99.com/selenium/newtours/";
		WebDriver driver = new ChromeDriver();

		String underConsTitle = "Under Construction: Mercury Tours";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get(baseUrl);
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));// util
		String[] linkTexts = new String[linkElements.size()];
		int i = 0;

		// extract the link texts of each link element
		for (WebElement e : linkElements) {
			linkTexts[i] = e.getText();
			i++;
		}

		// test each link
		for (String t : linkTexts) {
			driver.findElement(By.linkText(t)).click();
			Thread.sleep(2000);
			if (driver.getTitle().equals(underConsTitle)) {
				System.out.println("\"" + t + "\"" + " is under construction.");
			} else {
				System.out.println("\"" + t + "\"" + " is working.");
			}
			driver.navigate().back();
		}
		driver.quit();
	}
}
////// ===========================
