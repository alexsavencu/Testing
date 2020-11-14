
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class GmailDemo {

    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();

        driver.manage().deleteAllCookies();

        String url = "https://accounts.google.com/signin";

        driver.get(url);

        driver.findElement(By.id("identifierId")).sendKeys("alex.savencu97@gmail.com");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.className("VfPpkd-RLmnJb")).click();

        WebDriverWait wait = new WebDriverWait(driver, 20);

        WebElement password = driver.findElement(By.xpath("//span[@class='whsOnd zHQkBf']"));

        wait.until(ExpectedConditions.elementToBeClickable(password));

        password.sendKeys("your_password");

        //driver.findElement(By.id("passwordNext")).click();

        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("asassassa");

        //driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

    }

}

