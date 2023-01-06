package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class PracticeNestedFrame {

    @Test

    public void NestedFrameThree() throws InterruptedException {
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

        Thread.sleep(3000);
        WebElement leftChild = driver.findElement(By.xpath("//frame[@name='frame-left']"));
        driver.switchTo().parentFrame().switchTo().frame(leftChild);
        a.doubleClick().perform();

        Thread.sleep(2000l);
        WebElement middleChild = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
        driver.switchTo().frame(middleChild);
        a.doubleClick().perform();

        Thread.sleep(3000);
        WebElement rightChild = driver.findElement(By.xpath("//frame[@name='frame-right']"));
        driver.switchTo().frame(rightChild);
        driver.switchTo().defaultContent();


        a.doubleClick().perform();

        Thread.sleep(3000);;


        driver.quit();
    }
}



