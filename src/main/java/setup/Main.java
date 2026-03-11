package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Input;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class Main {
  static protected WebDriver driver;
  static {
    chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
    driver = new ChromeDriver(options);
  }

  public static void main(String[] args) throws InterruptedException {
    driver.get("https://www.selenium.dev/selenium/web/formPage.html");

    System.out.println("Title: " + driver.getTitle());
    // WebElement element =
    // driver.findElement(By.xpath("//input[@value='Click!']"));
    // Thread.sleep(5000);
    // element.click();
    WebElement inputElement = driver.findElement(By.id("inputWithText"));
    inputElement.clear();
    inputElement.sendKeys("enes");
    Thread.sleep(6000);
    // driver.quit();
  }
}