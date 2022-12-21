import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirst {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
         driver.get("https://rahulshettyacademy.com/AutomationPractice/");
         driver.findElement(By.xpath("//input[@value='radio3']")).click();
        driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("South Korea");
        driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
        driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Shahana");
        driver.findElement(By.xpath("//input[@name='show-hide']")).sendKeys("Ahmed");
       driver.findElement(By.xpath("//input[@value='Confirm']")).click();
        String alertmsg = driver.switchTo().alert().getText();
        System.out.println(alertmsg);
       driver.switchTo().alert().accept();
        //page text print
        String pageheader =driver.findElement(By.xpath("//h1")).getText();
        System.out.println(pageheader);

//how to handle mouse hover
        WebElement scrollTo = driver.findElement(By.xpath("//button[@id='mousehover']"));
        JavascriptExecutor js = (JavascriptExecutor)driver ;//type cast(webdriver class k interface e type cast)
        js.executeScript("arguments[0].scrollIntoView();",scrollTo);
   Thread.sleep(3000l);
        WebElement scrollTwo =driver.findElement(By.xpath("//a[text()='Latest News']"));
        js.executeScript("arguments[0].scrollIntoView();",scrollTwo);
        Thread.sleep(3000l);
        WebElement scrollThree =driver.findElement(By.xpath("//h1[text()='Practice Page']"));//h1
        js.executeScript("arguments[0].scrollIntoView();",scrollThree);
        Thread.sleep(3000l);
       driver.quit();

    }
}
