import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    public void testTomcatHome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Important for Jenkins!
        WebDriver driver = new ChromeDriver(options);
        
        driver.get("http://localhost:8081");
        String title = driver.getTitle();
        System.out.println("Page Title is: " + title);
        
        Assert.assertTrue(title.contains("Tomcat"), "Title should contain Tomcat");
        driver.quit();
    }
}