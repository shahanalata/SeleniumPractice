import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DragDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        WebElement frame = driver.findElement(By.tagName("iframe"));//tagname start with iframe
       // List<WebElement> totalFrame = driver.findElements(By.tagName("iframe"));//collection--use list bcz(iframe) follow index number
      //  totalFrame.size();           //for css selector----#id, .class
      //  System.out.println("total frame "+totalFrame.size());
        driver.switchTo().frame(frame);

        WebElement Source  = driver.findElement(By.xpath("//*[@id='draggable']"));//which we drag(start from here)
        WebElement target = driver.findElement(By.id("droppable"));//where we drop
        Actions ac = new Actions(driver);
        ac.dragAndDrop(Source, target).build().perform();//

        driver.switchTo().defaultContent();
        Thread.sleep(3000l);
        driver.findElement(By.xpath("//*[text()='Draggable']")).click();

        Thread.sleep(3000l);
        driver.quit();
    }
}
