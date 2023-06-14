import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class ThirdTest {

    @Test
    public void firstTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String[] names = {"Cucumber", "Brocolli", "Beetroot"};
        List<String> arrayOfVeget = Arrays.asList(names);

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

        for (int j = 0; j < products.size(); j++) {
            String[] nameOfVeg = products.get(j).getText().split("-");
            String formattedName = nameOfVeg[0].trim();

            if (arrayOfVeget.contains(formattedName)) {
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(j).click();
                Thread.sleep(2000);
            }
        }

        driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
        driver.quit();
    }


}
