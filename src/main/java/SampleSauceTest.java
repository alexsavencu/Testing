import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import org.openqa.selenium.safari.SafariDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SampleSauceTest {

    public static void main(String[] args) {

        // Instantiate a SafariDriver class.
        WebDriver driver = new SafariDriver();

        // Launch Website
        driver.navigate().to("http://www.google.com/");

        // Click on the search text box and send value
        driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");

        // Click on the search button
        driver.findElement(By.name("btnK")).click();

        // Close the Browser
        driver.close();

    }
}
