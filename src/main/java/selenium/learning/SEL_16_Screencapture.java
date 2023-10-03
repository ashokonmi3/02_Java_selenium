package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEL_16_Screencapture {

	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		Thread.sleep(3000);
		File src = screenshot.getScreenshotAs(OutputType.FILE); // Get the screenshot as an image File

		// Take screenshot and store as a file format
		// File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		String currentDirectory = System.getProperty("user.dir");
		System.out.println("Current directory " + currentDirectory);

		// File fileObject = new File(currentDirectory + "\\CreateDir");// Create a
		//
		try {
			// now copy the screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File("C:\\My\\users\\eclipse-workspace\\Selenium\\src\\selenium\\error.png"));
			System.out.println("Scrren captured");
		}

		catch (IOException e) {
			System.out.println(e.getMessage());

		}
		driver.quit();
	}
}