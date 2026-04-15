package com.hitakshi.devops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    public void testTomcatHome() {
        System.setProperty("wdm.cachePath", System.getProperty("user.dir") + "/target/webdriver");
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); 
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("http://localhost:8081");
            String title = driver.getTitle();
            System.out.println("Page Title is: " + title);
            Assert.assertTrue(title.contains("Tomcat"), "Title should contain Tomcat");
        } finally {
            driver.quit();
        }
    }
}
