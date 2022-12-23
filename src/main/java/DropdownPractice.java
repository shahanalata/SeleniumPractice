import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement d = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select ss = new Select(d);
        ss.selectByVisibleText("Option2");
        driver.findElement(By.xpath("//button[text()='Home']")).click();
        Thread.sleep(3000l);
        String home_Page_Title = driver.getTitle();
        System.out.println( home_Page_Title);
        Thread.sleep(3000l);
        driver.navigate().back();
        String practice_Page_Title = driver.getTitle();
        System.out.println( practice_Page_Title);
        driver.navigate().refresh();
        Thread.sleep(3000l);
        driver.quit();






    }
}
