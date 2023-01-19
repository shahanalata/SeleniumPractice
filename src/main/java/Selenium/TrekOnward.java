package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TrekOnward {
    @Test
    public void tekOnward(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver. manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.trekonward.com/filter/");
        driver.findElement(By.xpath("//input[@id='searchName_value']")).sendKeys("Harvard");
        WebElement sd = driver.findElement(By.xpath("//div[@class='angucomplete-title ng-binding ng-scope']"));
        Actions a = new Actions(driver);
        a.moveToElement(sd).click().build().perform();
        WebElement ss = driver.findElement(By.xpath("//button[@class='btn btn-warning home-search-button']"));
        a.moveToElement(ss).click().build().perform();
        driver.findElement(By.xpath("//div[@class='record-header__school-name']//a")).click();
        Set<String> window = driver.getWindowHandles();
        Iterator<String> it = window.iterator();// to get method-next, we convert window to iterator
        String parent = it.next();
        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());

        WebElement table = driver.findElement(By.xpath("//div[@class='blurb section-details'][5]"));
       // JavascriptExecutor js=(JavascriptExecutor)driver;
       // js.executeScript("argument[0],scrollintoview();", table);
//div[@class='blurb section-details'][5]//div//table//tbody//tr[2]//td[2]
        a.moveToElement(table).perform();
        List<WebElement> position =driver.findElements(By.xpath("//div[@class='blurb section-details'][5]//div//table//tbody//tr[2]//td[2]"));
        System.out.println(position.size());
        for(WebElement e : position) {
            String value=e.getText();
            System.out.println(e.getText());

        }
        driver.quit();
    }
}
