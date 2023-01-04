package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FlipCart {

    @Test
     public void Suggestive_Drop_Down() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
       //driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.cssSelector("._3704LK")).sendKeys("iphone14");
        Thread.sleep(3000);
       List<WebElement> allNames = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']"));
        System.out.println(allNames.size());
        for (int i = 0; i < allNames.size(); i++) {
            System.out.println( allNames.get(i).getText());
            String Names = allNames.get(i).getText();
            Thread.sleep(2000l);
            if (Names.equalsIgnoreCase("iphone14cover")) {
                allNames.get(i).click();
            }
        }
        Thread.sleep(3000l);
        driver.quit();
    }
}
