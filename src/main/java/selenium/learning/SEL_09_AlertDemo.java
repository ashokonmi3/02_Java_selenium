package selenium;

// public class SEL_09_AlertDemo {
// // //
// public static void main(String[] args) throws NoAlertPresentException,
// InterruptedException {
// WebDriver driver = new ChromeDriver();
// //
// driver.get("file:///C:/My/Study/Python_Selenium/files/Practice_handling_Alerts.html");
// driver.get("https://ashokonmi3.github.io/Selenium.Pages/Practice_handling_Alerts.html");
// driver.findElement(By.name("alert")).click();
// Alert ale = driver.switchTo().alert();
// Thread.sleep(3000);
// String s = ale.getText();
// System.out.println(s);
// ale.accept();
// Thread.sleep(5000);
// if (s.equals("I am alert")) {
// System.out.println("TEST PASS");
// }
// driver.quit();
//
// }
// }

// =========================
// Confirmation box
// public class SEL_09_AlertDemo {
// public static void main(String[] args) throws NoAlertPresentException,
// InterruptedException {
// WebDriver driver = new ChromeDriver();
// driver.get("https://ashokonmi3.github.io/Selenium.Pages/Practice_handling_Alerts.html");
// driver.findElement(By.name("confirmation")).click();
// Alert ale = driver.switchTo().alert();
// Thread.sleep(5000);
// String s = ale.getText();
// System.out.println(s);
// ale.dismiss();
// Thread.sleep(5000);
// driver.quit();
// }
// }

// =======================
// public class SEL_09_AlertDemo {
//
// public static void main(String[] args) throws NoAlertPresentException,
// InterruptedException, AWTException {
// WebDriver driver = new ChromeDriver();
// driver.get("https://ashokonmi3.github.io/Selenium.Pages/Practice_handling_Alerts.html");
// driver.findElement(By.name("prompt")).click();
// Alert ale = driver.switchTo().alert();
// Thread.sleep(2000);
// Robot rb = new Robot();// java.awt
// rb.keyPress(KeyEvent.VK_0);
// rb.keyRelease(KeyEvent.VK_0);
// rb.keyPress(KeyEvent.VK_1);
// rb.keyRelease(KeyEvent.VK_1);
// rb.keyPress(KeyEvent.VK_A);
// rb.keyRelease(KeyEvent.VK_A);
// rb.keyPress(KeyEvent.VK_B);
// rb.keyRelease(KeyEvent.VK_B);
// rb.keyPress(KeyEvent.VK_SHIFT);
// rb.keyPress(KeyEvent.VK_S);
// rb.keyRelease(KeyEvent.VK_S);
// rb.keyRelease(KeyEvent.VK_SHIFT);
// Thread.sleep(5000);
// driver.quit();
//
// }
// }

// ======================
