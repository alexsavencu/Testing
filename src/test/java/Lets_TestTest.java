import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
//import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

class Lets_TestTest {

    @Test
    public void demo(){
        WebDriver driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://admin.typeform.com/signup");
        //driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//button[@class='optanon-allow-all accept-cookies-button']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("TEST");
        driver.findElement(By.xpath("//button[@data-qa='button-submit']")).click();
        try{
            driver.findElement(By.xpath("//span[@data-qa='error-bad-email-address']"));
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }

    }



}