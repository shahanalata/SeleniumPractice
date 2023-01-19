package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipcartFashion {
    @Test
    public void flipFashion() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
        WebElement ss = driver.findElement(By.xpath("//div[@class='eFQ30H'][3]//div[text()='Fashion']"));
        Actions a = new Actions(driver);
        a.moveToElement(ss).perform();
        WebElement dd = driver.findElement(By.xpath("//a[@class='_6WOcW9'][5]"));
        a.moveToElement(dd).click().build().perform();
        System.out.println(driver.getTitle());
        driver.quit();
    }
}