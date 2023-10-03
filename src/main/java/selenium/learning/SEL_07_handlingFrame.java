package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class SEL_07_handlingFrame {
//	//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
//		// // switching to a frame by knowing its index
//		driver.switchTo().frame(2);
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();
//		Thread.sleep(5000);
//		driver.close();
//	}
//}
// ==================
//public class SEL_07_handlingFrame {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
//		// // // // // switching to a frame by knowing its name
//		driver.switchTo().frame("classFrame");
//		driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[2]/td[1]/a")).click();
//		Thread.sleep(5000);
//		driver.close();
//	}
//}
// =========
// switching from frame to top window
// driver.switchTo().defaultContent();

// /*
// * Navigation:
// *
// * > Launch the page > Switch to 3rd frame > Operate an element > Back to Top
// * window > Switch to 1st frame > Operate an element
// */
////
public class SEL_07_handlingFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.switchTo().frame(2); // Switch to 3rd frame
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();// Switch from 3rd frame to Top window
		Thread.sleep(5000);
		driver.switchTo().frame(0); // Switch to 1st frame

		driver.findElement(By.linkText("org.openqa.selenium")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
