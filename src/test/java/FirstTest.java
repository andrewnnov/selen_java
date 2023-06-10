import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest  {

    @Test
    public void firstTest() {
        //System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys("Bla bla");
        driver.findElement(By.name("inputPassword")).sendKeys("Bla Bla");
        driver.findElement(By.className("signInBtn")).click();
        String textFromPage = driver.findElement(By.cssSelector("p[class='error']")).getText();
        System.out.println(textFromPage);



        //driver.quit();
    }

    @Test
    public void firstTestFF() {
        //System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com");
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getCurrentUrl());
        //driver.quit();
    }
}
