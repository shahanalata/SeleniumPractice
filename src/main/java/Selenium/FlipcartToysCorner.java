package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class FlipcartToysCorner {
    @Test
    public void ToysCorner() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
       // driver.findElement(By.xpath("//div[text()='Grocery']")).click();
       // System.out.println( driver.getTitle());

        WebElement ss = driver.findElement(By.xpath("//div[@class='_37M3Pb']//div[@class='eFQ30H'][9]//div[text()='Beauty, Toys & More']"));
       //div[@class='eFQ30H'][9]
        //div[@class='eFQ30H'][9]//a//div[2]
        //div[@class='eFQ30H'][9]//a//div[@class='_1psGvi SLyWEo']
        //div[@class='_37M3Pb']//div[@class='eFQ30H'][9]//div[text()='Beauty, Toys & More']*/
       //JavascriptExecutor js = (JavascriptExecutor)driver;
       //js.executeScript("arguments[0].scrollIntoView();",ss);
      Actions a = new Actions(driver);
      a.moveToElement(ss).perform();
        WebElement d = driver.findElement(By.xpath("//a[@class='_6WOcW9'][2]"));
        a.moveToElement(d).click().build().perform();
       // a.click().perform();
        System.out.println(driver.getTitle());


        //div[@class='_3XS_gI _7qr1OC']
      // a.contextClick().perform();
     //  a.clickAndHold().perform();
//a[@class='_6WOcW9']
      // Thread.sleep(3000l);
     // driver.quit();

    }
}