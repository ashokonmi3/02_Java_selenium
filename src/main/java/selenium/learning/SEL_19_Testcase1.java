package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEL_19_Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_%28software%29");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create account")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("wikipedia.org")) {
			System.out.println("It is an Internal Link -Passed");
		} else {
			System.out.println("It is an External Link - Failed");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("selenium.dev/")).click(); // click
		Thread.sleep(2000);
		System.out.println("URL is: " + driver.getCurrentUrl());
		if (driver.getCurrentUrl().contains("selenium.dev/")) {
			System.out.println("It is an External Link -pass");
		} else {

			System.out.println("It is an Internal Link - failed");
		}
		driver.close();

	}

}
