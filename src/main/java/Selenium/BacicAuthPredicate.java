package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URI;
import java.util.function.Predicate;

public class BacicAuthPredicate {
    @Test
    public void basicAuthPredicate(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Predicate<URI> uriPredicate = uri -> uri.getHost().contains("the-internet.herokuapp.com");
        ((HasAuthentication) driver).register(uriPredicate, UsernameAndPassword.of("admin", "admin"));
        driver.get("http://the-internet.herokuapp.com/basic_auth");
        driver.quit();

    }
}
