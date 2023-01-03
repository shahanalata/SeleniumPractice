package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Suggestive_Drop_Down {


    @Test
    public void auto_Suggestive_Drop_Down() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("rea");
        Thread.sleep(3000);
        List<WebElement> allCountryNames = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li//div"));
        System.out.println(allCountryNames.size());
        for (int i = 0; i < allCountryNames.size(); i++) {
            System.out.println( allCountryNames.get(i).getText());
            String countryNames = allCountryNames.get(i).getText();
            if (countryNames.equals("Korea")) {
                allCountryNames.get(i).click();
            }
        }
        driver.quit();
    }
}









