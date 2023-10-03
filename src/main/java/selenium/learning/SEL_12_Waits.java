package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// ===========================
//public class SEL_12_Waits {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		// // open google.com
//		driver.get("https://ashokonmi3.github.io/Selenium.Pages//ExplicitlyWait.html");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@id='alert']")).click();
//		Thread.sleep(3000);
//
//		try {
//			Alert ale = driver.switchTo().alert();
//			// Thread.sleep(3000);
//			String s = ale.getText();
//			// System.out.println(s);
//			ale.accept();
//		} catch (Exception E) {
//			System.out.println("Element not found closing the  browser");
//			driver.quit();
//		}
//	}
//}
// ==================
////
/*
 * Let us consider practical application in that we are having more the 8 pages
 * and 50 operations if we use Thread.sleep(10000) for 50 times then it is 500
 * seconds around 10 minutes, so the dead time is more but no one prefer to wait
 * .
 */
// ======================
/*
 * applicable only to driver.get() and driver.navigate().to() Page load timeout
 * in selenium requests/set the time limit for a page to load, If the page is
 * not loaded within the given time frame selenium throws TimeOutException
 * exception // // //
 */
//public class SEL_12_Waits {
//	public static void main(String[] args) {
//		// set chrome driver exe path
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.get("https://google.com");
//		// set the time of 30 seconds for page to complete the loading
//		System.out.println("loading completed");
//		driver.quit();
//	}
//}

// ===============================
/*
 *
 * Implicit Wait WebDriver waits for an element if they are not
 * immediately*available.So, WebDriver does not throw NoSuchElementException
 * immediately.* This is known as
 * 
 * implicitlyWait() Disadvantage(i) In any case, it blindly wait for given
 * seconds. (ii) Once set, the implicit wait is set for the life of the
 * WebDriver object instance. ////polling period is not 0.5 seconds
 * 
 */
//
//public class SEL_12_Waits {
//	//
//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.findElement(By.id("identifierId")).sendKeys("India");
//		driver.quit();
//	}
//}
// =============================
//public class SEL_12_Waits {
//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.get("https://www.google.com");
//		driver.findElement(By.id("identifierId")).sendKeys("India");
//		System.out.println("after the wait");
//		driver.quit();
//	}
//}

// If a test case is failing because of element not found we will get the error
// message only after 15 seconds.
//// ======================================

/*
 * Explicit Wait WebDriver waits for an element if they are not immediately
 * available. So, WebDriver does not throw NoSuchElementException immediately.
 * This is known as implicitlyWait() Disadvantage(i) In any case, it blindly
 * wait for given seconds. (ii) Once set, the implicit wait is set for the life
 * of the WebDriver object instance.Implicitly Wait is applicable only to
 * findElement and findElements no other statement in selenium. Explicit wait
 * polls the DOM every 500ms.
 */
//public class SEL_12_Waits {
//	public static void main(String[] args) throws InterruptedException {
//		// open firefox/
//		WebDriver driver = new ChromeDriver();
//		WebDriverWait wait = new WebDriverWait(driver, 6 /* timeout in seconds */);
//
//		// open google.com
//		driver.get("https://ashokonmi3.github.io/Selenium.Pages//ExplicitlyWait.html");
//		driver.findElement(By.xpath("//button[@id='alert']")).click();
//		// throws TimeoutException if no alert is present
//		wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println("alert popped up");
//		Thread.sleep(5000);
//		driver.switchTo().alert().dismiss();
//
//		Thread.sleep(5000);
//		driver.quit();
//
//	}
//}

// ===============
//
public class SEL_12_Waits {

	public static void main(String[] args) throws InterruptedException {
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://ashokonmi3.github.io/Selenium.Pages//SEL_12_Waits.html");
			driver.findElement(By.id("enable-button")).click();

			WebDriverWait wait = new WebDriverWait(driver, 30 /* timeout in seconds */);

			// throws TimeoutException if element does not become as clickable in given
			// time
			wait.until(ExpectedConditions.elementToBeClickable(By.id("disable")));
			// wait.until(ExpectedConditions.);
			Thread.sleep(5000);

			driver.findElement(By.id("enable-button")).click();
			Thread.sleep(5000);

			driver.quit();

		}
	}
}
// ====================
// The following are the Expected Conditions that can be used in Explicit Wait
// alertIsPresent()
// elementSelectionStateToBe()
// elementToBeClickable()
// elementToBeSelected()
// frameToBeAvaliableAndSwitchToIt()
// invisibilityOfTheElementLocated()
// invisibilityOfElementWithText()
// presenceOfAllElementsLocatedBy()
// presenceOfElementLocated()
// textToBePresentInElement()
// textToBePresentInElementLocated()
// textToBePresentInElementValue()
// titleIs()
// titleContains()
// visibilityOf()
// visibilityOfAllElements()
// visibilityOfAllElementsLocatedBy()
// visibilityOfElementLocated()
