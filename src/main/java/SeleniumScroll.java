import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumScroll {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement ss = driver.findElement(By.xpath("//button[@id='mousehover']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(3000l);
        js.executeScript("arguments[0].scrollIntoView();",ss);
        //Mouse interacetion /mouse ajex(we use Action class to do all mouse task)
        Actions a = new Actions(driver);// driver move to action(mouse hover mode)
        a.moveToElement(ss).perform();
        a.moveToElement(driver.findElement(By.xpath("//a[text()='Reload']"))).click().perform();
       /* WebElement sd = driver.findElement(By.xpath("//a[text()='Latest News']"));
        Thread.sleep(3000l);
        js.executeScript("arguments[0].scrollIntoView();",sd);
        WebElement sdd = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
        Thread.sleep(3000l);
        js.executeScript("arguments[0].scrollIntoView();",sdd);*/
        Thread.sleep(3000l);
        driver.quit();
    }
}
