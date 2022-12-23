import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HurakoApp {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
        //in a html, tag is select that is select dropdown
        WebElement d = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select s = new Select(d);  //in a select class, argument is webelement
       // s.selectByIndex(1);  // indexing is not prefer-last option
        s.selectByVisibleText("Option 2");//text selection is first choice
       // s.selectByValue("2");




        Thread.sleep(3000l);
        driver.quit();
    }
}
