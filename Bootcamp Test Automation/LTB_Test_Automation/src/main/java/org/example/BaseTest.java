package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest extends Data {
    public static WebDriver driver;


    @BeforeClass
    public static void beforeTest() {
        if (browser.equals("Chrome")) {
            driver = new ChromeDriver();
        }
        else if (browser.equals("Firefox")) {
            driver = new FirefoxDriver();
        }
        else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.get("https://www.ltbjeans.com/tr-TR");
        driver.manage().window().maximize();

    }

    @AfterClass
    public static void afterTest() {driver.quit();
    }
}
