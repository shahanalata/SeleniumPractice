import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("openwindow")).click();
        Set<String> window = driver.getWindowHandles();
       // driver.getWindowHandle();//single window
        //window handles -graps all will window and store in a string format
        Iterator<String> it = window.iterator();// to get method-next, we convert window to iterator
        String parent = it.next();
        String child = it.next();
       // String secondChild = it.next();
        driver.switchTo().window(parent);
        String title = driver.getTitle();
        System.out.println(title);
        driver.switchTo().window(child);
        String titleTwo = driver.getTitle();
        System.out.println(titleTwo);
        driver.switchTo().window(parent);
        String c = driver.getTitle();
        System.out.println(c);


        Thread.sleep(3000l);
        driver.quit();//quit the whole browser which opened by selenium
       // driver.close();//close the current page



    }
}
