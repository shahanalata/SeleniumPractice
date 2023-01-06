package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class NestedFrame {

    @Test
    public void nestedFrames() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/nested_frames");
        Actions a = new Actions(driver);
        List<WebElement> e = driver.findElements(By.tagName("frame"));
        System.out.println(e.size());
        WebElement parentTop =driver.findElement(By.xpath("//frame[@name='frame-top']"));
        driver.switchTo().frame(parentTop);
        List <WebElement> b = driver.findElements(By.tagName("frame"));
        System.out.println(b.size());
        a.doubleClick().perform();
        Thread.sleep(3000);;
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));
        a.doubleClick().perform();
        Thread.sleep(3000);;
        driver.switchTo().parentFrame().switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
        a.doubleClick().perform();
        Thread.sleep(3000);;
        driver.switchTo().parentFrame().switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));
        driver.switchTo().defaultContent();


        a.doubleClick().perform();

        Thread.sleep(3000);;


        driver.quit();
    }
}
