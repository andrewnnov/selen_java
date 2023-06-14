import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest  {

    @Test
    public void firstTest() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys("admin");
        driver.findElement(By.name("inputPassword")).sendKeys("admin");
        driver.findElement(By.className("signInBtn")).click();
        String textFromPage = driver.findElement(By.cssSelector("p[class='error']")).getText();
        System.out.println(textFromPage);
        driver.findElement(By.linkText("Forgot your password?")).click();

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("John@google.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("John@google.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("78765654466");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
        String text = driver.findElement(By.cssSelector("form p")).getText();
        System.out.println(text);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        Thread.sleep(1000);
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//input[@name='chkboxOne']")).click();
        driver.findElement(By.xpath("//input[@name='chkboxTwo']")).click();
        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
        Thread.sleep(1000);





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
