import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondTest {

    @Test
    public void firstTest() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        String actualText = driver.findElement(By.tagName("p")).getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, "You are successfully logged in.");

        driver.findElement(By.xpath("//button[@class='logout-btn']"));

        driver.quit();
    }
}
