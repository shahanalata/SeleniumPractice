import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URI;
import java.util.function.Predicate;

public class BasicAuthentification {
@Test
    public void basicAuth() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       // driver.get("https://the-internet.herokuapp.com/basic_auth");//internal pop-up for security
    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");//after slash username:password@
    //driver.get("https://the-internet.herokuapp.com/basic_auth");//not working,
    //search this url with npoint then check ii----the-internet.herokuapp.com, then /npoint(basicauth)
    //take id and password,we can handle this problem like this technique below:
    //https://username:password@url, then it bypass and run



    Thread.sleep(3000l);
    driver.quit();
    }
}
