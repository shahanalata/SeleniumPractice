import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatePractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String practice_Page_Title = driver.getTitle();
        System.out.println(practice_Page_Title );
        driver.navigate().to("https://www.google.com/");
        String google_Page_Title = driver.getTitle();
        System.out.println(google_Page_Title);
        Thread.sleep(3000l);
        driver.navigate().back();
        Thread.sleep(3000l);
        driver.navigate().forward();
        Thread.sleep(3000l);
        driver.navigate().refresh();
        Thread.sleep(3000l);
        driver.quit();
    }
}
