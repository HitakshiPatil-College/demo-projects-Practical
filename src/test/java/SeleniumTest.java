import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager; // Add this import
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    public void testTomcatHome() {
        // 1. Fix Permissions: Save driver in project folder instead of System32
        System.setProperty("wdm.cachePath", System.getProperty("user.dir") + "/target/webdriver");
        
        // 2. Setup Driver automatically
        WebDriverManager.chromedriver().setup();

        // 3. Configure Headless Mode (Mandatory for Jenkins)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); 
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(options);
        
        try {
            // 4. Run the Test
            driver.get("http://localhost:8081");
            String title = driver.getTitle();
            System.out.println("Page Title is: " + title);
            
            Assert.assertTrue(title.contains("Tomcat"), "Title should contain Tomcat");
        } finally {
            // 5. Always close the browser
            driver.quit();
        }
    }
}import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager; // Add this import
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    public void testTomcatHome() {
        // 1. Fix Permissions: Save driver in project folder instead of System32
        System.setProperty("wdm.cachePath", System.getProperty("user.dir") + "/target/webdriver");
        
        // 2. Setup Driver automatically
        WebDriverManager.chromedriver().setup();

        // 3. Configure Headless Mode (Mandatory for Jenkins)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); 
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(options);
        
        try {
            // 4. Run the Test
            driver.get("http://localhost:8081");
            String title = driver.getTitle();
            System.out.println("Page Title is: " + title);
            
            Assert.assertTrue(title.contains("Tomcat"), "Title should contain Tomcat");
        } finally {
            // 5. Always close the browser
            driver.quit();
        }
    }
}import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager; // Add this import
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    public void testTomcatHome() {
        // 1. Fix Permissions: Save driver in project folder instead of System32
        System.setProperty("wdm.cachePath", System.getProperty("user.dir") + "/target/webdriver");
        
        // 2. Setup Driver automatically
        WebDriverManager.chromedriver().setup();

        // 3. Configure Headless Mode (Mandatory for Jenkins)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); 
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(options);
        
        try {
            // 4. Run the Test
            driver.get("http://localhost:8081");
            String title = driver.getTitle();
            System.out.println("Page Title is: " + title);
            
            Assert.assertTrue(title.contains("Tomcat"), "Title should contain Tomcat");
        } finally {
            // 5. Always close the browser
            driver.quit();
        }
    }
}import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager; // Add this import
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    public void testTomcatHome() {
        // 1. Fix Permissions: Save driver in project folder instead of System32
        System.setProperty("wdm.cachePath", System.getProperty("user.dir") + "/target/webdriver");
        
        // 2. Setup Driver automatically
        WebDriverManager.chromedriver().setup();

        // 3. Configure Headless Mode (Mandatory for Jenkins)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); 
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(options);
        
        try {
            // 4. Run the Test
            driver.get("http://localhost:8081");
            String title = driver.getTitle();
            System.out.println("Page Title is: " + title);
            
            Assert.assertTrue(title.contains("Tomcat"), "Title should contain Tomcat");
        } finally {
            // 5. Always close the browser
            driver.quit();
        }
    }
}